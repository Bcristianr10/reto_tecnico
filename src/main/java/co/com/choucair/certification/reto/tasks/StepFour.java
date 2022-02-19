package co.com.choucair.certification.reto.tasks;


import co.com.choucair.certification.reto.userinterface.TheLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepFour implements Task {
    private String strPassword;

    public StepFour(String strPassword) {
        this.strPassword = strPassword;
    }

    public static StepFour thePage(String strPassword) {
        return Tasks.instrumented(StepFour.class,strPassword);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Enter.theValue(strPassword).into(TheLastStep.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(TheLastStep.INPUT_PASSWORD_CONFIRM),
                Click.on(TheLastStep.CHECK_STAY_INFORMED),
                Click.on(TheLastStep.CHECK_TERMS_USER),
                Click.on(TheLastStep.CHECK_STAY_PRIVACY_SECURITY),
                Click.on(TheLastStep.BUTTON_ADD_USER)
        );
    }
}
