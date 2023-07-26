package com.example.testSoapUI.Repository;

import com.example.testSoapUI.Model.Device;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long>{

}