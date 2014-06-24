package it.cosenonjaviste.dagger.v5downloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class HttpDownloaderStub extends HttpDownloader {

    @Override
    protected InputStream getInputStream(String url) throws IOException {
        return getClass().getResourceAsStream("/github.json");
    }
}
