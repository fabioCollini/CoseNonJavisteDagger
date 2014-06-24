package it.cosenonjaviste.dagger.v2di;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class Main2 {

public static void main(String[] args) {
    RepositoryListUiBean repositoryListUiBean = new RepositoryListUiBean(new RepositoryService());
    repositoryListUiBean.printRepositories();
}
}
