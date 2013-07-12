package io.github.axxiss.AsyncGooglePlaces.model;

import java.util.List;

/**
 * @author Axxiss
 */
public class Review {
    private String mAuthorName;

    private String mAuthorUrl;

    private long mTime;

    private List<Aspect> mAspects;

    private String mText;

    public String getAuthorName() {
        return mAuthorName;
    }

    public void setAuthorName(final String authorName) {
        mAuthorName = authorName;
    }

    public String getAuthorUrl() {
        return mAuthorUrl;
    }

    public void setAuthorUrl(final String authorUrl) {
        mAuthorUrl = authorUrl;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(final long time) {
        mTime = time;
    }

    public List<Aspect> getAspects() {
        return mAspects;
    }

    public void setAspects(final List<Aspect> aspects) {
        mAspects = aspects;
    }

    public String getText() {
        return mText;
    }

    public void setText(final String text) {
        mText = text;
    }
}
