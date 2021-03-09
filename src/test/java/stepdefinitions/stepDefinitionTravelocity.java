package stepdefinitions;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.stepsTravelocity;

public class stepDefinitionTravelocity {

	@Steps(actor = "the user devco")
	stepsTravelocity stepsTravelocity;

	@Given("^ingresa al sitio web de travelocity.com$")
	public void ingresarSitioWeb() throws UnsupportedFlavorException, IOException {
		stepsTravelocity.ingresaASitioWeb();
	}

	@When("^el usuario busca un vuelo de (.+) a (.+)$")
	public void stepsFlights(String ciudadOrigen, String ciudadDestino) throws InterruptedException {
		stepsTravelocity.chooseFlightsRoundtrip();
		stepsTravelocity.chooseFlightsRoundtripCities(ciudadOrigen,ciudadDestino);
		stepsTravelocity.chooseFlightsRoundtripDates();
		stepsTravelocity.chooseFlightsRoundtripsearch();
		stepsTravelocity.selectFlight();
	}

	@Then("^el usuario valida la informacion de su vuelo$")
	public void stepsFlightsAssert() throws InterruptedException {
		stepsTravelocity.assertPriceSummary();
	}

	@When("^el usuario busca un hotel$")
	public void chooseHotels() throws InterruptedException {
		stepsTravelocity.chooseHotelsdestination();
		stepsTravelocity.chooseHotelsDate();
		stepsTravelocity.chooseHotelTravelers();
		stepsTravelocity.searchHotel();
		stepsTravelocity.chooseHotel();
	}

	@Then("^el usuario valida la informacion de su hotel$")
	public void assertPriceHotel() throws InterruptedException {
		stepsTravelocity.assertPriceHotel();
	}

	@When("^el usuario Ingresa a Iniciar Sesion y diligencia sus datos$")
	public void getInSignIn() throws InterruptedException {
		stepsTravelocity.getInSignIn();
		stepsTravelocity.sendKeysSignIn();
	}

	@Then("^el usuario valida la restriccion al iniciar sesion$")
	public void assertRecaptcha() throws InterruptedException {
		stepsTravelocity.assertRecaptcha();
	}
	@When("^el usuario Ingresa a rentar carros y diligencia el formulario (.+),(.+),(.+),(.+)$")
	public void searchCarRentals(String ciudadOrigen,String	ciudadDestino,
								 String horaRecogida,String horaEntrega) throws InterruptedException {
		stepsTravelocity.searchCarRentalsCities(ciudadOrigen,ciudadDestino);
		stepsTravelocity.searchCarRentalsDate();
		stepsTravelocity.searchCarRentalsTime(horaRecogida,horaEntrega);
		stepsTravelocity.searchCarRentalsitems();
	}
	@Then("^el usuario valida el vehiculo seleccionado$")
	public void assertSearchCarRentals() throws InterruptedException {
		stepsTravelocity.assertSearchCarRentals();
	}
	@When("^el usuario busca un crucero$")
	public void chooseCruises() throws InterruptedException {
		stepsTravelocity.chooseCruisesGoinTo();
		stepsTravelocity.chooseCruise();
	}
	@Then("^el usuario valida el crucero seleccionado$")
	public void assertSearchCruises() throws InterruptedException {
		stepsTravelocity.assertSearchCruises();
	}

}

