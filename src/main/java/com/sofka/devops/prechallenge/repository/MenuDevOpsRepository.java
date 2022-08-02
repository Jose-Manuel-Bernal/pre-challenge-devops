package com.sofka.devops.prechallenge.repository;

import com.sofka.devops.prechallenge.entity.MenuDevOps;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDevOpsRepository extends ReactiveMongoRepository<MenuDevOps, String> {
}
