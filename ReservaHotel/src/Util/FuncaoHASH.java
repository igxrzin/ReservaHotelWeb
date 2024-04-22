package Util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FuncaoHASH {
	 public String ConverterHash (String Senha) throws NoSuchAlgorithmException,
	   UnsupportedEncodingException {

	       MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
	       byte SenhaSegura[] = algorithm.digest(Senha.getBytes("UTF-8"));

	       StringBuilder hexString = new StringBuilder();
	       for (byte b : SenhaSegura) {
	         hexString.append(String.format("%02X", 0xFF & b));
	       }
	       String senhahex = hexString.toString();
	       return(senhahex);
		
	}

}