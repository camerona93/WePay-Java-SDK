package com.wepay.model.data;

import org.json.*;

public class KYCNameData {

    public String first;
    public String middle;
    public String last;

    public JSONObject toJSON() throws JSONException {
        JSONObject o = new JSONObject();
        o.put("first", this.first);
        o.put("middle", this.middle);
        o.put("last", this.last);
        return o;
    }
}
