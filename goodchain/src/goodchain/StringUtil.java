package goodchain;
import java.security.MessageDigest;

public class StringUtil {
	
	public static String  applySha256(String Input) {
		try {
			MessageDigest digest = MessageDigest.getInstance(Input);
			byte[] hash = digest.digest(Input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			
			for(int i = 0; i < hash.length;i++) {
				String hexc = Integer.toHexString(0xff & hash[i]);
				if(hexc.length() == 1) hexString.append('0');
				hexString.append(hexc);
			}
			return hexString.toString();
		}
		catch (Exception e) {			
			throw new RuntimeException(e);
		}
	}
	

}
