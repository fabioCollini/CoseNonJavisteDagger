package it.cosenonjaviste.dagger.v6mock;

/**
 * Created by fabiocollini on 31/12/13.
 */
public class SystemOutStringWriter implements StringWriter {
    @Override
    public void println(String s) {
        System.out.println(s);
    }
}
