package it.cosenonjaviste.dagger.v5downloader;

import com.google.gson.Gson;
import it.cosenonjaviste.dagger.Repository;

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
public class RepositoryService {

    @Inject HttpDownloader httpDownloader;

    public Repository[] retrieveRepositories() throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(httpDownloader.download("https://api.github.com/repositories"), Repository[].class);
    }
}
