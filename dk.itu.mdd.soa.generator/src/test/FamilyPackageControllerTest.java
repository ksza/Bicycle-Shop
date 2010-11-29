package test;
import generated.FamilyPackageController;
public class FamilyPackageControllerTest {

	/** 
	 * This main method simulates that a concrete user orders a travel package 
	 * The data below is what the user has specified at the web 
	 * When this program is executed, then the executeProcess method is called with these 
	 * data, and the package is created 
	 * @param args 
	 */
	public static final void main(String args[]) {
		System.out
				.println("Starting order simulation of a customer ordering a travel package");

		String[] params = new String[6];

		// Data for startDate 
		params[0] = "29-11-2010";

		// Data for numberOfPeople 
		params[1] = "4";

		// Data for rentCar 
		params[2] = "true";

		// Data for cprNumber 
		params[3] = "1802883397";

		// Data for numberofDays 
		params[4] = "5";

		// Data for flightTime 
		params[5] = "4";

		// Now execute the process ordering for the concrete customer 
		FamilyPackageController controller = new FamilyPackageController();
		controller.executeProcess(params);

		System.out.println("End order simulation");
	}
}
