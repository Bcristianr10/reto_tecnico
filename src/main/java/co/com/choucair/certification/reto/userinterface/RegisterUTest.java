package co.com.choucair.certification.reto.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUTest {

    public static final Target JOIN_TODAY_BUTTON = Target
            .the("button that shows us the form to signup")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public  static final Target INPUT_FIRST_NAME = Target
            .the("write first name the user")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target
            .the("write last name the user").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target
            .the("write email the user").located(By.id("email"));
    public static  final Target MONTH_VALUE = Target
            .the("Select month his birth month")
            .located(By.xpath("//*[@id=\"birthMonth\"]/option[9]"));
    public static  final Target DAY_VALUE = Target
            .the("Select month his birth day")
            .located(By.xpath("//*[@id=\"birthDay\"]/option[11]"));

    public static  final Target YEAR_VALUE = Target
            .the("Select month his birth year")
            .located(By.xpath("//*[@value='number:1998']"));
    public static  final Target SELECT_LANGUAGE = Target
            .the("Select language his birth year")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static  final Target ABOUT_NEXT_BUTTON = Target
            .the("next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static  final Target INPUT_CITY = Target
            .the("write to city")
            .located(By.id("city"));
    public static  final Target INPUT_POSTAL_CODE = Target
            .the("enter postal code")
            .located(By.id("zip"));
    public static  final Target INPUT_COUNTRY = Target
            .the("select input country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static  final Target INPUT_COUNTRY_TEXT = Target
            .the("enter country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target ADDRESS_NEXT_BUTTON = Target
            .the("following requirements")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target INPUT_SELECT_COMPUTER = Target
            .the("select operating system of computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SELECT_COMPUTER_TEXT = Target
            .the("enter operating system of computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target INPUT_SELECT_COMPUTER_VERSION = Target
            .the("select operating system version of computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SELECT_COMPUTER_VERSION_TEXT = Target
            .the("enter operating system version of computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target INPUT_SELECT_COMPUTER_LANGUAGE = Target
            .the("select operating system language of computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SELECT_COMPUTER_LANGUAGE_TEXT = Target
            .the("enter operating system language of computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target INPUT_SELECT_MOBIL = Target
            .the("select mobil device type")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SELECT_MOBIL_TEXT = Target
            .the("enter mobil device type")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target INPUT_SELECT_MOBIL_MODEL = Target
            .the("select model type mobil device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SELECT_MOBIL_MODEL_TEXT = Target
            .the("enter model type mobil device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target INPUT_SELECT_MOBIL_OS = Target
            .the("select operative system of mobil device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SELECT_MOBIL_OS_TEXT = Target
            .the("enter system operative of mobil device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public  static final Target DEVICE_NEXT_BUTTON = Target
            .the("button to redirect next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static  final Target INPUT_PASSWORD = Target
            .the("Enter the password user")
            .located(By.id("password"));
    public static  final Target INPUT_PASSWORD_CONFIRM = Target
            .the("Enter password confirmation")
            .located(By.id("confirmPassword"));
    public static  final Target CHECK_STAY_INFORMED = Target.
            the("check the option to accept to stay informed")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/div[2]"));
    public static  final Target CHECK_TERMS_USER = Target.
            the("check the option to accept the UTest Terms of user")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static  final Target CHECK_STAY_PRIVACY_SECURITY = Target.
            the("check the option to accept the privacy and security policy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static  final Target BUTTON_ADD_USER = Target
            .the("press the button to complete add the form user")
            .located(By.id("laddaBtn"));
    public static  final Target CONFIRM_TEXT_WELCOME = Target
            .the("validate welcome at test community")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}

