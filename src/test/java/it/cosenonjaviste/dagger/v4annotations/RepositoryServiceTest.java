package it.cosenonjaviste.dagger.v4annotations;

import it.cosenonjaviste.dagger.Repository;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryServiceTest {
    @Test
    public void testRetrieveRepositories() throws Exception {
        RepositoryService repositoryService = new RepositoryService();
        Repository[] repositories = repositoryService.retrieveRepositories();
        Assert.assertNotNull(repositories);
    }
}
