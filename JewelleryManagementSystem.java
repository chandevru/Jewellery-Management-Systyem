import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JewelleryManagementSystem {
	 public static Connection getConnection()throws ClassNotFoundException, SQLException
	
	
	{
		//1.Load the driver
		 
				Class.forName("com.mysql.jdbc.Driver");  
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jewellery","root","toor");
			
				return connection;	
				
				}   
	
			
public static void insertLoginValue(Login login) throws ClassNotFoundException,SQLException
{
	
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("insert into Login values(?,?)");
	statement.setString(1,login.getUsername());
	statement.setString(2,login.getPassword());
		
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("inserted successfully");
	}else
		System.out.println("failed");
}



 
	
	




public static void selectLoginValue(Login login) throws ClassNotFoundException,SQLException
{ 
	Statement statement=getConnection().createStatement();
	ResultSet resultset= statement.executeQuery("select *from Login");
	while(resultset.next())
	{
		System.out.println(resultset.getString("Username"));
		System.out.println(resultset.getString("Password"));
		
	}
	
}

public static void insertCustomersValue(Customers customers) 
{
	try {
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("insert into Customers values(?,?,?,?)");
	statement.setString(1,customers.getCust_id());
	statement.setString(2,customers.getName());
	statement.setString(3,customers.getAddress());
	statement.setString(4,customers.getDate());
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("inserted successfully");
	}else
		System.out.println("failed");
	}catch(ClassNotFoundException ex) {
		System.out.println(ex.getMessage());
	}catch(SQLException ex){
		System.out.println(ex.getMessage());
	}
}


public static void updateCustomersValue(Customers customers) 
{
	try {
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("update Customers set Name=? where Cust_id=?");
	statement.setString(1,customers.getName());
	statement.setString(2,customers.getCust_id());
	
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("updated successfully");
	}else
		System.out.println("failed");
	}catch(ClassNotFoundException ex) {
		System.out.println(ex.getMessage());
	}catch(SQLException ex) {
		System.out.println(ex.getMessage());
	}
}

public static void deleteCustomersValue(Customers customers) throws ClassNotFoundException,SQLException
{
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("delete from Customers where Cust_id=?");
	statement.setString(1,customers.getCust_id());
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("deleted successfully");
	}else
		System.out.println("failed");
}
public static void selectCustomersValue(Customers customers) throws ClassNotFoundException,SQLException
{ 
	Statement statement=getConnection().createStatement();

	ResultSet resultSet= statement.executeQuery("select *from Customers");
	while(resultSet.next())
	{
		System.out.println(resultSet.getString("Cust_id"));
		System.out.println(resultSet.getString("Name"));
		System.out.println(resultSet.getString("Address"));
		System.out.println(resultSet.getString("Date"));
	}
	
}
public static void insertVendorsValue(Vendors vendors) 
{
	try {
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("insert into Vendors values(?,?,?,?)");
	statement.setString(1,vendors.getVendor_id());
	statement.setString(2,vendors.getVname());
	statement.setString(3,vendors.getVaddress());
	statement.setString(4,vendors.getVdate());
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("inserted successfully");
	}else
		System.out.println("failed");
	}catch(ClassNotFoundException ex) {
		System.out.println(ex.getMessage());
	}catch(SQLException ex) {
		System.out.println(ex.getMessage());
	}
}
public static void updateVendorsValue(Vendors vendors) throws ClassNotFoundException,SQLException
{
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("update Vendors set Name=? where Vendor_id=?");
	statement.setString(1,vendors.getVname());
	statement.setString(2,vendors.getVendor_id());
	
	
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("updated successfully");
	}else
		System.out.println("failed");
}

public static void deleteVendorsValue(Vendors vendors) throws ClassNotFoundException,SQLException
{
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("delete from Vendors where Vendor_id=?");
	statement.setString(1,vendors.getVendor_id());
	
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("deleted successfully");
	}else
		System.out.println("failed");
}
public static void selectVendorsValue(Vendors vendors) 
{ 
	try {
	Statement statement=getConnection().createStatement();

	ResultSet resultSet= statement.executeQuery("select *from Vendors");
	while(resultSet.next())
	{
		System.out.println(resultSet.getString("Vendor_id"));
		System.out.println(resultSet.getString("Vname"));
		System.out.println(resultSet.getString("Vaddress"));
		System.out.println(resultSet.getString("Vdate"));
	}
	}catch(ClassNotFoundException ex) {
		System.out.println(ex.getMessage());
	}catch(SQLException ex) {
		System.out.println(ex.getMessage());
	}
	
}

