

run using Gradle command:

cleanIdeaModule ideaModule

then

cleanTest test



Currently gets this error:

SuiteName STANDARD_ERROR
    Jan 21, 2017 7:25:54 PM com.relevantcodes.extentreports.Report flush
    SEVERE: Stream closed
    java.io.IOException: Unable to write source: Stream closed.
    	at com.relevantcodes.extentreports.Report.flush(Report.java:450)
    	at com.relevantcodes.extentreports.ExtentReports.flush(ExtentReports.java:900)
    	at com.relevantcodes.extentreports.Report.terminate(Report.java:435)
    	at com.relevantcodes.extentreports.ExtentReports.close(ExtentReports.java:917)
    	at qa.test.complexfactory.Test001C.afterSuite(Test001C.java:43)
    	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    	at java.lang.reflect.Method.invoke(Method.java:498)
    	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)
    	at org.testng.internal.Invoker.invokeConfigurationMethod(Invoker.java:515)
    	at org.testng.internal.Invoker.invokeConfigurations(Invoker.java:217)
    	at org.testng.internal.Invoker.invokeConfigurations(Invoker.java:144)
    	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:357)
    	at org.testng.SuiteRunner.run(SuiteRunner.java:289)
    	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
    	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
    	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1293)
    	at org.testng.TestNG.runSuitesLocally(TestNG.java:1218)
    	at org.testng.TestNG.runSuites(TestNG.java:1133)
    	at org.testng.TestNG.run(TestNG.java:1104)
    	at org.gradle.api.internal.tasks.testing.testng.TestNGTestClassProcessor.runTests(TestNGTestClassProcessor.java:129)
    	at org.gradle.api.internal.tasks.testing.testng.TestNGTestClassProcessor.stop(TestNGTestClassProcessor.java:88)
    	
    	
    	