package com.wepay.model.data;

import org.json.*;

public class KYCAddressData {

    public String address1;
    public String address2;
    public String city;
    public String region;
    public String postal_code;
    public String country;

    public JSONObject toJSON() throws JSONException {
        JSONObject o = new JSONObject();
        o.put("address1", this.address1);
        o.put("address2", this.address2);
        o.put("city", this.city);
        o.put("region", this.region);
        o.put("postal_code", this.postal_code);
        o.put("country", this.country);
        return o;
    }
}
