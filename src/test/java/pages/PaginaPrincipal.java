package pages;

public class PaginaPrincipal extends BasePage {

    public PaginaPrincipal() {
        super(driver);
    }

    /**
     * Método para navegar a www.freerangetests.com
     */
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
    }

}
