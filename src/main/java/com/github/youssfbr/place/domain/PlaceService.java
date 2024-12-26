package com.github.youssfbr.place.domain;

import reactor.core.publisher.Mono;

public class PlaceService {

    private final IPlaceRepository placeRepository;

    public PlaceService(IPlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(Place place) {
        return placeRepository.save(place);
    }


}
