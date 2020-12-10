package co.com.choucair.pruebabancolombia.usernameinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {

    public static final Target INPUT_YOUR_COMPUTER = Target.the("input for the computer the user")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]"));

    public static final Target OPTION_DROPDOWN_COMPUTER = Target.the("dropdown for the computer the user")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-3-1\"]/span/div"));

    public static final Target INPUT_VERSION = Target.the("input for the version the computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]"));

    public static final Target OPTION_DROPDOWN_VERSION = Target.the("dropdown for the version the computer")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-4-16\"]/span/div"));

    public static final Target INPUT_LANGUAGE = Target.the("input for the language the computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]"));

    public static final Target OPTION_DROPDOWN_LANGUAGE = Target.the("dropdown for the language the computer")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-5-10\"]/span/div"));

    public static final Target INPUT_YOUR_MOBILE = Target.the("input for the mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));

    public static final Target OPTION_DROPDOWN_MOBILE = Target.the("dropdown for the mobile")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-6-37\"]/span/div"));

    public static final Target INPUT_MODEL = Target.the("input for the model mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));

    public static final Target OPTION_DROPDOWN_MODEL = Target.the("dropdown for the model mobile")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-7-18\"]/span/div"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("input for the operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));

    public static final Target OPTION_DROPDOWN_SYSTEM = Target.the("dropdown for the operating system")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-8-12\"]/span/div"));

    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));


}
