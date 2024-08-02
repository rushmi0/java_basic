package goodchain;
import java.util.Date;
public class Block {
	
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	
	public Block(String gata,String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.hash = calculateHash();
		this.timeStamp = new Date().getTime();
	}
    public String calculateHash() {
    	String calculatehash = StringUtil.applySha256(previousHash+
    			Long.toString(timeStamp)+data);
    	return calculatehash;
    }

}
