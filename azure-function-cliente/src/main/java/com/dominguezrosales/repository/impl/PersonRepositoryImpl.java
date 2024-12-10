package com.dominguezrosales.repository.impl;

import com.dominguezrosales.model.Person;
import com.dominguezrosales.repository.PersonRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class PersonRepositoryImpl implements PersonRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Person> getAllPersons() {
        log.info("Getting all persons - Repository");
        String query = new StringBuilder()
                .append("SELECT ")
                    .append("per_id AS idPerson, ")
                    .append("per_nombre AS name, ")
                    .append("per_apellido_paterno AS firstLastName, ")
                    .append("per_apellido_materno AS secondLastName, ")
                    .append("per_genero AS gender, ")
                    .append("per_direccion AS address, ")
                    .append("per_telefono AS telephone, ")
                    .append("per_correo AS email, ")
                    .append("per_estado AS status ")
                .append("FROM ")
                    .append("Persona ")
                .toString();
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Person.class));
    }
}
