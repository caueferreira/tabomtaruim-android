package br.com.tabomtaruim.communication.api;

import javax.inject.Named;

import br.com.tabomtaruim.entity.GoodBad;
import feign.Headers;
import feign.RequestLine;

public interface BaseAPI {

    @RequestLine("POST /good_bad")
    GoodBad report(final GoodBad goodBad);

    @RequestLine("GET /good_bad/{line}")
    @Headers("line: {line}")
    GoodBad checkLineStatus(@Named("line") final String line);
}