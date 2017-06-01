package in.jackz.kotlinify;

import java.io.Serializable;

/**
 * Created by jackson on 22/11/16.
 */

public class Model implements Serializable {

    String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
