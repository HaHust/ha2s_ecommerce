/*
 * @created 03/09/2021 - 7:38 PM
 * @author vanha
 */

package com.ha2s.ecommerce.entity.user;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ha2s_user")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id_user;

    @Column(name = "name_user")
    private String name_user;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone_user")
    private String telephone_user;

    @Column(name = "email_user")
    private String email_user;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private List<UserAddress> userAddress;

    public User(String name_user, String password, String telephone_user, String email_user, LocalDateTime created_at) {
        this.name_user = name_user;
        this.password = password;
        this.telephone_user = telephone_user;
        this.email_user = email_user;
        this.created_at = created_at;
    }

    public User() {
    }
}
