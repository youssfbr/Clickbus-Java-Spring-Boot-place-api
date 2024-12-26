package com.github.youssfbr.place.config;

import com.github.youssfbr.place.domain.IPlaceRepository;
import com.github.youssfbr.place.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {

    @Bean
    PlaceService placeService(IPlaceRepository placeRepository) {
        return new PlaceService(placeRepository);
    }
}
