package com.taxitime.driver.Retrofit;


import org.json.JSONArray;


public interface ResponseListener {
    void getJSONArrayResult(String strTag, JSONArray arrayResponse);
}
