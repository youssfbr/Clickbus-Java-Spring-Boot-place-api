package com.github.youssfbr.place.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IPlaceRepository extends ReactiveCrudRepository<Place , Long> {
}
