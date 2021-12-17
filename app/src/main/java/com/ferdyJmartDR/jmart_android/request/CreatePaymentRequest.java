package com.ferdyJmartDR.jmart_android.request;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mochamad Ferdy Fauzan
 * @version 17-12-2021
 */

public class CreatePaymentRequest extends StringRequest {
    private Map<String, String> params;

    public CreatePaymentRequest(String buyerId, String productId, String productCount, String shipmentAddress, String shipmentPlan,
                                Response.Listener<String> listener, Response.ErrorListener errorListener){
        super(Method.POST, "http://10.0.2.2:1741/payment/create", listener, errorListener);
        params = new HashMap<>();
        params.put("buyerId", buyerId);
        params.put("productId", productId);
        params.put("productCount", productCount);
        params.put("shipmentAddress", shipmentAddress);
        params.put("shipmentPlan", shipmentPlan);
    }

    public Map<String, String> getParams(){
        return params;
    }
}