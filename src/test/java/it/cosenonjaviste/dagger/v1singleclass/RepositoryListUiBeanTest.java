package it.cosenonjaviste.dagger.v1singleclass;

import org.junit.Test;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryListUiBeanTest {

    @Test
    public void testPrintRepositories() throws Exception {
        RepositoryListUiBean repositoryListUiBean = new RepositoryListUiBean();
        repositoryListUiBean.printRepositories();
    }
}
