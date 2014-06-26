package it.cosenonjaviste.dagger.v6mock;

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
    public StringWriter provideStringWriter() {
        return new SystemOutStringWriter();
    }

}
