package com.example.RatingService.Controller;

import com.example.RatingService.Entity.Rating;
import com.example.RatingService.Service.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    RatingServices ratingServices;
    @PostMapping("/addrating")
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating)
    {
        Rating rating1 = ratingServices.addRating(rating);
        return new ResponseEntity<>(rating1, HttpStatus.CREATED);
    }

    @GetMapping("/getratingbyhotelid/{hotelid}")
    public ResponseEntity<Float> getRatingByHotelId(@PathVariable Long hotelid){
        Rating rating=ratingServices.getRatingByHotelId(hotelid);
        return new ResponseEntity<>(rating.getHotelActualRating(),HttpStatus.OK);
    }
}
