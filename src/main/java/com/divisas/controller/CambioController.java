package com.divisas.controller;

import com.divisas.model.Cambio;
import com.divisas.service.ICambioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/Cambio")
@RequiredArgsConstructor
public class CambioController {
    private final ICambioService service;

    @PostMapping
    public Mono<Cambio> save(@RequestBody Cambio cambio) {
        return service.calcularCambioMoneda(cambio);
    }

    @GetMapping
    public Flux<Cambio> findAll() {
        return  service.findAll();

    }
}
