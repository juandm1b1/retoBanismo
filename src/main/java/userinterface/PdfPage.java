package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PdfPage extends PageObject {

    public static final Target PDF_NAME = Target.the("PDF name")
            .locatedBy("//title[contains(text(),'Reglamento+Inversi')]");
}
