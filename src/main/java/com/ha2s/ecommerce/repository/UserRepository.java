/*
 * @created 03/09/2021 - 7:38 PM
 * @author vanha
 */

package com.ha2s.ecommerce.repository;

import com.ha2s.ecommerce.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
