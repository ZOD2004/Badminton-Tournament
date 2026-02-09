package day07;

import java.io.FileOutputStream;

public class TryWithResource {
	public static void main(String[] args) {
		try(FileOutputStream fos= new FileOutputStream("output.txt")){ //no need to close fos coz of TRYWITHRESOURCE
			String str = "I am Murali";
			byte arr[] = str.getBytes();
			fos.write(arr);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("OUTSIDE");
		
//		Not TRYWITHRESOURCE closing in finally
		
//		FileReader fr = new FileReader(path);
//	    BufferedReader br = new BufferedReader(fr);
//	    try {
//	        return br.readLine();
//	    } finally {
//	        br.close();
//	        fr.close();
//	    }
	}

}
