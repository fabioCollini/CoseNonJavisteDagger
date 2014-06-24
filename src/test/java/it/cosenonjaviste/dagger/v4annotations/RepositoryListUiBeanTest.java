package it.cosenonjaviste.dagger.v4annotations;

import dagger.ObjectGraph;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryListUiBeanTest {

    @Inject RepositoryListUiBean repositoryListUiBean;

    @Before public void setUp() {
        ObjectGraph.create(new TestModule()).inject(this);
    }

    @Test public void testPrintRepositories() throws Exception {
        repositoryListUiBean.printRepositories();
    }
}
