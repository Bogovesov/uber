package com.uber.main.service.passenger.rating;

public class RatingImpl implements Rating {
    private Integer rating;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public int calc() {
        return 0;
    }
}
