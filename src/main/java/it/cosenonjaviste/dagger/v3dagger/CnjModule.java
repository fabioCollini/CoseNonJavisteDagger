package it.cosenonjaviste.dagger.v3dagger;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by fabiocollini on 31/12/13.
 */
@Module(injects = RepositoryListUiBean.class)
public class CnjModule {
    @Singleton
    @Provides
    public RepositoryService provideRepositoryService() {
        return new RepositoryService();
    }

    @Provides
    public RepositoryListUiBean provideRepositoryListUiBean(RepositoryService repositoryService) {
        return new RepositoryListUiBean(repositoryService);
    }
}
