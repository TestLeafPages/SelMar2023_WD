Todays Agenda:
===============
   09:30-10:15->Parameterzation(static and dataproivder)
   10:10-10:50->Classroom +break
   10:50-11:20->POM with Cucumber
   11:20-11:35->break
   11:35-12:30->POM with TestNG and Cucumber(ThreadLocal)
  
static:

1.where you have hardcoded values ,create String variable and pass variable inside sendkeys
2.go to testcase or runner set the values .

How to Parameterize the data?
	  1)Create a new package(utils) and copy the ReadExel class from the previous project 
	  and paste it here
	  2)Create a data folder and create xcel sheets
	  3)Declare the ExcelFileName globally
	  4)Create a method for @DataProvider and call the ReadExel class
	  5)Integrate @Test with dataProvider attribute
	  6)Pass the inputs as arguments in the testcase method level and replace the hardcoded values
	  7)In the testcase create a method to mention the ExcelFileName and annotate with @BeforeTest
	  

driver -issue

TestNG-
sequential -we use static keywords

parallel- constructor

Cucumber
sequential - we use Static keywords
constructor is not allowed

  ThreadLocal Concept:
=========================

-Java Class to create variable which can be used to read andwrite within a single thread.
ThreadLocal implementation of Webdriver will support
TestNG parallel execution and cucumber

DisAdvantage:

As the constructor call is not allowed in cucumber 

To acheive parallel execution without constructor in cucumber

==============================

To support both cucumberand TestNG

---supportsequential execution of both TestNG and cucumber

--not ableto use for parallel executionof TestNG because cucumber is not supporting driver to be passed inthe constructor.














Add ThreadLocalclass in Basecall method


private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();
	
	
	public void setDriver() {
		tldriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return tldriver.get();
	}

add setDriver() method to @BeforeMethod

Remove the constructor from all the pages

Change the driver to getDriver() in all the actions in the pages 