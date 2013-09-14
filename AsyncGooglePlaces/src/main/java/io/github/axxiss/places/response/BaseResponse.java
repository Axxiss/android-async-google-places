package io.github.axxiss.places.response;

/**
 * Created by alexis on 9/14/13.
 */
public class BaseResponse {


    private String status;

    private String[] html_attributions;


    /**
     * Returns metadata on the request.
     *
     * @return the status code
     */
    public String getStatus() {
        return status;
    }

    /**
     * Returns a set of attributions about this listing which must be displayed to the user.
     *
     * @return the html attributes.
     */
    public String[] getHtmlAttributions() {
        return html_attributions;
    }
}
