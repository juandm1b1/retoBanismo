package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PersonPage extends PageObject {

    public static final Target ASK_FOR_PRODUCTS_BTN = Target.the("Asking for products button")
            .locatedBy("#header-solicitud-productos");

    public static final Target INVESTMENTS_LINK = Target.the("Investments link")
            .locatedBy("#filtro-inversiones");

    public static final Target ARROW_DOWN = Target.the("Arrow down icon")
            .locatedBy("#mostrar-filtros");

    public static final Target MINIMUM_AMOUNT_BTN = Target.the("Minimum amount button")
            .locatedBy("//a[contains(text(), '500.000')]");

    public static final Target KNOW_MORE_LINK = Target.the("Know more link")
            .locatedBy("#filtrado-conoce-inversion-0");

    public static final Target DOCS_OPTION = Target.the("Documents option")
            .locatedBy("//a[contains(text(),'Documentos')]");

    public static final Target VIRTUAL_INV_REGULATION_LINK = Target.the("Link to access to the Virtual Investment Regulation")
            .locatedBy("//button[@class='c-download-rules']/a");
}
