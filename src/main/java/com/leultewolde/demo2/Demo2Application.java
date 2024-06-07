package com.leultewolde.demo2;

import com.leultewolde.demo2.dto.AddressDto;
import com.leultewolde.demo2.dto.PublisherDto;
import com.leultewolde.demo2.service.PublisherService;
import com.leultewolde.demo2.service.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Demo2Application implements CommandLineRunner {

    private final PublisherService publisherService;

    @Override
    public void run(String... args) throws Exception {
        PublisherDto publisherDto = new PublisherDto("Apres");
        AddressDto addressDto = new AddressDto("2000 N Court", "Fairfield", "IA");

        publisherDto.setAddressDto(addressDto);

        System.out.println(
                publisherService.addPublisher(publisherDto).get() + " is saved."
        );
        //update
        PublisherDto publisherDto2 = new PublisherDto("Apress");
        System.out.println(
                publisherService.updatePublisher("Apres", publisherDto2).get() + " Modified."
        );

        // Delete
        Response response = publisherService.deletePublisher("Apress");
        System.out.println("Apress " + response.getVal());

    }

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

}
