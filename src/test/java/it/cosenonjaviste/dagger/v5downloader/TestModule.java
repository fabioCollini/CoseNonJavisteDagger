package it.cosenonjaviste.dagger.v5downloader;

import dagger.Module;
import dagger.Provides;
import it.cosenonjaviste.dagger.v4annotations.CnjModule;
import it.cosenonjaviste.dagger.v4annotations.RepositoryService;

import javax.inject.Singleton;

/**
 * Created by fabiocollini on 31/12/13.
 */
@Module(injects = {RepositoryListUiBeanTest.class, RepositoryServiceTest.class}, overrides = true, includes = CnjModule.class)
public class TestModule {

    @Singleton
    @Provides
    public HttpDownloader provideHttpDownloaderStub() {
        return new HttpDownloaderStub();
    }
}
