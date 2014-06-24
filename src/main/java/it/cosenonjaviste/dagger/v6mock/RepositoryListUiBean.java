package it.cosenonjaviste.dagger.v6mock;

import it.cosenonjaviste.dagger.*;

import javax.inject.Inject;
import java.io.IOException;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryListUiBean {
    @Inject
    RepositoryService repositoryService;

    @Inject
    StringWriter stringWriter;

    public void printRepositories() {
        try {
            Repository[] repositories = repositoryService.retrieveRepositories();
            for (Repository repository : repositories) {
                stringWriter.println(repository.getName() + " - " + repository.getDescription());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
