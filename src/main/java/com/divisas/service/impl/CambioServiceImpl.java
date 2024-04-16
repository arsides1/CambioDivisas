package com.divisas.service.impl;

import com.divisas.model.Cambio;
import com.divisas.repo.ICambioRepo;
import com.divisas.service.ICambioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CambioServiceImpl implements ICambioService {
    private final ICambioRepo repo;
    @Override
    public Mono<Cambio> calcularCambioMoneda(Cambio cambio) {
        // Realizar el cálculo del monto convertido usando la tasa de cambio
        // Se puede usar una API externa o una base de datos local
        cambio.setMontoConvertido(cambio.getMonto().multiply(cambio.getTasaCambio()));

        // Guardar el cambio de moneda en la base de datos
        return repo.save(cambio);
    }

    @Override
    public Flux<Cambio> findAll() {
        return repo.findAll();
    }
}
