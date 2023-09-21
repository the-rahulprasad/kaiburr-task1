package com.kaiburr.javaAPI;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/server")
@RequiredArgsConstructor
public class apiController {
    private final apiService service;

    @PutMapping
    public ResponseEntity<String> save(@RequestBody serverData data){
        return ResponseEntity.ok(service.save(data));
    }

    @GetMapping
    public ResponseEntity<List<serverData>> findAll(){
        return ResponseEntity.ok(service.findALl());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") String id){
        serverData s = service.findbyId(id);
        if(s == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(HttpStatus.NOT_FOUND.value());
        }
        return ResponseEntity.ok(service.findbyId(id));

    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> findbyName(
            @PathVariable("name") String name
    ){
        List<serverData> names = service.findbyname(name);
        if(names.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(HttpStatus.NOT_FOUND.value());
        }
        return ResponseEntity.ok(service.findbyname(name));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        service.delete(id);
        return ResponseEntity.accepted().build();
    }

}
