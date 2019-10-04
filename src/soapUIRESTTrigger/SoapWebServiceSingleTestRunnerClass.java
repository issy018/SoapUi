package soapUIRESTTrigger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;

public class SoapWebServiceSingleTestRunnerClass {

	
	@Test
	public void singleTest()
	{
        WsdlProject project = new WsdlProject("C:\\Users\\Bamisho\\Documents\\Automation-soapui-project.xml");
		
		WsdlTestSuite testsuite=project.getTestSuiteByName("Testing");
		
		WsdlTestCase testCase=testsuite.getTestCaseByName("GetEmployee");
		
		TestRunner runner= testCase.run(new PropertiesMap(), false);
		
		Assert.assertEquals(Status.FINISHED, runner.getStatus());
	}
}
