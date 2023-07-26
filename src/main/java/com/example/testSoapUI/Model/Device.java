package com.example.testSoapUI.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    @Column(name ="active")
    private String active;
    @Column(name = "entitykey")
    private Long entityKey;
    @Column(name = "deviceindentifier")
    private Long deviceIdentifier;
}