package com.github.youssfbr.place.domain;

import com.github.slugify.Slugify;
import com.github.youssfbr.place.api.CreatePlaceDTO;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public class PlaceService {

    private final IPlaceRepository placeRepository;
    private final Slugify slf;

    public PlaceService(IPlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slf = Slugify.builder().build();
    }

    public Mono<Place> create(CreatePlaceDTO dto) {
        final Place place = new Place(null , dto.name() , slf.slugify(dto.name()) , dto.state() , LocalDateTime.now() , null);
        return placeRepository.save(place);
    }

}
