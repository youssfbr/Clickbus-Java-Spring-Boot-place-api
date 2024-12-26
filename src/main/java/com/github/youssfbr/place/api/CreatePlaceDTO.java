package com.github.youssfbr.place.api;

import jakarta.validation.constraints.NotBlank;

public record CreatePlaceDTO(

        @NotBlank String name ,
        @NotBlank String state
) {
}
