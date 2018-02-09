package testchain;

import com.google.gson.GsonBuilder;
import java.security.Security;
import java.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import testchain.util.StringUtil;

public class TestChain {

    public static HashMap<String,TransactionOutput> UTXOs = new HashMap<String,TransactionOutput>(); //list of all unspent transactions. 
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 4;
    public static float minimumTransaction = 0.1f;
    public static Wallet walletA;
    public static Wallet walletB;
    public static Transaction genesisTransaction;
    HackyUI HUI;

    public TestChain(){
        //Setup Bouncey castle as a Security Provider
	Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider()); 
	//Create the new wallets
	walletA = new Wallet();
	walletB = new Wallet();
    }
    
    public boolean checkIfValid(){
        return isChainValid();
    }
    
    public void generateGenesisBlock(){
        Wallet coinbase = new Wallet();
        genesisTransaction = new Transaction(coinbase.publicKey, walletA.publicKey, 100f, null);
	genesisTransaction.generateSignature(coinbase.privateKey);	 //manually sign the genesis transaction	
	genesisTransaction.transactionId = "0"; //manually set the transaction id
	genesisTransaction.outputs.add(new TransactionOutput(genesisTransaction.reciepient, genesisTransaction.value, genesisTransaction.transactionId)); //manually add the Transactions Output
	UTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0)); //its important to store our first transaction in the UTXOs list.
	
	
	Block genesis = new Block("0");
	genesis.addTransaction(genesisTransaction);
	addBlock(genesis);
    }
    
    public float getWalletBalance(int index){
        float result = 0;
        if (0 == index) result = walletA.getBalance();
        else if (1 == index) result = walletB.getBalance();
        return result;
    }
    
    public void sendFunds(int from, int to, float amount){
        if (0 == from){
            String previousHash = blockchain.get(blockchain.size()-1).hash;
            Block block = new Block(previousHash);
            blockchain.get(blockchain.size()-1).addTransaction(walletA.sendFunds(walletB.publicKey, amount));
            addBlock(block);
        }
        if (1 == from){
            String previousHash = blockchain.get(blockchain.size()-1).hash;
            Block block = new Block(previousHash);
            blockchain.get(blockchain.size()-1).addTransaction(walletB.sendFunds(walletA.publicKey, amount));
            addBlock(block);
        }
    }
    
    public Boolean isChainValid() {
	Block currentBlock; 
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		HashMap<String,TransactionOutput> tempUTXOs = new HashMap<String,TransactionOutput>(); //a temporary working list of unspent transactions at a given block state.
		tempUTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0));
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				return false;
			}
			
			//loop thru blockchains transactions:
			TransactionOutput tempOutput;
			for(int t=0; t <currentBlock.transactions.size(); t++) {
				Transaction currentTransaction = currentBlock.transactions.get(t);
				
				if(!currentTransaction.verifiySignature()) {
					return false; 
				}
				if(currentTransaction.getInputsValue() != currentTransaction.getOutputsValue()) {
					return false; 
				}
				
				for(TransactionInput input: currentTransaction.inputs) {	
					tempOutput = tempUTXOs.get(input.transactionOutputId);
					
					if(tempOutput == null) {
						return false;
					}
					
					if(input.UTXO.value != tempOutput.value) {
						return false;
					}
					
					tempUTXOs.remove(input.transactionOutputId);
				}
				
				for(TransactionOutput output: currentTransaction.outputs) {
					tempUTXOs.put(output.id, output);
				}
				
				if( currentTransaction.outputs.get(0).reciepient != currentTransaction.reciepient) {
					return false;
				}
				if( currentTransaction.outputs.get(1).reciepient != currentTransaction.sender) {
					return false;
				}
				
			}
			
		}
		System.out.println("Blockchain is valid");
		return true;
}
    
    public void addBlock(Block newBlock) {
        newBlock.mineBlock(difficulty);
	blockchain.add(newBlock);
	}
    
    public String mineMostRecentBlock(){
        String theHash = blockchain.get(blockchain.size()-1).mineBlock(difficulty);
        return theHash;
    }
    
    public void setDifficulty(int newDiff){
        difficulty = newDiff;
    }
    
    public int getDifficulty(){
        return difficulty;
    }
    
    public String ViewBlockchain(){
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        return blockchainJson;
    }
    
    public String ViewLastBlock(){
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain.get(blockchain.size()-1));
        return blockchainJson;
    }
}
