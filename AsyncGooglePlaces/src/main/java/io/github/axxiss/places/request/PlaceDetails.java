package io.github.axxiss.places.request;

import io.github.axxiss.places.enums.Params;

/**
 * Once you have a reference from a Place Search, you can request more details about a particular
 * establishment or point of interest by initiating a Place Details request. A Place Details request
 * returns more comprehensive information about the indicated place such as its complete address,
 * phone number, user rating and reviews.
 *
 * @author Axxiss
 */
public class PlaceDetails {

    private static final String DETAILS = "details";

    PlaceParams params = new PlaceParams();

    /**
     * Build a Places detail request.
     *
     * @param reference place's reference
     * @return
     */
    public PlaceDetails(final String reference) {
        params.put(Params.Reference, reference);
    }

    public PlaceDetails setExtensions(String extensions) {
        params.put(Params.Extensions, extensions);
        return this;
    }

    public PlaceDetails setLanguage(String language) {
        params.put(Params.Language, language);
        return this;
    }

}
