package com.divisas.service;

import com.divisas.model.Cambio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICambioService {

   Mono<Cambio> calcularCambioMoneda(Cambio cambio);
    Flux<Cambio> findAll();
}
