package io.github.axxiss.places.request;

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

    /**
     * Build a Places detail request.
     *
     * @param reference place's reference
     * @return
     */
    public static PlaceParams detailRequest(final String reference) {
        PlaceParams params = new PlaceParams();
        params.setUrl(DETAILS);
        params.setReference(reference);
        return params;
    }

}
