package se.beachen.test.guice;

import com.google.inject.Inject;

public class HotelService {

	@Inject
	private TestContext _testContext;
	
	@SoaService
	public String getServiceName() 
	{
		return "hotelService" ;
	}

	public String getEnvironment() 
	{

		return _testContext.getEnvironment();
	}
}
									