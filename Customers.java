
public class Customers {
String Cust_id;
String Name;
String Address;
String Date;
public Customers(String cust_id, String name, String address, String date) {
	super();
	this.Cust_id = cust_id;
	this.Name = name;
	this.Address = address;
	this.Date = date;
}
public String getCust_id() {
	return Cust_id;
}
public void setCust_id(String cust_id) {
	Cust_id = cust_id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}

}
