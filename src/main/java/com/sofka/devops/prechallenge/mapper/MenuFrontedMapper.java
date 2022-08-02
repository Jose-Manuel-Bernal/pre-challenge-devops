package com.sofka.devops.prechallenge.mapper;

import com.sofka.devops.prechallenge.dto.MenuFrontendDTO;
import com.sofka.devops.prechallenge.entity.MenuFrontend;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.EnableWebFlux;

@Component
@EnableWebFlux
public class MenuFrontedMapper {

    private final ModelMapper modelMapper;

    public MenuFrontedMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MenuFrontendDTO toMenuFrontendDTO(MenuFrontend menuFrontend) {
        return modelMapper.map(menuFrontend, MenuFrontendDTO.class);
    }

    public MenuFrontend toMenuFrontendEntity(MenuFrontendDTO menuFrontendDTO) {
        return modelMapper.map(menuFrontendDTO, MenuFrontend.class);
    }
}
