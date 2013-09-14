package io.github.axxiss.places.api;

import io.github.axxiss.places.model.PlaceOverview;

/**
 * The response obtained from Google's servers.
 *
 * @author Axxiss
 */
public class Response {
    private static final String TAG = "Response";

    private String[] html_attributions;

    private PlaceOverview[] results;

    private String status;

    private String next_page_token;

    public String[] getHtmlAttributions() {
        return html_attributions;
    }

    public PlaceOverview[] getResults() {
        return results;
    }

    public String getStatus() {
        return status;
    }

    public String getNextPageToken() {
        return next_page_token;
    }
}
