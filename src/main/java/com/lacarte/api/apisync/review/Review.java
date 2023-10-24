package com.lacarte.api.apisync.review;

import com.lacarte.api.apisync.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review extends BaseEntity {

    private int rating;
    private String description;

    protected Review() {
        super();
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
