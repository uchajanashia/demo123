package com.example.demo.entities;

import com.example.demo.dtos.UniversityDto;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Table(name = "University")
@Entity
public class University extends AppEntity<Long> {

    @Id
    @SequenceGenerator(name = "universityIdSec", sequenceName = "UNIVERSITY_ID_SEC",allocationSize = 1)
    @GeneratedValue(generator = "universityIdSec",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false,name = "name")
    private String name;

    @Column(nullable = true,name = "address")
    private String address;

    public University(UniversityDto dto) {
        this.name = dto.getName();
        this.address = dto.getAddress();
    }

}