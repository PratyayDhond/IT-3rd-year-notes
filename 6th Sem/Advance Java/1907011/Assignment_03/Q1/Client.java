 class Client implements java.io.Serializable{
	private int accNo;
	private String firstName,lastName;
	private String email;

	void setAccNo(int accNo){
		this.accNo = accNo;
	}

	void setFirstName(String firstName){
		this.firstName = firstName;
	}

	void setLastName(String lastName){
		this.lastName = lastName;
	}

	void setEmail(String email){
		this.email = email;
	}

	 int getAccNo(){
		 return this.accNo;
	 }

	String getFirstName(){
		return this.firstName;
	}

	String getLastName(){
		return this.lastName;
	}

	String getEmail(){
		return this.email;
	}

}