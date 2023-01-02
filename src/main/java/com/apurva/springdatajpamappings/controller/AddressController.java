package com.apurva.springdatajpamappings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apurva.springdatajpamappings.entity.Address;
import com.apurva.springdatajpamappings.repository.AddressRepository;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addRepository;

    @GetMapping("/getAddress")
    public List<Address> getEmployees(){
        return addRepository.findAll();
    }
}
