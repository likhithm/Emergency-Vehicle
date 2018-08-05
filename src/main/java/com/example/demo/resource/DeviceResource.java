package com.example.demo.resource;


import com.example.demo.model.Device;
import com.example.demo.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/device")
public class DeviceResource {

    @Autowired
    DeviceRepository deviceRepository;

    @GetMapping(value = "/all")
    public List<Device> getAll() { return deviceRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Device> persist(@RequestBody final Device devices) {
        deviceRepository.save(devices);
        return deviceRepository.findAll();
    }

}