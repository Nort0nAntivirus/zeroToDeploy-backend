package com.live.zero.to.deploy.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public record IdDto(UUID id) {

    public static List<IdDto> getIdDtoList(final List<UUID> idList) {
        final List<IdDto> idDtos = new ArrayList<>();
        idList.forEach(id -> idDtos.add(new IdDto(id)));
        return idDtos;
    }
}
