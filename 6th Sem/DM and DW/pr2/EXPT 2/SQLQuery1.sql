-- Create customer table
if exists (select * from sys.tables where name = 'Customer')
drop table Customer
go
 
create table Customer
( CustomerId varchar(20) not null primary key,
 CustomerName varchar(30), DateOfBirth date, Town varchar(50),
 TelephoneNo varchar(30), DrivingLicenceNo varchar(30), Occupation varchar(30)
)
go
 
-- Populate Customer
truncate table Customer
go
 
declare @i int, @si varchar(10), @startdate date
set @i = 1
while @i <= 100
begin
 set @si = right('0'+CONVERT(varchar(10), @i),2)
 insert into Customer
 ( CustomerId, CustomerName, DateOfBirth, Town, TelephoneNo, DrivingLicenceNo, Occupation)
 values
 ( 'N'+@si, 'Customer'+@si, DATEADD(d,@i-1,'2000-01-01'), 'Town'+@si, 'Phone'+@si, 'Licence'+@si, 'Occupation'+@si)
 set @i = @i + 1
end
go
 
select * from Customer
 
-- Create Van table
if exists (select * from sys.tables where name = 'Van')
drop table Van
go
 
create table Van
( RegNo varchar(10) not null primary key,
 Make varchar(30), Model varchar(30), [Year] varchar(4),
 Colour varchar(20), CC int, Class varchar(10)
)
go
 
-- Populate Van table
truncate table Van
go
 
declare @i int, @si varchar(10)
set @i = 1
while @i <= 20
begin
 set @si = convert(varchar, @i)
 insert into Van
 ( RegNo, Make, Model, [Year], Colour, CC, Class)
 values
 ( 'Reg'+@si, 'Make'+@si, 'Model'+@si,
 case @i%4 when 0 then 2008 when 1 then 2009 when 2 then 2010 when 3 then 2011 end,
 case when @i%5<3 then 'White' else 'Black' end,
 case @i%3 when 0 then 2000 when 1 then 2500 when 2 then 3000 end,
 case @i%3 when 0 then 'Small' when 1 then 'Medium' when 2 then 'Large' end)
 set @i = @i + 1
end
go
 
select * from Van
 
-- Create Hire table
if exists (select * from sys.tables where name = 'Hire')
drop table Hire
go
 
create table Hire
( HireId varchar(10) not null primary key,
 HireDate date not null,
 CustomerId varchar(20) not null,
 RegNo varchar(10), NoOfDays int, VanHire money, SatNavHire money,
 Insurance money, DamageWaiver money, TotalBill money
)
go
 
-- Populate Hire table
truncate table Hire
go
 
declare @i int, @si varchar(10), @DaysFrom1stJan int, @CustomerId int, @RegNo int, @mi int
set @i = 1
while @i <= 1000
begin
 set @si = right('000'+convert(varchar(10), @i),4) -- string of i
 set @DaysFrom1stJan = (@i-1)%200 --The Hire Date is derived from i modulo 200
 set @CustomerId = (@i-1)%100+1 --The CustomerId is derived from i modulo 100
 set @RegNo = (@i-1)%20+1 --The Van RegNo is derived from i modulo 20
 set @mi = (@i-1)%3+1 --i modulo 3
 insert into Hire (HireId, HireDate, CustomerId, RegNo, NoOfDays, VanHire, SatNavHire, Insurance, DamageWaiver, TotalBill)
 values ('H'+@si, DateAdd(d, @DaysFrom1stJan, '2011-01-01'),
 left('N0'+CONVERT(varchar(10),@CustomerId),3), 'Reg'+CONVERT(varchar(10), @RegNo),
 @mi, @mi*100, @mi*10, @mi*20, @mi*40, @mi*170)
 set @i += 1
end
go
 
select * from Hire