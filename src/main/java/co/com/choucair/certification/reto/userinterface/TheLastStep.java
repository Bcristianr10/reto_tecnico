package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheLastStep {

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
