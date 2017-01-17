package com.wepay.model.data;

import org.json.*;

public class KYCPrefillInfoData {

    public KYCNameData name;
    public String email;
    public KYCPhoneData phone;
    public KYCAddressData address;
    public KYCDateData dob;
    public String entityName;
    public String url;
    public String description;

    public JSONObject toJSON() throws JSONException {
        JSONObject o = new JSONObject();
        if (this.name != null) {
            o.put("name", this.name.toJSON());
        }
        if (this.phone != null) {
            o.put("phone", this.phone.toJSON());
        }
        if (this.address != null) {
            o.put("address", this.address.toJSON());
        }
        if (this.dob != null) {
            o.put("dob", this.dob.toJSON());
        }

        o.put("email", this.email);
        o.put("entity_name", this.entityName);
        o.put("url", this.url);
        o.put("description", this.description);
        return o;
    }
    
}
