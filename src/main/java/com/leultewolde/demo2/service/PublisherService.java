package com.leultewolde.demo2.service;

import com.leultewolde.demo2.dto.PublisherDto;

import java.util.Optional;

public interface PublisherService {
    Optional<PublisherDto> addPublisher(PublisherDto publisherDto);

    Optional<PublisherDto> updatePublisher(String publisherName, PublisherDto publisherDto);

    Optional<PublisherDto> findPublisherByName(String publisherName);

    Response deletePublisher(String publisherName);
}
