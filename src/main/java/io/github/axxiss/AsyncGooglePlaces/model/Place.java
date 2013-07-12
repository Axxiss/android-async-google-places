package io.github.axxiss.AsyncGooglePlaces.model;

import java.util.List;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public class Place {
    private String mId;

    private String mReference;

    private String mIcon;

    private String mUrl;

    private double mLat = Double.NEGATIVE_INFINITY;

    private double mLong = Double.NEGATIVE_INFINITY;

    private String mName;

    private Address mAddress;

    private String mFmtAddress;

    private String mVicinity;

    private String mIntlPhone;

    private String mFmtPhone;

    private String mWebsite;

    private List<String> mTypes;

    private int mPrice = -1;

    private float mRating = -1.0f;

    private List<Review> mReviews;

    private Boolean mOpen;

    private List<OpeningHours> mOpenHours;

    private List<Event> mEvents;

    private int mUtcOffset = Integer.MIN_VALUE;

    private List<Photo> mPhotos;

    public String getId() {
        return mId;
    }

    public void setId(final String id) {
        mId = id;
    }

    public String getReference() {
        return mReference;
    }

    public void setReference(final String reference) {
        mReference = reference;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(final String icon) {
        mIcon = icon;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(final String url) {
        mUrl = url;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(final double lat) {
        mLat = lat;
    }

    public double getLong() {
        return mLong;
    }

    public void setLong(final double aLong) {
        mLong = aLong;
    }

    public String getName() {
        return mName;
    }

    public void setName(final String name) {
        mName = name;
    }

    public Address getAddress() {
        return mAddress;
    }

    public void setAddress(final Address address) {
        mAddress = address;
    }

    public String getFmtAddress() {
        return mFmtAddress;
    }

    public void setFmtAddress(final String fmtAddress) {
        mFmtAddress = fmtAddress;
    }

    public String getVicinity() {
        return mVicinity;
    }

    public void setVicinity(final String vicinity) {
        mVicinity = vicinity;
    }

    public String getIntlPhone() {
        return mIntlPhone;
    }

    public void setIntlPhone(final String intlPhone) {
        mIntlPhone = intlPhone;
    }

    public String getFmtPhone() {
        return mFmtPhone;
    }

    public void setFmtPhone(final String fmtPhone) {
        mFmtPhone = fmtPhone;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(final String website) {
        mWebsite = website;
    }

    public List<String> getTypes() {
        return mTypes;
    }

    public void setTypes(final List<String> types) {
        mTypes = types;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(final int price) {
        mPrice = price;
    }

    public float getRating() {
        return mRating;
    }

    public void setRating(final float rating) {
        mRating = rating;
    }

    public List<Review> getReviews() {
        return mReviews;
    }

    public void setReviews(final List<Review> reviews) {
        mReviews = reviews;
    }

    public Boolean getOpen() {
        return mOpen;
    }

    public void setOpen(final Boolean open) {
        mOpen = open;
    }

    public List<OpeningHours> getOpenHours() {
        return mOpenHours;
    }

    public void setOpenHours(final List<OpeningHours> openHours) {
        mOpenHours = openHours;
    }

    public List<Event> getEvents() {
        return mEvents;
    }

    public void setEvents(final List<Event> events) {
        mEvents = events;
    }

    public int getUtcOffset() {
        return mUtcOffset;
    }

    public void setUtcOffset(final int utcOffset) {
        mUtcOffset = utcOffset;
    }

    public List<Photo> getPhotos() {
        return mPhotos;
    }

    public void setPhotos(final List<Photo> photos) {
        mPhotos = photos;
    }
}
