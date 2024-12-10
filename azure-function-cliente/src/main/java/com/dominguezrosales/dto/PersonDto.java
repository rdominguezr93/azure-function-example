package com.dominguezrosales.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDto {

    private Long idPerson;
    private String name;
    private String firstLastName;
    private String secondLastName;
    private String gender;
    private String address;
    private String telephone;
    private String email;
    private String status;
}
