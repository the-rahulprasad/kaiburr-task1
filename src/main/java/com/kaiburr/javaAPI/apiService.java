package com.kaiburr.javaAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class apiService {
    private final serverRepo repository;
    public String save(serverData s){
        return repository.save(s).getId();
    }
    public serverData findbyId(String id){
        return repository.findById(id)
                .orElse(null);
    }
    public List<serverData> findbyname(String name){
        return repository.findByName(name);
    }
    public List<serverData> findALl(){
        return repository.findAll();
    }
    public void delete(String id){
        repository.deleteById(id);
    }
}
