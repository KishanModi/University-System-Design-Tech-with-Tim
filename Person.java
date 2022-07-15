import java.util.ArrayList;

class Person {
	String first_name;
	String last_name;
	String dateOfBirth;
	String phone_number;
	ArrayList<Address> addresses;

	/**
	 * @param first
	 * @param last
	 * @param dob
	 * @param phone
	 * @param address
	 */
	Person(String first, String last, String dob, String phone, Address address) {
		this.first_name = first;
		this.last_name = last;
		this.dateOfBirth = dob;
		this.phone_number = phone;
		this.addresses.add(address);
	}

	/**
	 * @param first
	 * @param last
	 * @param dob
	 * @param phone
	 * @param addresses
	 */
	Person(String first, String last, String dob, String phone, ArrayList<Address> addresses) {
		this.first_name = first;
		this.last_name = last;
		this.dateOfBirth = dob;
		this.phone_number = phone;
		for (Address a : addresses) {
			try {
				if (!(a instanceof Address)) {
					Exception e = new Exception("Invalid Address");
					throw e;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.addresses = addresses;
	}
}
