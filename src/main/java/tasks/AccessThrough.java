package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import userinterface.PersonPage;

public class AccessThrough implements Task {

    public static AccessThrough theLinks() {
        return Tasks.instrumented(AccessThrough.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PersonPage.ASK_FOR_PRODUCTS_BTN),
                Click.on(PersonPage.INVESTMENTS_LINK),
                Click.on(PersonPage.ARROW_DOWN),
                Wait.until(WebElementQuestion.the(PersonPage.MINIMUM_AMOUNT_BTN), WebElementStateMatchers.isEnabled())
                        .forNoLongerThan(30).seconds(),
                Click.on(PersonPage.MINIMUM_AMOUNT_BTN),
                Click.on(PersonPage.KNOW_MORE_LINK),
                Click.on(PersonPage.DOCS_OPTION),
                Click.on(PersonPage.VIRTUAL_INV_REGULATION_LINK)
        );
    }
}
