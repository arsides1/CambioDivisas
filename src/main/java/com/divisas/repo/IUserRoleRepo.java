package com.divisas.repo;



import com.divisas.model.UserRole;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface IUserRoleRepo extends ReactiveCrudRepository<UserRole, Long> {

    Flux<UserRole> findByIdUser(Long idUser);
}