public static void insertSaleValue(Sale sale) throws ClassNotFoundException,SQLException
{
	try {
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("insert into Sale values(?,?,?)");
	statement.setString(1,sale.getCust_id());
	statement.setString(2,sale.getName());
	statement.setString(3,sale.getJewellery_desc());
	
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("inserted successfully");
	}else
		System.out.println("failed");
	}catch(ClassNotFoundException ex) {
		System.out.println(ex.getMessage());
	}catch(SQLException ex) {
		System.out.println(ex.getMessage());
	}
}
public static void updateSaleValue(Sale sale) throws ClassNotFoundException,SQLException
{
	Connection connection=getConnection();
	PreparedStatement statement=connection.prepareStatement("update Sale set Jewellery_desc=? where Cust_id=?");
	statement.setString(1,sale.getJewellery_desc());
	statement.setString(2,sale.getCust_id());
	
	
	int result=statement.executeUpdate();
	if(result==1)
	{
		System.out.println("updated successfully");
	}else
		System.out.println("failed");
}
public static void selectSaleValue(Sale sale) throws ClassNotFoundException,SQLException
{ 
	Statement statement=getConnection().createStatement();

	ResultSet resultSet= statement.executeQuery("select *from Sale");
	while(resultSet.next())
	{
		System.out.println(resultSet.getString("Cust_id"));
		System.out.println(resultSet.getString("Name"));
		System.out.println(resultSet.getString("Jewellery_desc"));
		
	}
	
}
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	System.out.println("..........WELCOME TO JEWELLERY SHOP........");
		Scanner scanner=new Scanner(System.in);
	
	char ch2;
	do {
		System.out.println("1.Login");
		System.out.println("2.Customers");
		System.out.println("3.Vendors");
		System.out.println("4.Sale");
		
		System.out.println("Enter the value:");
		
		int option1 = scanner.nextInt();
		switch(option1)
		{
		
		case 1:
		System.out.println("Enter Username,Password");
		String Username=scanner.next();
		String Password=scanner.next();
		Login login=new Login(Username,Password);
	char ch;
	do {
		System.out.println("1.insert");
		System.out.println("2.select");
		
		int op=scanner .nextInt();
		switch(op)
		{
		case 1:
			insertLoginValue(login);
		break;
		case 2:selectLoginValue(login);
		break;
		
		
		default : System.out.println("Enter valid option");
		break;
		}
		System.out.println("Do you wants to continue:");
		ch=scanner.next().charAt(0);
	  }while(ch=='y' || ch=='Y');
		break;
		
		 
		case 2:
			System.out.println("Enter Cust_id,Name,Address,Date");
			String Cust_id=scanner.next();
			String Name=scanner.next();
			String Address=scanner.next();
			String Date=scanner.next();
			Customers customers=new Customers(Cust_id,Name,Address,Date);
			char ch1;
			do {
				System.out.println("1.insert");
				System.out.println("2.update");
				System.out.println("3.delete");
				System.out.println("4.select");
				int op=scanner.nextInt();
				switch(op)
				{
				case 1:insertCustomersValue(customers);
				break;
				
				case 2:updateCustomersValue(customers);
				break;
				
				case 3:deleteCustomersValue(customers);
				break;
				
				case 4:selectCustomersValue(customers);
				break;
				
				default : System.out.println("Enter valid option");
				break;
				}
				System.out.println("Do you wants to continue:");
				ch1=scanner.next().charAt(0);
			  }while(ch1=='y' || ch1=='Y');
				break;
				
	
				
				
		case 3:
			System.out.println("Enter Vendor_id,Vname,Vaddress,Vdate");
			String Vendor_id=scanner.next();
			String Vname=scanner.next();
			String Vaddress=scanner.next();
			String Vdate=scanner.next();
			Vendors vendors=new Vendors(Vendor_id,Vname,Vaddress,Vdate);
			char ch3;
			do {
				System.out.println("1.insert");
				System.out.println("2.update");
				System.out.println("3.delete");
				System.out.println("4.select");
				
				int op=scanner.nextInt();
				switch(op)
				{
				case 1 :insertVendorsValue(vendors);
				break;
				
				case 2:updateVendorsValue(vendors);
				break;
				
				case 3:deleteVendorsValue(vendors);
				break;
				
				case 4:selectVendorsValue(vendors);
				break;
				
				
				
				default : System.out.println("Enter valid option");
				break;
				}
				System.out.println("Do you wants to continue:");
				ch3=scanner.next().charAt(0);
			  }while(ch3=='y' || ch3=='Y');
				break;
				
				
    case 4:
    	System.out.println("Enter Cust_id,Name,Jewellery_desc");
		String Cust_id1=scanner.next();
		String Name1=scanner.next();
		String Jewellery_desc=scanner.next();
    	Sale sale=new Sale(Cust_id1,Name1,Jewellery_desc);
	char ch4;
	do {
		System.out.println("1.insert");
		System.out.println("2.update");
		System.out.println("3.select");
		int op=scanner.nextInt();
		switch(op)
		{
		case 1 :insertSaleValue(sale);
		break;
		
		case 2:updateSaleValue(sale);
		
		break;
		
		case 3:selectSaleValue(sale);
		break;
		
		
		default : System.out.println("Enter valid option");
		break;
		}
		System.out.println("Do you wants to continue:");
		ch4=scanner.next().charAt(0);
	  }while(ch4=='y' || ch4=='Y');
		break;
		
    default : System.out.println("Enter valid option");
	break;
	}
	System.out.println("Do you wants to continue:");
	ch2=scanner.next().charAt(0);
  }while(ch2=='y' || ch2=='Y');
	
	
}
	
	

		
	
	




}

		






		

	
		


