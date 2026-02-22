package com.example.RatingService.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long hotelId;
    private float hotelActualRating;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public float getHotelActualRating() {
        return hotelActualRating;
    }

    public void setHotelActualRating(float hotelActualRating) {
        this.hotelActualRating = hotelActualRating;
    }


}
