package com.quarkus.satya;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 * Hello world!
 *
 */
@QuarkusMain 
public class App implements QuarkusApplication
{
    
    public static void main(String... args) {
        // This bootstraps Quarkus and starts the HTTP server
        Quarkus.run(App.class,args); 
    }
    
    
	@Override
	public int run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  System.out.println("Do startup logic here...");
          // Keep the application running until it receives a shutdown signal
          Quarkus.waitForExit();
		return 0;
	}
}
