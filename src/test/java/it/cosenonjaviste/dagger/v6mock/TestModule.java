package it.cosenonjaviste.dagger.v6mock;

import dagger.Module;
import dagger.Provides;
import it.cosenonjaviste.dagger.v5downloader.*;

import javax.inject.Singleton;

import static org.mockito.Mockito.mock;

/**
 * Created by fabiocollini on 31/12/13.
 */
@Module(injects = {RepositoryListUiBeanTest.class, RepositoryServiceTest.class}, overrides = true, includes = CnjModule.class)
public class TestModule {

    @Singleton
    @Provides
    public StringWriter provideStringWriter() {
        return mock(StringWriter.class);
    }

    @Singleton
    @Provides()
    public HttpDownloader provideHttpDownloader() {
        return new HttpDownloaderStub();
    }
}
