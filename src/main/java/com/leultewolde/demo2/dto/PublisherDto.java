package com.leultewolde.demo2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PublisherDto {
    private String publisherName;
    private AddressDto addressDto;

    public PublisherDto(String publisherName) {
        this.publisherName = publisherName;
    }
}
