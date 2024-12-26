package com.github.youssfbr.place.domain;

import com.github.youssfbr.place.api.CreatePlaceDTO;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public class PlaceService {

    private final IPlaceRepository placeRepository;

    public PlaceService(IPlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(CreatePlaceDTO dto) {
        final Place place = new Place(null , dto.name() , dto.slug() , dto.state() , LocalDateTime.now() , null);
        return placeRepository.save(place);
    }


}
