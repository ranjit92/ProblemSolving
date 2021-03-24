package problems.general;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.UUID;

public class HashTesting {

	private static String URL = " http://www.educative.io/distributed.php?id=design"; 
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("MD5");
//		md.update(UUID.randomUUID().toString().getBytes("UTF-8"));
		String digest = null;
		// digest() method is called to calculate message digest 
        //  of an input digest() return array of byte 
        byte[] messageDigest = md.digest(URL.getBytes("UTF-8")); 

      //converting byte array to Hexadecimal String 
        StringBuilder sb = new StringBuilder(2*messageDigest.length);
        
        for(byte b : messageDigest){
            sb.append(String.format("%02x", b & 0xff));
        }
        digest = sb.toString();
        String BasicBase64format= Base64.getUrlEncoder().encodeToString(digest.getBytes());

        System.out.println("Hash value: "+ digest);
        System.out.println("BasicBase64format: "+ BasicBase64format);

        StringBuilder resultKey = new StringBuilder(6);
        for (int i = 0; i < 6; i++) { 
        	  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(BasicBase64format.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            resultKey.append(BasicBase64format 
                          .charAt(index)); 
        } 
        System.out.println("URL key: "+resultKey);
        
        // decode into String from encoded format 
//        byte[] actualByte = Base64.getDecoder().decode(BasicBase64format); 
  
//        String actualString = new String(actualByte); 
        
//        System.out.println("Actual string : "+ actualString.length());
        
        
	}
}
