package com.helder.domain;

import javax.persistence.*;

@Entity
@Table(name = "TBL_USERS")
public class User {


    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    public int getId() {
        return id;
    }

  /*  public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
