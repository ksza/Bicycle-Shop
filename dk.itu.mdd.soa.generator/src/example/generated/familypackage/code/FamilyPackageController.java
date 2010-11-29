package example.generated.familypackage.code;

import java.util.ArrayList;
import java.util.List;
import dk.itu.mdd.services.CarRentalService;
import dk.itu.mdd.services.Service;
import dk.itu.mdd.services.ServiceFactory;
public class FamilyPackageController {

	/**
	 * By executing this method, a travel package will be ordered for a concrete customer
	 * @param args
	 */
	public static void executeProcess(String[] args) {
		System.out.println("Starting ordering package with name:FamilyPackage");

		//
		// Call service  flightService
		//
		// Map data to service
		List flightServiceParams = new ArrayList();
		flightServiceParams.add("Spain : Porto Rico"); // use fixed value defined from SOA model
		flightServiceParams.add(args[3]); // use value from process input
		flightServiceParams.add(args[5]); // use value from process input

		// Invoke service
		Service flightService = ServiceFactory.getInstance().getService(
				"FlightService");
		flightService.execute(flightServiceParams);

		//
		// Call service  hotelService
		//
		// Map data to service
		List hotelServiceParams = new ArrayList();
		hotelServiceParams.add("1"); // use fixed value defined from SOA model
		hotelServiceParams.add(args[4]); // use value from process input
		hotelServiceParams.add(args[3]); // use value from process input

		// Invoke service
		Service hotelService = ServiceFactory.getInstance().getService(
				"HotelService");
		hotelService.execute(hotelServiceParams);

		//
		// Call service  carRentalService
		//
		// Map data to service
		List carRentalServiceParams = new ArrayList();
		carRentalServiceParams.add("0"); // use fixed value defined from SOA model
		carRentalServiceParams.add(args[3]); // use value from process input
		carRentalServiceParams.add(args[0]); // use value from process input
		carRentalServiceParams.add(args[4]); // use value from process input

		// Invoke service
		Service carRentalService = ServiceFactory.getInstance().getService(
				"CarRentalService");
		carRentalService.execute(carRentalServiceParams);

		//
		// Call service  insuranceService
		//
		// Map data to service
		List insuranceServiceParams = new ArrayList();
		insuranceServiceParams.add("123"); // use fixed value defined from SOA model

		// Invoke service
		Service insuranceService = ServiceFactory.getInstance().getService(
				"InsuranceService");
		insuranceService.execute(insuranceServiceParams);

		System.out.println("Finish ordering package with name:FamilyPackage");
	}
}
