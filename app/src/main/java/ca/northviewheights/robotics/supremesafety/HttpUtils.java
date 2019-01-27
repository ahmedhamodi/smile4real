package ca.northviewheights.robotics.supremesafety;

import android.widget.TextView;

import com.loopj.android.http.*;

import org.json.JSONObject;

public class HttpUtils {
    private static final String BASE_URL = "https://quotes.rest/qod";

    private static TextView tv;

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void getByUrl(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(url, params, responseHandler);
    }

    public static void postByUrl(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(url, params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL;
    }

    public static String getQuote(TextView qNumber){
        tv = qNumber;
        RequestParams rp = new RequestParams();
        rp.add("category","inspire");
        JsonHttpHandler jp = new JsonHttpHandler();
        HttpUtils.get("t", rp,jp);

//        byte[] buffer;
//        jp.getResponseString(buffer, )
        return jp.response_string.toString();
    }

    public static void callback(JSONObject obj){
        tv.setText(obj.toString());
        System.out.println("Here");
    }
}
