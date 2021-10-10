package com.blackroot.useraccess.authentication.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user", schema = "authentication")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
