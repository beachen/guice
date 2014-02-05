package se.beachen.test.guice.service;

import com.google.inject.Inject;

import se.beachen.test.guice.SoaService;
import se.beachen.test.guice.TestContext;

public class CoolService 
{
	@Inject 
	private TestContext _context;
	
	
	
	@SoaService
	public String doCoolStuff() 
	{
		_context.setEnvionment("changed to prod");
		return "Cool I am a service";
	}
	
}
