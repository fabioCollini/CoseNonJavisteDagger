package it.cosenonjaviste.dagger.v4annotations;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by fabiocollini on 31/12/13.
 */
@Module(injects = RepositoryListUiBeanTest.class, overrides = true, includes = CnjModule.class)
public class TestModule {

    @Singleton
    @Provides
    public RepositoryService provideRepositoryServiceStub() {
        return new RepositoryServiceStub();
    }
}
