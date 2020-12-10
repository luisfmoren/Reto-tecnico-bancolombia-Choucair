package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.usernameinterface.DevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Device implements Task {
    public static Performable the() {
        return Tasks.instrumented(Device.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicePage.INPUT_YOUR_COMPUTER),
                Click.on(DevicePage.OPTION_DROPDOWN_COMPUTER),
                Click.on(DevicePage.INPUT_VERSION),
                Click.on(DevicePage.OPTION_DROPDOWN_VERSION),
                Click.on(DevicePage.INPUT_LANGUAGE),
                Click.on(DevicePage.OPTION_DROPDOWN_LANGUAGE),
                Click.on(DevicePage.INPUT_YOUR_MOBILE),
                Click.on(DevicePage.OPTION_DROPDOWN_MOBILE),
                Click.on(DevicePage.INPUT_MODEL),
                Click.on(DevicePage.OPTION_DROPDOWN_MODEL),
                Click.on(DevicePage.INPUT_OPERATING_SYSTEM),
                Click.on(DevicePage.OPTION_DROPDOWN_SYSTEM),
                Click.on(DevicePage.BUTTON_NEXT_PAGE));
    }
}
