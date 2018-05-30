/* The Person Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class Person {
	
	//Class Variables
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	//Constructor for no Parameters
	Person(){
		this.firstName = "[First Name]";
		this.lastName = "[Last Name]";
		this.phoneNumber = "[Phone Number]";
		this.email = "[Email}";
	}
	
	//Constructor for all parameters
	Person(String firstName, String lastName, String phoneNumber, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	/* The Get firstName method
	 * @returns firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/* The setFirstName method
	 * @param firstName First Name of person
	 * Sets first name of student
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/* The Get lastName method
	 * @returns lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/* The setLastName method
	 * @param lastName Last Name of person
	 * Sets last name of student
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/* The Get phoneNumber method
	 * @returns Phone Number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	/* The setPhoneNumber method
	 * @param phoneNumber Phone Number of person
	 * Sets phone number of student
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/* The Get Email method
	 * @returns Email
	 */
	public String getEmail() {
		return email;
	}
	
	/* The setEmail method
	 * @param email email of person
	 * Sets email of student
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
