package com.wepay.model.data;

import org.json.*;

public class KYCPhoneData {

    public String countryCode;
    public String phoneNumber;

    public JSONObject toJSON() throws JSONException {
        JSONObject o = new JSONObject();
        o.put("country_code", this.countryCode);
        o.put("phone_number", this.phoneNumber);
        return o;
    }
}
