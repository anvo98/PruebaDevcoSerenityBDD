package steps;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageObject.*;

public class stepsTravelocity extends ScenarioActor {

	@Steps(shared = true)
	pageFlights pageFlights;
	pageFlightsSearch pageFlightsSearch;
	pageFlightsDetails pageFlightsDetails;
	pageHotels pageHotels;
	pageHotelsSearch pageHotelsSearch;
	pageSignIn pageSignIn;
	pageCars pageCars;
	pageCruises pageCruises;

	//Step pageFlights
	@Step("#actor Ingresa a la pagina https://www.travelocity.com/")
	public void ingresaASitioWeb() throws UnsupportedFlavorException, IOException {

		pageFlights.setDefaultBaseUrl("https://www.travelocity.com/");
		pageFlights.open();
	}

	@Step("#actor ingresa a la seccion de vuelos")
	public void chooseFlightsRoundtrip()  {
		pageFlights.chooseFlightsRoundtrip();

	}
	@Step("#actor escoge su ciudad de origen y destino")
	public void chooseFlightsRoundtripCities(String ciudadOrigen, String ciudadDestino) throws InterruptedException {
		pageFlights.chooseFlightsRoundtripCities(ciudadOrigen,ciudadDestino);

	}
	@Step("#actor ingresa la fecha de su vuelo")
	public void chooseFlightsRoundtripDates() throws InterruptedException {
		pageFlights.chooseFlightsRoundtripDates();

	}
	@Step("#actor busca su vuelo ")
	public void chooseFlightsRoundtripsearch() throws InterruptedException {
		pageFlights.chooseFlightsRoundtripsearch();
	}
	//Step pageFlightsSearch
	@Step("#actor selecciona el vuelo de destino, regreso y da clic en continuar ")
	public void selectFlight() throws InterruptedException {
		pageFlightsSearch.selectFlight();
	}

	//Step pageFlightsDetails
	@Step("#actor valida el vuelo seleccionado")
	public void assertPriceSummary() throws InterruptedException {
		pageFlightsDetails.assertPriceSummary();
	}
	//Step pageHotels
	@Step("#actor busca el destino de su hotel ")
	public void chooseHotelsdestination() throws InterruptedException {
		pageHotels.chooseHotelsdestination();
	}
	@Step("#actor elige las fechas de su hospedaje")
	public void chooseHotelsDate() throws InterruptedException {
		pageHotels.chooseHotelsDate();
	}
	@Step("#actor escoje el numero de personas y da click en buscar ")
	public void chooseHotelTravelers() throws InterruptedException {
		pageHotels.chooseHotelTravelers();
	}

	//Step pageHotelsSearch
	@Step("# busca el hotel Suites at Congress Ocean Drive")
	public void chooseHotel() throws InterruptedException {
		pageHotelsSearch.chooseHotel();
	}
	@Step("# escoge el hotel y su habitacion")
	public void searchHotel() throws InterruptedException {
		pageHotelsSearch.searchHotel();
	}
	@Step("#actor valida las tarifas de su hospedaje ")
	public void assertPriceHotel() throws InterruptedException {
		pageHotelsSearch.assertPriceHotel();
	}
	//Step pageSignIn
	@Step("#actor ingresa a iniciar sesion ")
	public void getInSignIn() throws InterruptedException {
		pageSignIn.getInSignIn();
	}
	@Step("#actor ingresa sus datos ")
	public void sendKeysSignIn() throws InterruptedException {
		pageSignIn.sendKeysSignIn();
	}
	@Step("#actor valida que se active el recaptcha ")
	public void assertRecaptcha() throws InterruptedException {
		pageSignIn.assertRecaptcha();
	}
	//Step pageCars
	@Step("#actor Busca las ciudades donde recogera el vehiculo y lo dejara")
	public void searchCarRentalsCities(String ciudadOrigen,String	ciudadDestino) throws InterruptedException {
		pageCars.searchCarRentalsCities(ciudadOrigen,ciudadDestino);

	}
	@Step("#actor ingresa la fecha inicial y final de la renta")
	public void searchCarRentalsDate() throws InterruptedException {
		pageCars.searchCarRentalsDate();

	}
	@Step("#actor ingresa la hora inicial y final de la renta y da click en buscar")
	public void searchCarRentalsTime( String horaRecogida,String horaEntrega) throws InterruptedException {
		pageCars.searchCarRentalsTime(horaRecogida,horaEntrega);
	}
	@Step("#actor selecciona un vehiculo")
	public void searchCarRentalsitems() throws InterruptedException {
		pageCars.searchCarRentalsitems();
	}
	@Step("#actor valida los datos del vehiculo escogido")
	public void assertSearchCarRentals() throws InterruptedException {
		pageCars.assertSearchCarRentals();
	}
	//Step pageCruises
	@Step("#actor ingresa los datos del formulario y da click en buscar")
	public void chooseCruisesGoinTo() throws InterruptedException {
		pageCruises.chooseCruisesGoinTo();
	}
	@Step("#actor escoge un crucero y su habitacion ")
	public void chooseCruise() throws InterruptedException {
		pageCruises.chooseCruise();
	}
	@Step("#actor valida los datos del crucero escogido")
	public void assertSearchCruises() throws InterruptedException {
		pageCruises.assertSearchCruises();
	}
}
