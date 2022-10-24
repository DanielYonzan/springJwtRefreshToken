package com.daniel.jwtandrefreshtoken.repo;

import com.daniel.jwtandrefreshtoken.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daniel Tamang
 * @since 10/22/2022
 */
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
