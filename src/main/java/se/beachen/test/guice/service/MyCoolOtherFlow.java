package se.beachen.test.guice.service;

import com.google.inject.Inject;

public class MyCoolOtherFlow 
{
	@Inject
	private CoolService _service;
	
	@Inject
	private MyCoolServiceFacade _facade;

	public String doSomeCrazyStuff() 
	{
		
		return "OK, I'm going to call a service and a facade, becasse I can \n" + 
		_service.doCoolStuff() + "\n" + 
		_facade.doSomething();
	}
	
	
}
