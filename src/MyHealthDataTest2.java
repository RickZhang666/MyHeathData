import org.junit.Assert;
import org.junit.Test;
/**
 * This program to test the patient's information system 
 * which records patient's information and calculates patient's BMI, heart rate range, then make a report 
 * <p>Name: 22F Assignment 1</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 02, 2022</p>
 * <p>Section: 313</p>

 * @author Rick Zhang
 * @see org.junit.Assert
 * @see org.junit.Test
 * @version 1.0
 * @since 11.0.15
 */

public class MyHealthDataTest2 {
	/**
	  * {@value #EPSILON}
	  */
	private static final double EPSILON = 1E-12;
	@Test //id = 1
	/** this is a test program for method getBMI()*/
	public void testGetBMI() {
		MyHealthData mhd = new MyHealthData(null, null, null, 0, 0, 0, 0);
		/**
		  * {@value #HEIGHT}
		  */
		final double HEIGHT = 70;
		/**
		  * {@value #WEIGHT}
		  */
		final double WEIGHT = 160;
		/**
		  * {@value #RESULT}
		  */
		final double RESULT = (WEIGHT * 703) / (HEIGHT * HEIGHT);
		mhd.setHeight(HEIGHT);
		mhd.setWeight(WEIGHT);
		Assert.assertEquals(RESULT, mhd.getBMI(), EPSILON);
	}

}
