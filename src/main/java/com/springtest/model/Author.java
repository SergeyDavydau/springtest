package com.springtest.model;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
@Table
public class Author extends BaseModel {

    @Column
    private String firstName;

    @Column
    private String secondsName;
}
