package se.beachen.test.guice;

import se.beachen.test.guice.service.MyCoolServiceFacade;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class GuiceDemo 
{
    public static void main( String[] args )
    {
    	Injector injector = Guice.createInjector(new IntegrationTestModule());
    	
    	MyCoolServiceFacade facade = injector.getInstance(MyCoolServiceFacade.class);
    	
    	System.out.println("1, " + facade.doSomething());
    	System.out.println("2, " + facade.doSomeReallyCoolShit());
    	System.out.println("3, " + facade.doSomeCrazyCoolShit());
        
    }
}
