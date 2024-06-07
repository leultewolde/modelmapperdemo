package com.leultewolde.demo2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "publishers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisherId;
    @NotBlank(message = "not blank - empty - null")
    @Column(unique = true)
    private String publisherName;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private Address publisherAddress;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}
