package soapUIRESTTrigger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;

public class SoapWebServiceTestRunnerClass {

	
	@Test
	public void SoapTest() {

		WsdlProject project = new WsdlProject("C:\\Users\\Bamisho\\Documents\\Automation-soapui-project.xml");
		
		WsdlTestSuite testsuite=project.getTestSuiteByName("Testing");
		
		// this step executes all the test in the TestSuite
		for(int i=0; i<testsuite.getTestCaseCount(); i++)
			
		{
			WsdlTestCase testcase=testsuite.getTestCaseAt(i);
			
			//code execute
			
			TestRunner runner= testcase.run(new PropertiesMap(), false);
			
			Assert.assertEquals(Status.FINISHED, runner.getStatus());
			
		}
	}

}
