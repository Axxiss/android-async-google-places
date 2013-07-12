package io.github.axxiss.AsyncGooglePlaces.model;

/**
 * @author Axxiss
 */
public class Event {
    private String mId;

    private long mTime;

    private String mSummary;

    private String mUrl;

    public String getId() {
        return mId;
    }

    public void setId(final String id) {
        mId = id;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(final long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(final String summary) {
        mSummary = summary;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(final String url) {
        mUrl = url;
    }
}
