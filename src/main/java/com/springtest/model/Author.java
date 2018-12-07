package com.springtest.model;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
@Table
public class Author extends BaseModel<Long> {
    @Column
    private String firstName;
    @Column
    private String secondsName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondsName() {
        return secondsName;
    }

    public void setSecondsName(String secondsName) {
        this.secondsName = secondsName;
    }


}
