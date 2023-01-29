import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
/**
 * This program to test the patient's information system 
 * which records patient's information and calculates patient's BMI, heart rate range, then make a report 
 * <p>Name: 22F Assignment 1</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 02, 2022</p>
 * <p>Section: 313</p>

 * @author Rick Zhang
 * @see java.time.LocalDate
 * @see java.util.Calendar
 * @see java.util.Scanner
 * @version 1.0
 * @since 11.0.15
 */


public class MyHealthDataTest {
	
	/**
	 * This is the entry point for the system
	 * ask for input patient's information
	 * record these information and calculate the patient's BMI, heart rate range
	 * output a report on the screen
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyHealthData mhd = new MyHealthData(null, null, null, 0, 0, 0, 0);
		Calendar calendar = Calendar.getInstance();
		String birthDate;
		System.out.print("Please enter patient's first name: ");
		mhd.setFirstName(input.nextLine());
		System.out.print("Please enter patient's last name: ");
		mhd.setLastName(input.nextLine());
		System.out.print("Please enter patient's gender: ");
		mhd.setGender(input.nextLine());
		System.out.print("Please enter patient's birth date(format yyyy-mm-dd): ");
		birthDate = input.nextLine();
		LocalDate bd = LocalDate.parse(birthDate);
		mhd.setBirthYear(bd.getYear());
		mhd.setCurrentYear(calendar.get(Calendar.YEAR));
		System.out.print("Please enter patient's height in inches: ");
		mhd.setHeight(input.nextDouble());
		input.nextLine();
		System.out.print("Please enter patient's weight in pounds: ");
		mhd.setWeight(input.nextDouble());
		input.nextLine();
		input.close();
		mhd.displayMyHealthData();
	}

}
