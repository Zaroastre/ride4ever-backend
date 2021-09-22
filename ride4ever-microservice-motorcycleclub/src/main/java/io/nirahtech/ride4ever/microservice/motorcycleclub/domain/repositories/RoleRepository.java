package io.nirahtech.ride4ever.microservice.motorcycleclub.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.api.RoleApi;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.Role;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, String>, RoleApi {
    
}
