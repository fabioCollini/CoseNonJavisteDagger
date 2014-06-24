package it.cosenonjaviste.dagger.v6mock;

import dagger.ObjectGraph;
import it.cosenonjaviste.dagger.Repository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryServiceTest {
    @Inject
    RepositoryService repositoryService;

    @Before
    public void setUp() {
        ObjectGraph.create(new TestModule()).inject(this);
    }

    @Test
    public void testRetrieveRepositories() throws Exception {
        Repository[] repositories = repositoryService.retrieveRepositories();
        Assert.assertNotNull(repositories);
    }
}
