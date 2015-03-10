package domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Spurthy on 2/27/2015.
 */

public class Poll {

    private String id;
    @NotNull
    @Size(min=1)
    private String question;
    @NotNull
    @NotEmpty
    private String[] choice = new String[2];
    private Integer[] results = new Integer[2];
    @NotNull
    private String started_at;
    @NotNull
    private String expired_at;

    public Poll() {
    }

    public Poll(String id, String question, Integer[] results, String started_at, String expired_at) {
        this.id = id;
        this.question = question;
        this.results = results;
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

    public Integer[] getResults() {
        return results;
    }

    public void setResults(Integer[] results) {
        this.results = results;
    }

    public String getChoiceForIndex(int i) {
        return choice[i];
    }

    public void setChoiceForIndex(String choice, int choiceIndex) {
        this.choice[choiceIndex] = choice;
    }

    public int getResultsForIndex(int i) {
        if(results[i] == null){
            return 0;
        } else
        return results[i];
    }

    public void setResultsForIndex(int index) {
        if(this.results[index] == null){
            this.results[index] = 1;
        } else {
            this.results[index] = this.results[index] + 1;
        }
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
