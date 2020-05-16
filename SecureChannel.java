package com.accolite.p2;

public class SecureChannel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(secureChannel(2, "Oppeeened", "12"));
	}

	// Complete the secureChannel function below.
	static String secureChannel(int operation, String message, String key) {
		if(message ==null || message.isEmpty()) {
			return "-1";
		}
		int l1 =  message.length(), l2 = key.length();
		try{
			if(operation==1) {
				StringBuilder  output = new StringBuilder();
				for(int i =0;i< l1;i++) {
					if(i< l2) {
						output.append(getDuplicateStr(message.charAt(i), Integer.parseInt(key.substring(i, i+1)))); 
					}
					else {
						output.append(message.charAt(i));
					}
				}
				return output.toString();
			}
			else {
				StringBuilder  output = new StringBuilder(message);
				for(int i =0, j=0;i< l1;) {
					if(j < l2) {
						int end = Integer.parseInt(key.substring(j, ++j)) -1 +i;
						if(message.charAt(end) != message.charAt(i)) {
							throw new Exception("Invalid");
						}
						if(i!=end) {
							output.replace(i, end, "_");
						}
						i = end+1;
					}
					else {
						i++;
					}
				}
				return output.toString().replaceAll("_", "");
			}
		}
		catch(Exception e) {
			return "-1";
		}}

	static StringBuilder getDuplicateStr(char m, int i) {
		StringBuilder s = new StringBuilder();
		for(int j=0;j<i;j++) {
			s.append(m);
		}
		return s;
	}
}
