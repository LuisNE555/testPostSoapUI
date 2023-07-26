package com.example.testSoapUI.Controller;

import com.example.testSoapUI.Model.Device;
import com.example.testSoapUI.ServiceImpl.DeviceServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController

public class DeviceController{

    DeviceServiceImpl service;

    public DeviceController(DeviceServiceImpl service){this.service=service;}

    @GetMapping(value = "/device/{deviceIdentifier}")
    public Device getById(@PathVariable Long deviceIdentifier){
        return this.service.getByDI(deviceIdentifier);
    }
    
    @PostMapping(value = "/device", consumes = "application/json")
    public Device add(@RequestBody Device device){
        return this.service.add(device);
    }

}