package mx.joe.client;

import java.net.HttpURLConnection;
import java.net.URL;

public class ConsumerService {
	
//	public static boolean consumeServicePropertySystem(String nameProperty) {
//		 try {
//
//	            URL url = new URL("http://localhost:8080/MyProjectTest/api/properties/" + nameProperty);
//	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//	            conn.setRequestMethod("GET");	        
//	            System.out.println("Code: "+ conn.getResponseCode());
//	            if (conn.getResponseCode() != 200) {
//	                
//	                return false;
//	            } 
//	            conn.disconnect();
//
//	        } catch (Exception e) {
//	            System.out.println("Exception: " + e);
//	        }
//		
//		return true;
//	}
	
	public static int consumeServicePropertySystem(String nameProperty) {
		 try {
			 	int code;
	            URL url = new URL("http://localhost:8080/MyProjectTest/api/properties/" + nameProperty);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");	        
	            System.out.println("Code: "+ conn.getResponseCode());	 
	            code = conn.getResponseCode();
	            conn.disconnect();
	            return code;
	        } catch (Exception e) {
	            System.out.println("Exception: " + e);
	        }
		return 0;
		
	}

}
