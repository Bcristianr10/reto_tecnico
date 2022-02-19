package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.TellUsAboutYourDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class StepThree implements Task {
    private String strComputerOperatingSystem;
    private String strVersion;
    private String strComputerLanguage;
    private String strMobilDevice;
    private String strDeviceModel;
    private String strDeviceOperatingSystem;

    public StepThree(String[] computerData, String [] mobileDeviceData) {
        this.strComputerOperatingSystem = computerData[0];
        this.strVersion = computerData[1];
        this.strComputerLanguage = computerData[2];
        this.strMobilDevice = mobileDeviceData[0];
        this.strDeviceModel = mobileDeviceData[1];
        this.strDeviceOperatingSystem = mobileDeviceData[2];
    }

    public static StepThree thePage(String [] computerData, String [] mobileDeviceData) {
        return Tasks.instrumented(StepThree.class,computerData,mobileDeviceData);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER),
                Enter.theValue(strComputerOperatingSystem).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_TEXT),
                Hit.the(Keys.ENTER).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_TEXT),
                Click.on(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_VERSION),
                Enter.theValue(strVersion).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_VERSION_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_VERSION_TEXT),
                Hit.the(Keys.ENTER).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_VERSION_TEXT),
                Click.on(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_LANGUAGE),
                Enter.theValue(strComputerLanguage).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_LANGUAGE_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_LANGUAGE_TEXT),
                Hit.the(Keys.ENTER).into(TellUsAboutYourDevices.INPUT_SELECT_COMPUTER_LANGUAGE_TEXT),
                Click.on(TellUsAboutYourDevices.INPUT_SELECT_MOBIL),
                Enter.theValue(strMobilDevice).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_TEXT),
                Hit.the(Keys.ENTER).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_TEXT),
                Click.on(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_MODEL),
                Enter.theValue(strDeviceModel).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_MODEL_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_MODEL_TEXT),
                Hit.the(Keys.ENTER).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_MODEL_TEXT),
                Click.on(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_OS),
                Enter.theValue(strDeviceOperatingSystem).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_OS_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_OS_TEXT),
                Hit.the(Keys.ENTER).into(TellUsAboutYourDevices.INPUT_SELECT_MOBIL_OS_TEXT),
                Click.on(TellUsAboutYourDevices.DEVICE_NEXT_BUTTON)
        );
    }
}
