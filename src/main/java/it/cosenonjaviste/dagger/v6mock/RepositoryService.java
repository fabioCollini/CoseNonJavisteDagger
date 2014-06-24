package it.cosenonjaviste.dagger.v6mock;

import com.google.gson.Gson;
import it.cosenonjaviste.dagger.Repository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;

/**
 * Created by fabiocollini on 31/12/13.
 */
@Singleton
public class RepositoryService {

    @Inject
    HttpDownloader httpDownloader;

    public Repository[] retrieveRepositories() throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(httpDownloader.download("https://api.github.com/repositories"), Repository[].class);
    }
}
