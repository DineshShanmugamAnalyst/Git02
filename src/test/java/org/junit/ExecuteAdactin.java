package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({LoginPage.class,SearchHotel.class,SelectHotel.class,Booking.class})
public class ExecuteAdactin {

	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(ExecuteAdactin.class);
		
		int runCount = runClasses.getRunCount();
		System.out.println(runCount);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println(failureCount);
		
		List<Failure> li = runClasses.getFailures();
		for (Failure failure : li) {
			System.out.println(failure);
		}
	}
	
	
	
}
