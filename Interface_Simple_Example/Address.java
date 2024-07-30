package New;

public class Address {
	private String Flatno,Societyname,Area ;
	private int Pincode;
	public String getFlatno() {
		return Flatno;
	}
	public void setFlatno(String flatno) {
		Flatno = flatno;
	}
	public String getSocietyname() {
		return Societyname;
	}
	public void setSocietyname(String societyname) {
		Societyname = societyname;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [Flatno=" + Flatno + ", Societyname=" + Societyname + ", Area=" + Area + ", Pincode=" + Pincode
				+ "]";
	}
	
}
