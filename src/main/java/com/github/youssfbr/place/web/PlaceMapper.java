package com.github.youssfbr.place.web;

import com.github.youssfbr.place.api.PlaceDTO;
import com.github.youssfbr.place.domain.Place;

class PlaceMapper {

    public static PlaceDTO fromPlaceToPlaceDTO(Place place) {
        return new PlaceDTO(place.name() , place.slug() , place.state() , place.createdAt() , place.updatedAt());
    }
}
