package co.com.choucair.pruebabancolombia.usernameinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformationPage {
    public static final Target BUTTON_SIGNIN = Target.the("button for register the user")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRST_NAME = Target.the("input for the first name the user")
            .located(By.xpath("//*[@id=\"firstName\"]"));

    public static final Target INPUT_LAST_NAME = Target.the("input for the last name the user")
            .located(By.xpath("//*[@id=\"lastName\"]"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("input for the email the user")
            .located(By.xpath("//*[@id=\"email\"]"));

    public static final Target DROPDOWN_DATE_MONTH = Target.the("dropdown for the month of birth the user")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));

    public static final Target DROPDOWN_DATE_DAY = Target.the("dropdown for the day of birth the user")
            .located(By.xpath("//*[@id=\"birthDay\"]"));

    public static final Target DROPDOWN_DATE_YEAR = Target.the("dropdown for the years of birth the user")
            .located(By.xpath("//*[@id=\"birthYear\"]"));

    public static final Target BUTTON_NEXT = Target.the("button for next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
