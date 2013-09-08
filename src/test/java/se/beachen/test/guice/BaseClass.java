package se.beachen.test.guice;


public class BaseClass 
{
	static String config;
	
	public BaseClass(String config)
	{
		if(this.config == null)
		{
			this.config = config;
		}
		
		System.out.println(this.config);
	}

}
