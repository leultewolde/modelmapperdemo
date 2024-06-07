package com.leultewolde.demo2.service;


import com.leultewolde.demo2.dto.AddressDto;

import java.util.Optional;

public interface AddressService {
    AddressDto updateAddress(AddressDto addressDto);
    Optional<AddressDto> findAddressById(Integer id);
}
