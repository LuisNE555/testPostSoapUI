package com.example.testSoapUI.Service;

import com.example.testSoapUI.Model.Device;

public interface DeviceService{

    public Device add(Device device);

    public Device getByDI(Long deviceIdentifier);
}
