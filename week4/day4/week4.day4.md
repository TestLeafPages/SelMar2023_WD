Today's Agenda:
==============
   1)9:30-10:40->Annotations
   2)10:40-11:10->Classroom +Break
   3)11:10-12:10->Attributes
   4)12:10:12:30->Classroom
   


  Annotations:

@BeforeSuite - start report
   @BeforeTest - Connecting to database
		@BeforeClass - TC name, desc, author
			
			@BeforeMethod - Launch browser and login---perconditin
					
               @Test (mandatory)

			@AfterMethod - post conditon-Close browser

		@AfterClass
	@AfterTest - Disconnecting database
@AfterSuite - stop report





   
Attributes:
===========

1)priority:
     -default value for priority is 0 
     -To schedule the priorities for the testcases
     -Lower priorities should run first

2)invocationCount
         -default value for invocationCount is 1
         -The number of times a testcase should execute
         -Use it when:you like to create data for the same information       
	 
 

3)dependsOnMethods
     -String of Arrays
     	 
4)enabled:
    -Whether the methods are enabled
    -These testcases will be marked as ignored in the index.html report	
    default value


5)alwaysRun
default value

6)timeOut
     -The number of milliseconds this testcase should take
	 -Use it when:you like to benchmark the performance of the test steps
     default value
	 
7)invocationTimeOut
    -The maximum number of millisecondsthis test should take for cumulated time of all the 
    default value

8)ThreadPoolSize
default value
