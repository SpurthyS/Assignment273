package domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Spurthy on 2/27/2015.
 */
public class Moderator {

    private Integer id = 0;
    @NotNull
    @Size(min = 1)
    private String name;
    @NotNull
    @Size(min = 1)
    @NotEmpty
    private String email;
    @NotNull
    @Size(min = 1)
    private String password;
    private String created_at;
    @JsonIgnore
    private List<Poll> polls = new ArrayList<Poll>();

    public Moderator(){
    }

//    public Moderator(Integer id, String name, String email, String password, String created_at) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.created_at = created_at;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<Poll> getPolls() {
        return polls;
    }

    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }
}
