package com.buyogo.traini8.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center name cannot be blank")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is required")
    @Pattern(regexp = "^[A-Za-z0-9]{12}$", message = "Center code must be 12 characters")
    private String centerCode;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @NotNull(message = "Address is required")
    @Valid
    private Address address;

    @Min(value = 0, message = "Student capacity cannot be negative")
    private int studentCapacity = 0; // Default value

    @ElementCollection
    private List<String> coursesOffered = new ArrayList<>();


    private Long createdOn = Instant.now().getEpochSecond(); // Auto-generated epoch time

    @Email(message = "Invalid email format")
    private String contactEmail;

    @NotBlank(message = "Contact phone is required")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String contactPhone;
}
