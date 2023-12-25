package org.example;

import org.example.requests.RequestNASA;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String ApiKey = "8DmoLzjbF2RdLSENESi5Xv2shOHGtjYdJigrKwDh";
        String ApiUrl = "https://api.nasa.gov/planetary/apod";

        String url = ApiUrl + "?api_key=" + ApiKey;

        RequestNASA.Test(url);

    }

}