package it.cosenonjaviste.dagger.v2di;

import com.google.gson.Gson;
import it.cosenonjaviste.dagger.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryService {

    public Repository[] retrieveRepositories() throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(download("https://api.github.com/repositories"), Repository[].class);
    }

    private String download(String url) throws IOException {
        StringBuilder response = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(getInputStream(url)))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        return response.toString();
    }

    private InputStream getInputStream(String url) throws IOException {
        URLConnection connection = new URL(url).openConnection();
        return connection.getInputStream();
    }
}
