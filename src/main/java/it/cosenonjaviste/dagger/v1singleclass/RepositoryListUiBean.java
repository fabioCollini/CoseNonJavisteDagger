package it.cosenonjaviste.dagger.v1singleclass;

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
public class RepositoryListUiBean {

    public void printRepositories() {
        try {
            Gson gson = new Gson();
            Repository[] repositories = gson.fromJson(download("https://api.github.com/repositories"), Repository[].class);
            for (Repository repository : repositories) {
                System.out.println(repository.getName() + " - " + repository.getDescription());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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

    protected InputStream getInputStream(String url) throws IOException {
        URLConnection connection = new URL(url).openConnection();
        return connection.getInputStream();
    }
}
