package domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Spurthy on 3/4/2015.
 */
public class PollWithoutResults {

    private String id;
    @NotNull
    @Size(min=1)
    private String question;
    @NotNull
    @NotEmpty
    private String[] choice = new String[2];
    @NotNull
    private String started_at;
    @NotNull
    private String expired_at;
    public PollWithoutResults() {
    }

    public PollWithoutResults(String id, String question, String[] choice, String started_at, String expired_at) {
        this.id = id;
        this.question = question;
        this.choice = choice;
        this.started_at = started_at;
        this.expired_at = expired_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getChoice() {
        return choice;
    }

    public void setChoice(String[] choice) {
        this.choice = choice;
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    public String getExpired_at() {
        return expired_at;
    }

    public void setExpired_at(String expired_at) {
        this.expired_at = expired_at;
    }
}
