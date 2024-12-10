package com.dominguezrosales.mapper;

import com.dominguezrosales.dto.PersonDto;
import com.dominguezrosales.model.Person;

import java.util.List;

public interface PersonMapper {
    PersonDto toDto(Person model);
    List<PersonDto> toDtoList(List<Person> modelList);
    Person toModel(PersonDto dto);
}
