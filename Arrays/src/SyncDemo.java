

public class SyncDemo {
	    public static void main(String args[]) 
	    { 
	        Sender snd = new Sender(); 
	        ThreadedSend S1 = 
	            new ThreadedSend( " Hi teju " , snd ); 
	        ThreadedSend S2 = 
	            new ThreadedSend( " Hello " , snd ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interrupted"); 
	        
	    } 

	}

}
