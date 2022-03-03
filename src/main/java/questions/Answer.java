package questions;

import models.BancolombiaData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PdfPage;

public class Answer implements Question<Boolean> {

    BancolombiaData bancolombiaData;

    public Answer(BancolombiaData bancolombiaData) {
        this.bancolombiaData = bancolombiaData;
    }

//    private String question;
//
//    public Answer(String question) {
//        this.question = question;
//    }

    public static Answer toThe(BancolombiaData bancolombiaData) {
        return new Answer(bancolombiaData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result = false;

        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        System.out.println("result: " + result);
        System.out.println("currentUrl: " + currentUrl);

        if(currentUrl.contains(bancolombiaData.getUrlPdf())) {
            result = true;
        }
        return result;
    }
}
