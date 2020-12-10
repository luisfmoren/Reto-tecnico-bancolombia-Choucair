package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.usernameinterface.PersonalInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class PersonalInformation implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;

    public PersonalInformation(String firstName, String lastName, String email, String month, String day, String year){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.month=month;
        this.day=day;
        this.year=year;
    }

    public static Performable the(String firstName, String lastName, String email, String month, String day, String year) {
        return Tasks.instrumented(PersonalInformation.class,firstName,lastName,email,month,day,year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PersonalInformationPage.BUTTON_SIGNIN),
                Enter.theValue(firstName).into(PersonalInformationPage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(PersonalInformationPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(PersonalInformationPage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(month).from(PersonalInformationPage.DROPDOWN_DATE_MONTH),
                SelectFromOptions.byVisibleText(day).from(PersonalInformationPage.DROPDOWN_DATE_DAY),
                SelectFromOptions.byVisibleText(year).from(PersonalInformationPage.DROPDOWN_DATE_YEAR),
                Click.on(PersonalInformationPage.BUTTON_NEXT));
    }
}
