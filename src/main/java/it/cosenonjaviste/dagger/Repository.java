package it.cosenonjaviste.dagger;

/**
 * Created by fabiocollini on 28/12/13.
 */
public class Repository {
    private long id;
    private String name;
    private String description;

    public Repository() {
    }

    public Repository(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
