package soapUIRESTTrigger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;

public class RESTWebServiceSuiteRunnerClass {

	@Test
	public void RESTTest() {

		WsdlProject project = new WsdlProject("C:\\Users\\Bamisho\\Documents\\EmployeeWebServiceREST.xml");
		
		
		// this step executes specific test-Suite in the Project
		for(int j=0; j<project.getTestSuiteCount(); j++)
			
		{
			WsdlTestSuite testsuite=project.getTestSuiteAt(j);
			
			for(int i=0; i<testsuite.getTestCaseCount(); i++)
				
			{
				WsdlTestCase testcase=testsuite.getTestCaseAt(i);
				
				//code execute
				
				TestRunner runner= testcase.run(new PropertiesMap(), false);
				
				Assert.assertEquals(Status.FINISHED, runner.getStatus());
				
			}
		}
		
		
		
		}
}
