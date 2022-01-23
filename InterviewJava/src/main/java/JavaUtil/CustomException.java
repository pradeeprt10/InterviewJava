package JavaUtil;

import java.io.IOException;
import java.sql.SQLException;

class OrderNotFoundException extends Exception{
	
	OrderNotFoundException(String s){
		super(s);
	}	
}	

public class CustomException {	

	public static void getorder(int x) throws IOException
	{
		//Intentionally throwing error for value=5
	   if(x==5)
		throw new IOException("IO Exception custom");	
    }

	public static void main(String[] args) {
		
		try {
			getorder(5);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
