package io.nirahtech.ride4ever.microservice.motorcycleclub.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.MotorcycleClub;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface MotorcycleClubApi {
    Page<MotorcycleClub> findAll(Pageable pageable) ;
}
