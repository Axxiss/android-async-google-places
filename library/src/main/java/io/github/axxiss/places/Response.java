package io.github.axxiss.places;

import io.github.axxiss.places.model.Place;

/**
 * The response obtained from Google's servers.
 *
 * @author Axxiss
 */
public class Response {
    private static final String TAG = "Response";
    private String[] html_attributions;
    private Place[] results;
    private String status;
    private String next_page_token;

    /**
     * Returns an array of Places, with information about each. See Nearby Search Results for
     * information about these results. The Places API returns up to 20 establishment results per
     * query. Additionally, political results may be returned which serve to identify the area of
     * the request.
     *
     * @return
     */
    public Place[] getResults() {
        return results;
    }

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

    /**
     * Contains a token that can be used to return up to 20 additional results. A next_page_token
     * will not be returned if there are no additional results to display. The maximum number of
     * results that can be returned is 60. There is a short delay between when a next_page_token is
     * issued, and when it will become valid.
     *
     * @return
     */
    public String getNextPageToken() {
        return next_page_token;
    }
}
