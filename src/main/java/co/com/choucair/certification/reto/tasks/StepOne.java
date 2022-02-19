package co.com.choucair.certification.reto.tasks;


import co.com.choucair.certification.reto.userinterface.TellUsAboutYourself;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class StepOne implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strLanguage;


    public StepOne(String strFirstName,
                   String strLastName,
                   String strEmail,
                   String strLanguage)
    {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strLanguage = strLanguage;

    }

    public static StepOne thePage(String[] personalData) {
        return Tasks.instrumented(StepOne.class,personalData);
    }
    @Override
    public<T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(TellUsAboutYourself.JOIN_TODAY_BUTTON),
                Enter.theValue(strFirstName).into(TellUsAboutYourself.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(TellUsAboutYourself.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(TellUsAboutYourself.INPUT_EMAIL),
                Click.on(TellUsAboutYourself.MONTH_VALUE),
                Click.on(TellUsAboutYourself.DAY_VALUE),
                Click.on(TellUsAboutYourself.YEAR_VALUE),
                Enter.theValue(strLanguage).into(TellUsAboutYourself.SELECT_LANGUAGE),
                Hit.the(Keys.ENTER).into(TellUsAboutYourself.SELECT_LANGUAGE),
                Click.on(TellUsAboutYourself.ABOUT_NEXT_BUTTON)
        );
    }

}
