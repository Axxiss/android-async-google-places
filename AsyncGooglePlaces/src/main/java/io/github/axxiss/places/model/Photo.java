package io.github.axxiss.places.model;

/**
 * The Photo service gives you access to the millions of photos stored in the Places and Google+
 * Local database. When you search for Places using either a Place Search or Place Details request,
 * photo references will be returned for relevant photographic content. The Photo service lets you
 * access the referenced photos, and resize the image to the optimal size for your application.
 *
 * @author Axxiss
 */
public class Photo {

    private String photo_reference;

    private int width;

    private int height;

    private String[] html_attributions;

    /**
     * A string used to identify the photo when you perform a Photo request.
     *
     * @return
     */
    public String getPhoto_reference() {
        return photo_reference;
    }

    /**
     * The maximum width of the image.
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * The maximum height of the image.
     *
     * @return the height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Contains any required attributions. This field will always be present, but may be empty.
     *
     * @return
     */
    public String[] getHtml_attributions() {
        return html_attributions;
    }
}
