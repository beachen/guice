package se.beachen.test.guice.service;

import com.google.inject.Inject;

public class MyCoolFlow 
{
	@Inject
	private MyCoolServiceFacade _facade;

	public String doReallyCoolStuff() 
	{
		return "Crazy cool stuff need to be careful when calling facade again: - " + _facade.doSomething();
	}
		
}
