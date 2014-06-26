package it.cosenonjaviste.dagger.v5downloader;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by fabiocollini on 31/12/13.
 */
@Singleton
public class HttpDownloader {

    @Inject
    public HttpDownloader() {
    }

    public String download(String url) throws IOException {
        StringBuilder response = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(getInputStream(url)))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        return response.toString();
    }

    protected InputStream getInputStream(String url) throws IOException {
        URLConnection connection = new URL(url).openConnection();
        return connection.getInputStream();
    }
}
