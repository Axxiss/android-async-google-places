Async Google Places
===================

Android Google Places' asynchronous API wrapper. Inspired by [Sprockets][2]


Install
=======

Add the dependency to your build system or download the jar from [Sonatype][1].

    <dependency>
        <groupId>io.github.axxiss.android</groupId>
        <artifactId>async-google-places</artifactId>
        <version>0.1.0</version>
    </dependency>

Usage
=====

Set your API key
----------------

IMPORTANT! Currently Google Places API doesn't support Android Key, so you must use a browser based key.


    PlacesSettings.getInstance().setApiKey("yourApiKey");


Build the request
-----------------

Replaces the parameter with your needed values


    //Set request params
    PlaceParams params =  PlacesSearch.searchNearby(query, lat, lng, radius);
    params.setKeyword(""); //optional



Send the request
----------------


    PlacesClient.sendRequest(params, new PlacesCallback() {
        @Override
        public void onSuccess(final Response response) {
          //do something with the result
        }
        @Override
        public void onException(final Exception exception) {
          //handle the exception
        }
    });


To see a full working sample, check out sample project.

License
=======

    Copyright 2013 Alexis Mas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



[1]: https://oss.sonatype.org/index.html#nexus-search;quick~async-google-places
[2]: https://github.com/pushbit/sprockets/
