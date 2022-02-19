package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TellUsAboutYourDevices {

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

}
