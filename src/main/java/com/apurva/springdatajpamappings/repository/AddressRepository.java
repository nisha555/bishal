package com.apurva.springdatajpamappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apurva.springdatajpamappings.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
