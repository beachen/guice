package se.beachen.test.guice;

import java.io.IOException;
import java.util.Properties;

import se.beachen.test.guice.service.MyCoolServiceFacade;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.matcher.Matchers;

public class IntegrationTestModule implements Module 
{	
	public void configure(Binder binder) 
	{
		String environemnt = loadConfig();
		
		binder.bind(TestContext.class).toInstance(new TestContext(environemnt));
		
		// AOP
		ServiceInterceptor soaInterceptor = new ServiceInterceptor();
		binder.bindInterceptor(Matchers.any(), Matchers.annotatedWith(SoaService.class), soaInterceptor);
		binder.requestInjection(soaInterceptor); // test context
		
		//binder.bind(MyCoolServiceFacade.class); // not needed
		
		 // print properties
        
	}

	private String loadConfig() {
		Properties p = new Properties();
        try 
        {
			p.load(GuiceDemo.class.getClassLoader().getResourceAsStream("config/config.properties"));
			
		} 
        catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
        System.out.println("Config loaded:" + p);
        return p.getProperty("environment");
	}

}
