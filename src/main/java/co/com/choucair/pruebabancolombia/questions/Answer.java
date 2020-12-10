package co.com.choucair.pruebabancolombia.questions;

import co.com.choucair.pruebabancolombia.usernameinterface.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer (String question){
        this.question=question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String text = Text.of(LastStepPage.WELCOME_PAGE).viewedBy(actor).asString();
        if(question.equals(text)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}
