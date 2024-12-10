package com.dominguezrosales.mapper.impl;


import com.dominguezrosales.dto.PersonDto;
import com.dominguezrosales.mapper.PersonMapper;
import com.dominguezrosales.model.Person;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class PersonMapperImpl implements PersonMapper {

    public final ModelMapper modelMapper;

    @Override
    public PersonDto toDto(Person model) {
        return modelMapper.map(model, PersonDto.class);
    }

    @Override
    public List<PersonDto> toDtoList(List<Person> modelList) {
        return modelList.stream().map(this::toDto).toList();
    }

    @Override
    public Person toModel(PersonDto dto) {
        return modelMapper.map(dto, Person.class);
    }
}
