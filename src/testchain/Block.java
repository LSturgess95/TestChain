package testchain;

import java.util.Date;
import java.util.ArrayList;
import testchain.util.StringUtil;

public class Block {
    
    public String hash;
    public String previousHash;
    public String merkleRoot;
    public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private long timeStamp; //number of milliseconds since 1/1/1970.
    private int nonce;
    
    public Block(String previousHash){
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash(); //must be done after other values are set
    }
    
    public String calculateHash() {
	String calculatedhash = StringUtil.applySha256(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + merkleRoot);
	return calculatedhash;
    }
    
    public String mineBlock(int difficulty) {
        merkleRoot = StringUtil.getMerkleRoot(transactions);
	String target = StringUtil.getDificultyString(difficulty);
	while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
	}
	 return hash;
    }
    
    //Add transactions to this block
    public boolean addTransaction(Transaction transaction) {
	//process transaction and check if valid, unless block is genesis block then ignore.
	if(transaction == null) return false;		
	if((previousHash != "0")) {
            if((transaction.processTransaction() != true)) {
		 //TestChain.HUI.updateConsole("Transaction failed to process. Discarded.");
		return false;
            }
	}
	transactions.add(transaction);
	 //TestChain.HUI.updateConsole("Transaction Successfully added to Block");
	return true;
    }
}
