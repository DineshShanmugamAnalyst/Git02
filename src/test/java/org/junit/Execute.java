//package org.junit;
//
//
//
//
//import java.util.List;
//
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
//import org.junit.runner.RunWith;
//import org.junit.runner.notification.Failure;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;
//
//@RunWith(Suite.class)
//@SuiteClasses({ExecuteClass.class})
//public class Execute {
//	
//	
//	public static void main(String[] args) {
////		
//Result runClasses = JUnitCore.runClasses(Execute.class);
//	
//	int runCount = runClasses.getRunCount();
//	System.out.println("total run count"+runCount);
//	
//	
//	int ignoreCount = runClasses.getIgnoreCount();
//	
//	System.out.println("ignores" +ignoreCount);
//	
//	int failureCount = runClasses.getFailureCount();
//	System.out.println("failures" +failureCount);
//	
//	
//	List<Failure> failures = runClasses.getFailures();
//	
//	
//	for (Failure failure : failures) {
//		System.out.println(failure);
//		
//	}
//	System.out.println("*********************");
//	
//	for (int i = 0; i < failures.size(); i++) {
//		
//		Failure failure = failures.get(i);
//		System.out.println(failure);
//	}
//	
//	}	
//	
//
//}
