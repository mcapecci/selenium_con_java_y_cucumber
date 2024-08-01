package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    //La descripción del given tiene que ser exactamente igual a como lo definimos en el feature
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
}
