package se.beachen.test.guice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.Inject;

public class SoaInterceptor implements MethodInterceptor
{
	@Inject
	private TestContext _testContext;
	
	public Object invoke(MethodInvocation invocation) throws Throwable 
	{
	
	System.out.println("Before: " + invocation.getMethod().getDeclaringClass().getName() + ":" + invocation.getMethod().getName());
	System.out.println("Test context:" + _testContext.getEnvironment()) ;
	
//	Method m = invocation.getMethod();
//	Class theService = m.getDeclaringClass();
//	System.out.println("The declaring class is:" + theService.getName());
//	Class<?> type = theService.getDeclaredField("_testContext").getType();
//	System.out.println("The type of _testContext is:" + type.getName());
//	System.out.println("The actual class of " +   type.getName() + "=" + type.getClass().getName());
//	Method method = type.getMethod("getEnvironment", null);
//	System.out.println("The method name is:" +method.getName());
//	System.out.println("The method belongs to the class: " + method.getDeclaringClass().getName());
//	Object theInstanceOfTestContext = theService.getDeclaredField("_testContext").getDeclaringClass();
//	System.out.println("The aspect says:" + method.invoke(theInstanceOfTestContext, null));
	
	
		  
	Object o = invocation.proceed();
	
	System.out.println("Returned:" + o.getClass().getSimpleName());
	
	return o;
	}

}
