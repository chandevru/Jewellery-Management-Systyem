
public class Sale {
String Cust_id;
String Name;
String Jewellery_desc;
public Sale(String cust_id, String name, String jewellery_desc) {
	super();
	this.Cust_id = cust_id;
	this.Name = name;
	this.Jewellery_desc = jewellery_desc;
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
public String getJewellery_desc() {
	return Jewellery_desc;
}
public void setJewellery_desc(String jewellery_desc) {
	Jewellery_desc = jewellery_desc;
}

}
