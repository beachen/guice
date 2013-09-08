package se.beachen.test.guice;

import com.google.inject.Inject;

public class TestContext 
{
	private Boolean isValidated;
	
	private String _environment;
	
	@Inject
	public TestContext(String env) 
	{
		_environment = env;
	}
	
	public String getEnvironment() 
	{

		return _environment;
	}
	
	
}
