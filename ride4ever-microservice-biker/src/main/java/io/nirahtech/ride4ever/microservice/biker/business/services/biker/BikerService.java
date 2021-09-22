package io.nirahtech.ride4ever.microservice.biker.business.services.biker;

import io.nirahtech.ride4ever.microservice.biker.business.api.Crud;
import io.nirahtech.ride4ever.microservice.biker.domain.api.BikerApi;
import io.nirahtech.ride4ever.microservice.biker.domain.entities.Biker;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface BikerService extends Crud<Biker>, BikerApi {
    
}
