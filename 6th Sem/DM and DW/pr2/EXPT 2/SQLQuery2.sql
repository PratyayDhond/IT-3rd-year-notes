-- Create the data warehouse
create database TopHireDW
go
use TopHireDW
go
	
-- Create Date Dimension
if exists (select * from sys.tables where name = 'DimDate')
drop table DimDate
go
 
create table DimDate
( DateKey int not null primary key,
 [Year] varchar(7), [Month] varchar(7), [Date] date, DateString varchar(10))
go
 
-- Populate Date Dimension
truncate table DimDate
go
 
declare @i int, @Date date, @StartDate date, @EndDate date, @DateKey int,
 @DateString varchar(10), @Year varchar(4),
 @Month varchar(7), @Date1 varchar(20)
set @StartDate = '2006-01-01'
set @EndDate = '2016-12-31'
set @Date = @StartDate
 
insert into DimDate (DateKey, [Year], [Month], [Date], DateString)
 values (0, 'Unknown', 'Unknown', '0001-01-01', 'Unknown') --The unknown row
 
while @Date <= @EndDate
begin
 set @DateString = convert(varchar(10), @Date, 20)
 set @DateKey = convert(int, replace(@DateString,'-',''))
 set @Year = left(@DateString,4)
 set @Month = left(@DateString, 7)
 insert into DimDate (DateKey, [Year], [Month], [Date], DateString)
 values (@DateKey, @Year, @Month, @Date, @DateString)
 set @Date = dateadd(d, 1, @Date)
end
go
 
select * from DimDate
 
-- Create Customer dimension
if exists (select * from sys.tables where name = 'DimCustomer')
drop table DimCustomer
go
 
create table DimCustomer
( CustomerKey int not null identity(1,1) primary key,
 CustomerId varchar(20) not null,
 CustomerName varchar(30), DateOfBirth date, Town varchar(50),
 TelephoneNo varchar(30), DrivingLicenceNo varchar(30), Occupation varchar(30)
)
go
 
insert into DimCustomer (CustomerId, CustomerName, DateOfBirth, Town, TelephoneNo,
 DrivingLicenceNo, Occupation)
select * from HireBase.dbo.Customer
 
select * from DimCustomer
 
-- Create Van dimension
if exists (select * from sys.tables where name = 'DimVan')
drop table DimVan
go
 
create table DimVan
( VanKey int not null identity(1,1) primary key,
 RegNo varchar(10) not null,
 Make varchar(30), Model varchar(30), [Year] varchar(4),
 Colour varchar(20), CC int, Class varchar(10)
)
go
 
insert into DimVan (RegNo, Make, Model, [Year], Colour, CC, Class)
select * from HireBase.dbo.Van
go
 
select * from DimVan
 
-- Create Hire fact table
if exists (select * from sys.tables where name = 'FactHire')
drop table FactHire
go
 
create table FactHire
( SnapshotDateKey int not null, --Daily periodic snapshot fact table
 HireDateKey int not null, CustomerKey int not null, VanKey int not null, --Dimension Keys
 HireId varchar(10) not null, --Degenerate Dimension
 NoOfDays int, VanHire money, SatNavHire money,
 Insurance money, DamageWaiver money, TotalBill money
)
go
 
select * from FactHire