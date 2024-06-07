package com.leultewolde.demo2.repository;

import com.leultewolde.demo2.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    Optional<Address> findAddressByPublisher_PublisherId(Integer publisherId);
}
