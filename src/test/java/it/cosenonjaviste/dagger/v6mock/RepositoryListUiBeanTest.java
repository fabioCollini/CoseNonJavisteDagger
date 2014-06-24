package it.cosenonjaviste.dagger.v6mock;

import dagger.ObjectGraph;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.*;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class RepositoryListUiBeanTest {

    @Inject
    RepositoryListUiBean repositoryListUiBean;

    @Inject
    StringWriter stringWriterMock;

    @Before
    public void setUp() {
        ObjectGraph.create(new TestModule()).inject(this);
    }

    @Test
    public void testPrintRepositories() throws Exception {
        repositoryListUiBean.printRepositories();
        verify(stringWriterMock, times(3)).println(anyString());
    }
}
