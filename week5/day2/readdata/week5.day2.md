Agenda for Today:
=================
  
   09:30 to 09:50-alwaysRun,Timeout,InvocationTimeOut
   09:50 to 10.40---Read data form Excel
   10.40 to 11.10---Classroom +Break
   11.10 to 11.40---Integration with Create LeadTestCase
   11.40 to 12.05---Classroom
   12.05 to 12.30---Common integration



      MicroSoft Excel
   Not a Direct java library
   We need to use Apache POI 
   Excel extension
   .xls-Excel Spreadsheet
   .xlsx-Excel Spreadsheet in xml format

 * Steps to read from excel
		 * 
		 * 1) Open the workbook using file name and path 
		 * 2) Go to the specific sheet (bysheet name or index) 
		 * 3) Go to the specific row (by index) 
		 * 4) Go to the specific column (by index) -- cell
		 * 5) Read the content


.xls-HSSFWorkBook 
.xlsx-XSSFWorkBook


1.I need to Create exclefile and i need save in under project Create new folder and paste file .
step 1-----XSSFWorkBook
step2------XSSFWoekSheet
Step 3-----XSSFRow
step 4-----XSSFCell




Step to Integrate ReadExcle with DataProvider
==============================================

1.Declare a String[][] variable in ReadExcle program with dimensions a rowcount and Cellcount.

2.Save data into the 2D array by having data[i-1][j]=cell.getStringCellValues

3.add return statement and chnage void to return type.
4.keyword static retain

createlead 

excleclass.methodname();

return excleclass.methodname();



Common data integratio
============================

1.remove DataProvider from Create lead..paste in BaseClass
2.Create string variable in excelpgm  pass into file data
3.need pass variable inside baseclass, pass  variable as gobally
4.give the variable in dataprovider inside method()
5. Create @BeforeTest inside testcase  create,edit and pass the value correctly



@suite
@test
@class