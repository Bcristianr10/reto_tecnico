package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddYourAddress {
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

}
