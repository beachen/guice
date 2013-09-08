package se.beachen.test.guice;

import java.io.IOException;
import java.util.Properties;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Injector injector = Guice.createInjector(new SoaModule());
    	
    	// Inject members not needed if ServiceFactory is created by Guice. 
    	ServiceFactory factory = new ServiceFactory();
    	injector.injectMembers(factory);
    	
    	TaxiService injectedService = injector.getInstance(TaxiService.class);
    	System.out.println(injectedService.getServiceName());
        
    	TaxiService taxiServie = factory.getTaxiService();
        System.out.println(taxiServie.getServiceName());
        System.out.println(factory.getHotelService().getServiceName());
        System.out.println("Print testContext:" +factory.getHotelService().getEnvironment());
        
        
        // print properties
        Properties p = new Properties();
        try 
        {
			p.load(App.class.getClassLoader().getResourceAsStream("config/config.properties"));
		} 
        catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
        System.out.println(p);		
        
    }
}
