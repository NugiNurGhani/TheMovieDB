package com.example.nuginurghani.themoviedb;

public class Exampleitem {

    private String mImageUrl;
    private String mTitle;
    private String mSynopsis;
    private String mRating;

    public Exampleitem(String imageUrl, String title, String synopsis, String rating) {
        mImageUrl = imageUrl;
        mTitle = title;
        mSynopsis = synopsis;
        mRating = rating;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSynopsis() {
        return mSynopsis;
    }

    public String getRating() {
        return mRating;
    }
}
