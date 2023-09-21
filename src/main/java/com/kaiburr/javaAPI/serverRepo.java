package com.kaiburr.javaAPI;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface serverRepo extends MongoRepository<serverData, String> {
    List<serverData> findByName(String name);
}
