package com.dominguezrosales.service.impl;

import com.dominguezrosales.dto.PersonDto;
import com.dominguezrosales.mapper.PersonMapper;
import com.dominguezrosales.repository.PersonRepository;
import com.dominguezrosales.service.PersonService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    @Override
    public List<PersonDto> getAllPersons() {
        log.info("Getting all persons - Service");
        return personMapper.toDtoList(personRepository.getAllPersons());
    }
}
