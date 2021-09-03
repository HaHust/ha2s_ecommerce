/*
 * @created 03/09/2021 - 10:04 PM
 * @author vanha
 */

package com.ha2s.ecommerce.entity.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="ha2s_user_address")
@Getter
@Setter
@ToString
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user_adress")
    private int id_user_adress;

    @Column(name = "address")
    private String address;

    public UserAddress() {
    }

    public UserAddress(String address) {
        this.address = address;
    }
}
