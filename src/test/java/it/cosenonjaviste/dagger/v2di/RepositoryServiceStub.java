package it.cosenonjaviste.dagger.v2di;

import it.cosenonjaviste.dagger.Repository;

import java.io.IOException;

/**
 * Created by fabiocollini on 09/04/14.
 */
public class RepositoryServiceStub extends RepositoryService {
    @Override
    public Repository[] retrieveRepositories() throws IOException {
        return new Repository[] {
                new Repository(1, "repo1", "repo1"),
                new Repository(2, "repo2", "repo2"),
                new Repository(3, "repo3", "repo3")
        };
    }
}
