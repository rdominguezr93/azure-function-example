package com.dominguezrosales.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person  implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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
