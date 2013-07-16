Async Google Places
===================

Android Google Places' asynchronous API wrapper. Inspired by [Sprockets][2]


Install
=====

Add the dependency to your build system or download the jar from [Sonatype][1].

    <dependency>
        <groupId>io.github.axxiss</groupId>
        <artifactId>android-async-google-places</artifactId>
        <version>0.1.0-SNAPSHOT</version>
    </dependency>


In the coming days, the first stable release will be out and synced to Maven Central, on the meantime add sonatype as a
Maven repository.



Usage
=====

1. Set your API key

IMPORTANT! Currently Google Places API doesn't support Android Key, so you must use a browser based key.

    PlacesSettings.getInstance().setApiKey("yourApiKey");

2. Make the request!

Replaces the parameter with your needed values

     Places.searchNearby(query, lat, lng, radius, new PlacesCallback() {
        @Override
        public void onSuccess(final Response response) {
            //do something with the result

        }

        @Override
        public void onException(final Exception exception) {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    });



License
=======

TBD



 [1]: https://oss.sonatype.org/index.html#nexus-search;quick~async-google-places
 [2]: https://github.com/pushbit/sprockets/