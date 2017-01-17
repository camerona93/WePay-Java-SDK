package com.wepay.model.data;

import org.json.*;

public class KYCDateData {

    public int year;
    public int month;
    public int day;

    public JSONObject toJSON() throws JSONException {
        JSONObject o = new JSONObject();
        o.put("year", this.year);
        o.put("month", this.month);
        o.put("day", this.day);
        return o;
    }
}
