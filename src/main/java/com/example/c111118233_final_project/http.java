package com.example.c111118233_final_project;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class http {
    private final static String api_url= "https://open.er-api.com/v6/latest/";
    public static Double get_exchange_rate(String x, String y)throws IOException, InterruptedException{
        if(x.equals(y))
            return 1.0;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(api_url + x))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String[] arr = response.body().split(",");
        for(String s: arr){
            String[] temp = s.split(":");
            if(temp[0].equals("\"" + y +  "\"")){
                return Double.parseDouble(temp[1]);
            }

        }
//        System.out.println(response.body());
        // return response.body();
        return -1.0;
    }
}
