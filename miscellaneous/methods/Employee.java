package miscellaneous.methods;

public class Employee {

	int idnum;
	String name;
	String address;
	String phone;
	String email;

	public Employee(int idnum, String name, String address, String phone, String email) {
		super();
		this.idnum = idnum;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		System.out.printf("%s: %d, %s, %s, %s%n", name, idnum, address, phone, email);
	}

	@Override
	public String toString() {
		return "Employee [idnum=" + idnum + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email="
				+ email + "]";
	}

}
