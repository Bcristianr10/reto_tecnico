package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.AddYourAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class StepTwo implements Task {
    private String strCity;
    private String strPostalCode;
    private String strCountry;

    public StepTwo(String strCity,
                   String strPostalCode,
                   String strCountry)
    {
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
    }

    public static StepTwo thePage(String[] personalLocation) {
        return Tasks.instrumented(StepTwo.class,personalLocation);
    }
    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Enter.theValue(strCity).into(AddYourAddress.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(AddYourAddress.INPUT_CITY),
                Hit.the(Keys.ENTER).into(AddYourAddress.INPUT_CITY),
                Enter.theValue(strPostalCode).into(AddYourAddress.INPUT_POSTAL_CODE),
                Click.on(AddYourAddress.INPUT_COUNTRY),
                Enter.theValue(strCountry).into(AddYourAddress.INPUT_COUNTRY_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(AddYourAddress.INPUT_COUNTRY_TEXT),
                Hit.the(Keys.ENTER).into(AddYourAddress.INPUT_COUNTRY_TEXT),
                Click.on(AddYourAddress.ADDRESS_NEXT_BUTTON)
        );


    }
}


