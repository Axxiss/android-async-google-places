package io.github.axxiss.AsyncGooglePlaces.model;

import java.util.List;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public class Photo {
    private String mReference;

    private int mWidth;

    private int mHeight;

    private List<String> mAttribs;

    public String getReference() {
        return mReference;
    }

    public void setReference(final String reference) {
        mReference = reference;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(final int width) {
        mWidth = width;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight(final int height) {
        mHeight = height;
    }

    public List<String> getAttribs() {
        return mAttribs;
    }

    public void setAttribs(final List<String> attribs) {
        mAttribs = attribs;
    }
}
