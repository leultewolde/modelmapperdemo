package com.leultewolde.demo2.config;

import com.leultewolde.demo2.dto.PublisherDto;
import com.leultewolde.demo2.model.Publisher;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        // Publisher to Publisher DTO
        mapper.addMappings(
                new PropertyMap<Publisher, PublisherDto>() {

                    @Override
                    protected void configure() {
                        map().getAddressDto()
                                .setStreet(source.getPublisherAddress().getStreet());
                        map().getAddressDto()
                                .setCity(source.getPublisherAddress().getCity());
                        map().getAddressDto()
                                .setState(source.getPublisherAddress().getState());
                    }
                }
        );
        // Publisher DTO to Publisher
        mapper.addMappings(
                new PropertyMap<PublisherDto, Publisher>() {
                    @Override
                    protected void configure() {
                        map().getPublisherAddress()
                                .setStreet(source.getAddressDto().getStreet());
                        map().getPublisherAddress()
                                .setCity(source.getAddressDto().getCity());
                        map().getPublisherAddress()
                                .setState(source.getAddressDto().getState());
                    }
                }
        );

        return mapper;
    }


}
