package com.sofka.devops.prechallenge.mapper;

import com.sofka.devops.prechallenge.dto.MenuBackendDTO;
import com.sofka.devops.prechallenge.entity.MenuBackend;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.EnableWebFlux;

@Component
@EnableWebFlux
public class MenuBackendMapper {

    private final ModelMapper modelMapper;

    public MenuBackendMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MenuBackendDTO toMenuBackDTO(MenuBackend menuBackend) {
        return modelMapper.map(menuBackend, MenuBackendDTO.class);
    }

    public MenuBackend toMenuBackEntity(MenuBackendDTO menuBackendDTO) {
        return modelMapper.map(menuBackendDTO, MenuBackend.class);
    }
}
