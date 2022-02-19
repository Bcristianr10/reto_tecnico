package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TellUsAboutYourself {
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
}
