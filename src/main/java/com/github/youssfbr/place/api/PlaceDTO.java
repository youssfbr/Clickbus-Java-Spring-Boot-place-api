package com.github.youssfbr.place.api;

import java.time.LocalDateTime;

public record PlaceDTO(

        String name ,
        String slug ,
        String state ,
        LocalDateTime createdAt ,
        LocalDateTime updatedAt
) {
}
