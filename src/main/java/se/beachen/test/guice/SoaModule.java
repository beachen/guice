package se.beachen.test.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.matcher.Matchers;

public class SoaModule implements Module 
{
	public void configure(Binder binder) 
	{
		//binder.bind(TaxiService.class);
		binder.bind(TestContext.class).toInstance(new TestContext("my test"));
		SoaInterceptor soaInterceptor = new SoaInterceptor();
		binder.bindInterceptor(Matchers.any(), Matchers.annotatedWith(SoaService.class), soaInterceptor);
		binder.requestInjection(soaInterceptor);
		
	}

}
