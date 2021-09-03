/*
 * @created 03/09/2021 - 10:47 PM
 * @author vanha
 */

package com.ha2s.ecommerce.model.dto;

import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Data
public class UserDto {

    private int id_user;

    private String name_user;

    private String telephone_user;

    private String email_user;
}
