import java.util.ArrayList;
class Student extends Person{
	Boolean International = false;
	ArrayList<Enroll> enrolled;
	Student(String first,String last, String dob,String phone,//
	 		Address address,Boolean International){
			super(first,last,dob,phone,address);
			this.International=International;
			this.enrolled=new ArrayList<Enroll>();
	}

	Student(String first,String last, String dob,String phone,//
			ArrayList<Address> addresses,Boolean International){
			super(first,last,dob,phone,addresses);
			this.International=International;
			this.enrolled=new ArrayList<Enroll>();
	}

	void addEnrolled(Enroll enroll){
		try{
			if(!(enroll instanceof Enroll)){
				Exception e = new Exception("Invalid Enroll");
				throw e;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		enrolled.add(enroll);
	}

	Boolean is_on_probation(){
		return false;
	}

	Boolean is_parttime(){
		return enrolled.size()<=3;
	}
}
