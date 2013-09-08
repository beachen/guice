package se.beachen.test.guice;

import com.google.inject.Inject;

public class ServiceFactory 
{
	@Inject
	private TaxiService _taxiService;
	
	@Inject
	private HotelService _hotelService;
	
	public TaxiService getTaxiService() 
	{
		return _taxiService;
	}
	public HotelService getHotelService() 
	{
		return _hotelService;
	}
}
