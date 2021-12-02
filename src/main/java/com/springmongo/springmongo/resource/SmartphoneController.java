package com.springmongo.springmongo.resource;

import com.springmongo.springmongo.model.Smartphone;
import com.springmongo.springmongo.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SmartphoneController {

    @Autowired
    private SmartphoneRepository repository;

    @PostMapping("/addSmartphone")
    public String saveSmartphone(@RequestBody Smartphone smartphone) {
        repository.save(smartphone);
        return "Added Smartphone with id: " + smartphone.getId();
    }

    @GetMapping("/findAllSmartphones")
    public List<Smartphone> getSmartphones(){
        return repository.findAll();
    }

@GetMapping("/findAllSmartphones/{id}")
    public Optional<Smartphone> getSmartphone(@PathVariable int id) {
        return repository.findById(id);
    }

@DeleteMapping("/delete/{id}")
    public String deleteSmartphone(@PathVariable int id) {
        repository.deleteById(id);
        return "Smartphone deleted with id : " +id;
    }
}