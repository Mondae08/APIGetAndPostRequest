package com.selenium.test.api;

import org.testng.annotations.Test;
import java.io.IOException;


public class ApiRequest extends APIGetAndPost {

    public ApiRequest() throws IOException {}

    @Test
    public void APIGetAndPostRequest() throws IOException {
        FirstEndPointGetRequest();
        SecondEndPointGetRequest();
        POSTRequest();
    }
}
