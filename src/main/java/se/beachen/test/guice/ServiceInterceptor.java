package se.beachen.test.guice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.Inject;

public class ServiceInterceptor implements MethodInterceptor
{
	@Inject
	private TestContext _testContext;
	
	public Object invoke(MethodInvocation invocation) throws Throwable 
	{
	
		// Before
		long start = System.currentTimeMillis();
		
		String invokedMethod = invocation.getMethod().getDeclaringClass().getSimpleName() + ":" + invocation.getMethod().getName();
		System.out.println("Before " + invokedMethod);
		System.out.println("Test context:" + _testContext.getEnvironment()) ;
		  
		Object o = invocation.proceed();
	
		// After
		System.out.println("Test context:" + _testContext.getEnvironment()) ;
		long stop = System.currentTimeMillis();
		long execution = stop - start;
		System.out.println(invokedMethod + " finished after:" + execution + "ms");
	
	return o;
	}

}
