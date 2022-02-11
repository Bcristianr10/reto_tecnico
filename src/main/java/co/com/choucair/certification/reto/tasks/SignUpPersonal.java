package co.com.choucair.certification.reto.tasks;


import co.com.choucair.certification.reto.userinterface.RegisterUTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class SignUpPersonal implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;

    private String strLanguage;
    private String strCity;
    private String strPostalCode;
    private String strCountry;

    private String strComputerOperatingSystem;
    private String strVersion;
    private String strComputerLanguage;
    private String strMobilDevice;
    private String strDeviceModel;
    private String strDeviceOperatingSystem;
    private String strPassword;

    public SignUpPersonal(String[] personalData,String[] personalLocation,String[] deviceData)
    {
        this.strFirstName = personalData[0];
        this.strLastName = personalData[1];
        this.strEmail = personalData[2];
        this.strLanguage = personalData[3];
        this.strPassword = personalData[4];

        this.strCity = personalLocation[0];
        this.strPostalCode = personalLocation[1];
        this.strCountry = personalLocation[2];

        this.strComputerOperatingSystem = deviceData[0];
        this.strVersion = deviceData[1];
        this.strComputerLanguage = deviceData[2];
        this.strMobilDevice = deviceData[3];
        this.strDeviceModel = deviceData[4];
        this.strDeviceOperatingSystem = deviceData[5];
    }

    public static SignUpPersonal thePage(String[] personalData,String[] personalLocation,String[] deviceData) {
        return Tasks.instrumented(SignUpPersonal.class,
                personalData,personalLocation,deviceData);
    }
    @Override
    public<T extends Actor> void performAs (T actor){
        actor.attemptsTo(Click.on(RegisterUTest.JOIN_TODAY_BUTTON),
                Enter.theValue(strFirstName).into(RegisterUTest.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(RegisterUTest.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(RegisterUTest.INPUT_EMAIL),
                Click.on(RegisterUTest.MONTH_VALUE),
                Click.on(RegisterUTest.DAY_VALUE),
                Click.on(RegisterUTest.YEAR_VALUE),
                Enter.theValue(strLanguage).into(RegisterUTest.SELECT_LANGUAGE),
                Hit.the(Keys.ENTER).into(RegisterUTest.SELECT_LANGUAGE),
                Click.on(RegisterUTest.ABOUT_NEXT_BUTTON),
                Enter.theValue(strCity).into(RegisterUTest.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_CITY),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_CITY),
                Enter.theValue(strPostalCode).into(RegisterUTest.INPUT_POSTAL_CODE),
                Click.on(RegisterUTest.INPUT_COUNTRY),
                Enter.theValue(strCountry).into(RegisterUTest.INPUT_COUNTRY_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_COUNTRY_TEXT),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_COUNTRY_TEXT),
                Click.on(RegisterUTest.ADDRESS_NEXT_BUTTON),
                Click.on(RegisterUTest.INPUT_SELECT_COMPUTER),
                Enter.theValue(strComputerOperatingSystem).into(RegisterUTest.INPUT_SELECT_COMPUTER_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_SELECT_COMPUTER_TEXT),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_SELECT_COMPUTER_TEXT),
                Click.on(RegisterUTest.INPUT_SELECT_COMPUTER_VERSION),
                Enter.theValue(strVersion).into(RegisterUTest.INPUT_SELECT_COMPUTER_VERSION_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_SELECT_COMPUTER_VERSION_TEXT),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_SELECT_COMPUTER_VERSION_TEXT),
                Click.on(RegisterUTest.INPUT_SELECT_COMPUTER_LANGUAGE),
                Enter.theValue(strComputerLanguage).into(RegisterUTest.INPUT_SELECT_COMPUTER_LANGUAGE_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_SELECT_COMPUTER_LANGUAGE_TEXT),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_SELECT_COMPUTER_LANGUAGE_TEXT),
                Click.on(RegisterUTest.INPUT_SELECT_MOBIL),
                Enter.theValue(strMobilDevice).into(RegisterUTest.INPUT_SELECT_MOBIL_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_SELECT_MOBIL_TEXT),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_SELECT_MOBIL_TEXT),
                Click.on(RegisterUTest.INPUT_SELECT_MOBIL_MODEL),
                Enter.theValue(strDeviceModel).into(RegisterUTest.INPUT_SELECT_MOBIL_MODEL_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_SELECT_MOBIL_MODEL_TEXT),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_SELECT_MOBIL_MODEL_TEXT),
                Click.on(RegisterUTest.INPUT_SELECT_MOBIL_OS),
                Enter.theValue(strDeviceOperatingSystem).into(RegisterUTest.INPUT_SELECT_MOBIL_OS_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUTest.INPUT_SELECT_MOBIL_OS_TEXT),
                Hit.the(Keys.ENTER).into(RegisterUTest.INPUT_SELECT_MOBIL_OS_TEXT),
                Click.on(RegisterUTest.DEVICE_NEXT_BUTTON),
                Enter.theValue(strPassword).into(RegisterUTest.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(RegisterUTest.INPUT_PASSWORD_CONFIRM),
                Click.on(RegisterUTest.CHECK_STAY_INFORMED),
                Click.on(RegisterUTest.CHECK_TERMS_USER),
                Click.on(RegisterUTest.CHECK_STAY_PRIVACY_SECURITY),
                Click.on(RegisterUTest.BUTTON_ADD_USER)
        );
    }

}
