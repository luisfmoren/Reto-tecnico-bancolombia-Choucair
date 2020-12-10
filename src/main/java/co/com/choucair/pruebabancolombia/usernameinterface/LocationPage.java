package co.com.choucair.pruebabancolombia.usernameinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {

    public static final Target INPUT_CITY = Target.the("input for the city the user")
            .located(By.xpath("//*[@id=\"city\"]"));

    public static final Target INPUT_ZIP_POSTAL_CODE = Target.the("input for the postal code the user")
            .located(By.xpath("//*[@id=\"zip\"]"));

    public static final Target INPUT_COUNTRY = Target.the("input for the country the user")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

    public static final Target DROPDOWN_COUNTRY = Target.the("input for the country the user")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-25-46\"]/span/div"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("button for next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
