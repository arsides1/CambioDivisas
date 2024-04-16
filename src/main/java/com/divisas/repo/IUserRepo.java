package com.divisas.repo;



import com.divisas.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface IUserRepo extends ReactiveCrudRepository<User,Long> {
    Mono<User> findByUsername(String username);
}
