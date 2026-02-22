package com.example.RatingService.Repository;

import com.example.RatingService.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Long> {
   public Rating findByHotelId(Long hotelid);
}
