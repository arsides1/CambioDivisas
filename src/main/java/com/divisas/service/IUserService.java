package com.divisas.service;


import com.divisas.model.User;
import reactor.core.publisher.Mono;

public interface IUserService {
    Mono<User> save(User user);

    Mono<User> saveHash(User user); // Método específico para guardar un hash, por ejemplo

    Mono<com.divisas.security.User> searchByUser(String username);
}
