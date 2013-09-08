package se.beachen.test.guice;

import com.google.inject.Inject;

public class TaxiService 
{
	@Inject
	private TestContext _testContext;
	
	@SoaService
	public String getServiceName() 
	{
		return "taxiService with context" + _testContext;
	}
	
	public TestContext getTestContext()
	{
		return _testContext;
	}

}
