package se.beachen.test.guice;


public class TestContext 
{
	private String _environment;
	
	public TestContext(String env) 
	{
		_environment = env;
	}
	
	public String getEnvironment() 
	{

		return _environment;
	}

	public void setEnvionment(String newValue) 
	{
		_environment = newValue;
	}
	
	
}
