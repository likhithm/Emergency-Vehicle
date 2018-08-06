package com.example.demo.resource;


import com.example.demo.model.Whitelist;
import com.example.demo.repository.WhitelistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/whitelist")
public class WhitelistResource {

    @Autowired
    WhitelistRepository whitelistRepository;

    @GetMapping(value = "/all")
    public List<Whitelist> getAll() { return whitelistRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Whitelist> persist(@RequestBody final Whitelist devices) {
        whitelistRepository.save(devices);
        return whitelistRepository.findAll();
    }

}