package com.divisas.repo;

import com.divisas.model.Cambio;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICambioRepo extends R2dbcRepository<Cambio, Long> {

}
