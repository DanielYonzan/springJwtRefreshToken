package com.daniel.jwtandrefreshtoken.repo;

import com.daniel.jwtandrefreshtoken.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Daniel Tamang
 * @since 10/22/2022
 */

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
