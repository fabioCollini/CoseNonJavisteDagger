package it.cosenonjaviste.dagger.v2di;

import org.junit.Test;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryListUiBeanTest {

@Test
public void testPrintRepositories() throws Exception {
    RepositoryListUiBean repositoryListUiBean = new RepositoryListUiBean(new RepositoryServiceStub());
    repositoryListUiBean.printRepositories();
}
}
