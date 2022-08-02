package com.sofka.devops.prechallenge.repository;

import com.sofka.devops.prechallenge.entity.MenuBackend;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuBackendRepository extends ReactiveMongoRepository<MenuBackend, String> {
}
