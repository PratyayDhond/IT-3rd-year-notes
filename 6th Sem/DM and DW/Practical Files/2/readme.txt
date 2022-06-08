1. Start 'SQL Management Studio'
2. Start 'Visual Studio Code 2013 Integrated with SSIS tools'
3. import both the databases in 'Management Studio'

--- Management Studio

	IMPORTING TABLES:
		1. Right click on the databases option on the left side explorer
		2. Click on Restore Databases
		3. In option - 'General', select option 'Device', browse and select the '.bak' file.
		4. Click OK
		5. Goto options of 'Files' and check 'Relocate all files to folder' option
		6. Press OK

---- Visual Studio

CREATING PROJECT
	1. Click on New 'Project...' under the 'Start' heading
	2. In Templates -> Business Intelligence -> Integration Services, select Integration Services Project

PERFORMANCE
	1. Go to 'Data Flow' Tab
	2. Add a new Data flow task using 'Click to add new Data flow task' in the center
	3. OLE DB Source
		i.   Drag and drop 'OLE DB Source' from 'Other Sources'
		ii.  Select the OLE DB connection manager as - 'LIGHTNING\PRATYAYDHOND' 
		iii. Select Data Access Mode as -> 'Table or View'
  		iv.  Select Name of table... as -> '[dbo].[Hire]'
	4. Add Derived Column
		i.   Drag and Drop 'Common -> Derived Column' 
 		ii.  Add flow to it, 'Drag the blue line of previous one to this'
		iii. Double click on it and add Column name 'SnapshotDateKey'
		iv.  In Expression enter -> '(DT_I4) ((DT_WSTR,4) YEAR(GETDATE()) + RIGHT( "0" + (DT_WSTR,2) MONTH(GETDATE()) , 2 ) + RIGHT( "0" + (DT_WSTR,2) DAY(GETDATE()) , 2 ))'
		v.   Click OK.
	5. Add Lookup
 		i.   Drag and Drop 'Common -> Lookup'
		ii.  Connect to previous by extending blue line
		iii. Double click on Lookup 
		iv.  Go to Connection 
			a. SELECT DB Connection manager -> LIGHTNING\PRATYAYDHOND.TopHireDW
			b. SELECT table DimCustomer
		v.   Go to Columns
			a. Check CustomerKey in the right table
			b. Match the CustomerId in left table with right table CustomerID
		vi.  Click OK
	6. Add another Lookup
		i.   Select Lookup Match Output and click OK
		ii.  Go to Connection 
			a. SELECT DB Connection manager -> LIGHTNING\PRATYAYDHOND.TopHireDW
			b. SELECT table DimVan
		v.   Go to Columns
			a. Check VanKey in the right table
			b. Match the RegNo in left table with right table RegNo 
		vi.  Click OK  
	7. Add another Lookup
		i.   Select Lookup Match Output and click OK
		ii.  Go to Connection 
			a. SELECT DB Connection manager -> LIGHTNING\PRATYAYDHOND.TopHireDW
			b. SELECT table DimDate
		v.   Go to Columns
			a. Check DateKey in the right table
			b. Match the HireDate in left table with right table Date
		vi.  Click OK  
	8. Add OLE Database Destination 
		i.   Other Destinations -> OLE DB Destination
		ii.  Connection Manager
			a. In OLE DB connection manager select -> LIGHTNING\PRATYAYDHOND.TopHireDW
			b. Data Access Mode -> 'Table or view - fast mode'
			c. Name of the table -> [dbo].[FactHire]
		iii. Mappings
			a. Fill the ignore mappings -> <ignore> HireDateKey -> DateKey HireDateKey

-- MANAGEMENT STUDIO
	1. New Query
		USE TopHireDW;
		SELECT * FROM FactHire;