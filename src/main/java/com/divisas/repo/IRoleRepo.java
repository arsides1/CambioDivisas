package com.divisas.repo;



import com.divisas.model.Role;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface IRoleRepo extends ReactiveCrudRepository<Role, Long> {


}
