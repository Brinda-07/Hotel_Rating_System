package com.example.RatingService.Service;

import com.example.RatingService.Entity.Rating;
import com.example.RatingService.Repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServices {
    @Autowired
    RatingRepo ratingRepo;
    public Rating addRating(Rating rating) {
        return ratingRepo.save(rating);

    }

    public Rating getRatingByHotelId(Long hotelid) {
        return ratingRepo.findByHotelId(hotelid);
    }
}
