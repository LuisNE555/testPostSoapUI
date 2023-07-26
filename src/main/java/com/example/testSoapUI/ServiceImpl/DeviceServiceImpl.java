package com.example.testSoapUI.ServiceImpl;

import com.example.testSoapUI.Model.Device;
import com.example.testSoapUI.Repository.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl{

    DeviceRepository repository;

    public DeviceServiceImpl(DeviceRepository repository){this.repository=repository;}

    public Device add(Device device){
        return this.repository.save(device);
    }

    public Device getByDI(Long deviceIdentifier){
        return this.repository.findById(deviceIdentifier).get();
    }

}

