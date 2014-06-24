package it.cosenonjaviste.dagger.v4annotations;

import dagger.ObjectGraph;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class Main4 {

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new CnjModule());
        RepositoryListUiBean repositoryListUiBean = objectGraph.get(RepositoryListUiBean.class);
        repositoryListUiBean.printRepositories();
    }
}
