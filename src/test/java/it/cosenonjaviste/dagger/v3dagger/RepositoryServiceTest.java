package it.cosenonjaviste.dagger.v3dagger;

import it.cosenonjaviste.dagger.Repository;
import junit.framework.Assert;
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
