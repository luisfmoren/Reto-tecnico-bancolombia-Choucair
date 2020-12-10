package co.com.choucair.pruebabancolombia.usernameinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {

    public static final Target INPUT_PASSWORD = Target.the("input for the password")
            .located(By.xpath("//*[@id=\"password\"]"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("input for confirm the password")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));

    public static final Target SECOND_CHECK = Target.the("second check in the page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target THIRD_CHECK = Target.the("third check in the page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("button confirm register")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));

    public static final Target WELCOME_PAGE = Target.the("located text for confirm registration on the page")
            .located(By.xpath("//*[@id=\"side_banner\"]/div[2]/div[1]"));
}
