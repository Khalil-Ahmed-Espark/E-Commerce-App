package com.khalil.ecommerce.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="Name", nullable = false, unique = true)
    private String name;

    @Column(name="Email", nullable = false, unique = true)
    private String email;

    @Column(name="Password", nullable = false)
    private String password;

    @Column(name="Profile Image")
    private String profileImage;

    @Column(name = "Created At", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "Updated At", insertable = false)
    public LocalDateTime updatedAt;

}
