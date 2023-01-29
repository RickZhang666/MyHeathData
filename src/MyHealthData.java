/**
 * This class to records patient's information and calculates patient's BMI, heart rate range, then make a report 
 * <p>Name: 22F Assignment 1</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 02, 2022</p>
 * <p>Section: 313</p>

 * @author Rick Zhang
 * @see java.time.LocalDate
 * @see java.util.Calendar
 * @see java.util.Scanner
 * @version 2.0
 * @since 11.0.15
 */
//22F CST8284
//Assignment 1: MyHealthData.java
//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


//START CODE
public class MyHealthData{
	/**patient's first name */
	private String firstName;
	/**patient's last name */
	private String lastName;
	/**patient's gender */
	private String gender;
	/**which year of patient's birth */
	private int birthYear;
	/**which year of right now */
	private int currentYear;
	/**patient's height */
	private double height;
	/**patient's weight */
	private double weight;
//END CODE


// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
//	public MyHealthData() {
//		this(null,null,null,0,0,0,0);
//	}
	/**
    the default constructor enters the information received from the patients.
    @param firstName patient's first name
    @param lastName patient's last name
    @param gender patient's gender
    @param birthYear which year of patient's birth
    @param currentYear which year of right now
    @param height patient's height in inches
    @param weight patient's weight in pounds
    */
	public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;
	}
//END CODE



//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	/**
	 Returns the first name of patient.
	 @return the first name of patient.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * Sets the first name for patient.
	 * @param firstName the first name of patient.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 Returns the last name of patient.
	 @return the last name of patient.
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Sets the last name for patient.
	 * @param lastName the last name of patient.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 Returns the gender of patient.
	 @return the gender of patient.
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Sets the gender for patient.
	 * @param gender the gender of patient.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 Returns which year of patient's birth.
	 @return which year of patient's birth.
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * Sets the year of patient's birth for patient.
	 * @param birthYear the year of patient's birth of patient.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 Returns which year of right now.
	 @return which year of right now.
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
	 * Sets the year for right now.
	 * @param currentYear the year of right now.
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	/**
	 Returns the height of patient.
	 @return the height of patient.
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * Sets the height for patient.
	 * @param height the height of patient.
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 Returns the weight of patient.
	 @return weight the weight of patient.
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * Sets the weight for patient.
	 * @param weight the weight of patient.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 This method calculate the age of patient.
	 @return the age of patient.
	 */
	public int getAge() {
		return (getCurrentYear() - getBirthYear());
	}
	/**
	 This method calculate the maximum heart rate of patient.
	 @return the maximum heart rate of patient.
	 */
	public int getMaximumHeartRate() {
		return (220 - getAge());
	}
	/**
	 This method calculate the maximum target heart rate of patient.
	 @return the maximum target heart rate of patient.
	 */
	public double getMaximumTargetHeartRate() {
		return(getMaximumHeartRate() * 0.85);
	}
	/**
	 This method calculate the minimum target heart rate of patient.
	 @return the minimum target heart rate of patient.
	 */
	public double getMinimumTargetHeartRate() {
		return(getMaximumHeartRate() * 0.5);
	}

// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!

	/**
	 This method calculate the BMI of patient.
	 @return the BMI of patient.
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	} 

// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

	/**
	 This method make a report of patient's information ,then output it on the screen.
	 */
	public void displayMyHealthData() {

//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
   
//START CODE
		System.out.printf("The patient information is: \r"+
					  "First Name: " + getFirstName() + "\r" + 
					  "Last Name: " + getLastName() + "\r" +
					  "Gender: " + getGender() + "\r" +
					  "Date of year: " + getBirthYear() + "\r" +
					  "Age: " + getAge() + "\r" + 
					  "%s%.2f%s\r"
					  + "%s%.2f%s\r"
					  + "%s%.1f\r"
					  + "%s%d\r"
					  + "%s%.2f%s%.2f\r",
					  "Height: ", getHeight(), " inches", 
					  "Weight: ", getWeight(), " pounds", 
					  "BMI: ", getBMI(),
					  "Maximum heart rate: ", getMaximumHeartRate(),
					  "Target heart rate range: from ", getMinimumTargetHeartRate(), " to ", getMaximumTargetHeartRate());
//END CODE

//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");   
} 

} // end class MyHealthData



