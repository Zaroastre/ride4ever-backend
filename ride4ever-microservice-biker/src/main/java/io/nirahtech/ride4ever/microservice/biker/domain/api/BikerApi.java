package io.nirahtech.ride4ever.microservice.biker.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.biker.domain.entities.Biker;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface BikerApi {
    Page<Biker> findAll(Pageable pageable);
}
