package com.example.demo.resource;


import com.example.demo.model.Blacklist;
import com.example.demo.repository.BlacklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/blacklist")
public class BlacklistResource {

    @Autowired
    BlacklistRepository blackRepository;

    @GetMapping(value = "/all")
    public List<Blacklist> getAll() { return blackRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Blacklist> persist(@RequestBody final Blacklist devices) {
        blackRepository.save(devices);
        return blackRepository.findAll();
    }

}