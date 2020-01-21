/*package test1;


import java.lang.reflect.Method;
import java.util.List;
import org.testng.TestNG;
import org.testng.collections.Lists;
import JPPLAutomationGroup.JPPLCICD.Tests.ExecutionEngine;
import JPPLAutomationGroup.JPPLCICD.Utility.AnnotationTransformer;
import JPPLAutomationGroup.JPPLCICD.Utility.ListenerTest;

public class StartExecution extends ExecutionEngine{
	
	
    public static void main(String[] args) {  
    	Class c = StartExecution.class;
        Method[] m = c.getDeclaredMethods();
        System.out.println("Number of declared methods in StartExecution class="+m.length);
       System.out.println("Name of method="+m[0].getName()+"Number of argumnets in first method="+ m[0].getAnnotatedParameterTypes().length);
    	System.out.println("TRY TRY--------------");
        TestNG testng = new TestNG();
        List<String> suite1 = Lists.newArrayList();
        System.out.println("TRY TRY--------------");
        //suite1.add("CompleteTestSuite.xml");

  // suite1.add("RedeemNow.xml");
  // suite1.add("Test_Suites/Enrollment.xml");
      //  suite1.add("Test_Suites/RedirectionLinksVerification.xml");
   //suite1.add("Test_Suites/MyProfileTest.xml");
//   suite1.add("Test_Suites/MyFamilyTests.xml");
        suite1.add("Test_Suites/LoginPageTest.xml");


System.out.println("TRY TRY--------------");
    //path = args[0];
    path = System.getProperty("user.dir");
    System.out.println("Path="+path);
        testng.setTestSuites(suite1);
        testng.setAnnotationTransformer(new AnnotationTransformer());
        testng.addListener(new ListenerTest());
        testng.run();                                      
}
    
    
    public void name() {
		
	}
    
    public void name2() {
		
	}
    
    public void name3() {
		
	}

}
*/