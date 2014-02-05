package se.beachen.test.guice.service;

import se.beachen.test.guice.TestContext;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton 
public class MyCoolServiceFacade 
{
	@Inject
	private CoolService cool;
	
	@Inject
	private MyCoolFlow coolFlow;
	
	@Inject
	private MyCoolOtherFlow coolOtherFlow;
	
	@Inject
	private TestContext _testContext;
	
	public String doSomething() 
	{
		return cool.doCoolStuff() + ", psst: if you need a testContext it is injected for environment:" + _testContext.getEnvironment();
	}
	public String doSomeReallyCoolShit() 
	{
		
		return coolFlow.doReallyCoolStuff();
	}
	
	public String doSomeCrazyCoolShit() 
	{
		
		return coolOtherFlow.doSomeCrazyStuff();
	}
}
