package testchain;

import java.security.PublicKey;
import testchain.util.StringUtil;

public class TransactionOutput {
    public String id;
    public PublicKey reciepient;
    public float value; //the amount of coins they own
    public String parentTransactionId; //the id of the transaction this output was created in
    
    public TransactionOutput(PublicKey reciepient, float value, String parentTransactionId) {
	this.reciepient = reciepient;
	this.value = value;
	this.parentTransactionId = parentTransactionId;
	this.id = StringUtil.applySha256(StringUtil.getStringFromKey(reciepient)+Float.toString(value)+parentTransactionId);
    }
    
    public boolean isMine(PublicKey publicKey) {
	return (publicKey == reciepient);
    }
}
