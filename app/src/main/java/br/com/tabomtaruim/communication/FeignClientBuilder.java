package br.com.tabomtaruim.communication;

import android.util.Base64;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public class FeignClientBuilder {

    public static String TEST = "http://tabomtaruim.herokuapp.com";
    public String url;

    public void setUrl(final String url){
        this.url = url;
    }

    private Feign.Builder feignBuilder() {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

        return Feign.builder().encoder(new GsonEncoder(gson)).decoder(new GsonDecoder(gson));
    }

    private static final class ContentTypeJsonInterceptor implements RequestInterceptor {

        private static final String CONTENT_TYPE_HEADER = "Content-Type";
        private static final String APPLICATION_JSON = "application/json";

        @Override
        public void apply(final RequestTemplate requestTemplate) {
            requestTemplate.header(CONTENT_TYPE_HEADER, APPLICATION_JSON);
        }

    }


    private static final class TabomTaruimApiAuthenticationInterceptor implements RequestInterceptor {

        private static final String AUTHORIZATION = "Authorization";
        private final String user;
        private final String password;

        public TabomTaruimApiAuthenticationInterceptor(final String user, final String password) {
            this.user = user;
            this.password = password;
        }

        @Override
        public void apply(final RequestTemplate requestTemplate) {
            String headerValue = "Basic " + base64Encode(user + ":" + password);
            requestTemplate.header(AUTHORIZATION, headerValue);
        }

        private String base64Encode(final String toEncode) {
            return new String(Base64.encode(toEncode.getBytes(), Base64.DEFAULT));
        }

    }

    private List<RequestInterceptor> userCommonInterceptorsTabomTaruim() {
        List<RequestInterceptor> list = new ArrayList<RequestInterceptor>();
        list.add(new ContentTypeJsonInterceptor());

        return list;
    }

    public <K> K getBaseApi(final Class<K> api) {
        return feignBuilder().requestInterceptors(userCommonInterceptorsTabomTaruim()).target(api,
                url);
    }
}