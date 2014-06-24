package it.cosenonjaviste.dagger.v4annotations;

import it.cosenonjaviste.dagger.Repository;

import javax.inject.Inject;
import java.io.IOException;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryListUiBean {
    @Inject RepositoryService repositoryService;

    public void printRepositories() {
        try {
            Repository[] repositories = repositoryService.retrieveRepositories();
            for (Repository repository : repositories) {
                System.out.println(repository.getName() + " - " + repository.getDescription());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
