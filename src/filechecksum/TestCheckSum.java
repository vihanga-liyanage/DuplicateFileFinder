/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filechecksum;

/**
 *
 * @author Vihanga Liyanage
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestCheckSum {
	
    public static void main(String args[]) throws Exception {
   
        String dir = "D:\\Developer\\My Projects\\FileChecksum\\src\\filechecksum\\";
        String file = "test1.txt";
        System.out.println(file + " : " + getChecksum("SHA-512", dir + file));
        
    }
  
    private static String getChecksum(String algorithm, String file) throws NoSuchAlgorithmException, FileNotFoundException, IOException {
        
        MessageDigest md = MessageDigest.getInstance(algorithm);
        FileInputStream fis = new FileInputStream(file);
        byte[] dataBytes = new byte[1024];

        int nread = 0; 

        while ((nread = fis.read(dataBytes)) != -1) {
          md.update(dataBytes, 0, nread);
        }

        byte[] mdbytes = md.digest();

        //convert the byte to hex format
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < mdbytes.length; i++) {
            sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        return sb.toString();
    }
}
