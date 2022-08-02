package com.sofka.devops.prechallenge.repository;

import com.sofka.devops.prechallenge.entity.MenuFrontend;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuFrontedRepository extends ReactiveMongoRepository<MenuFrontend, String> {
}
