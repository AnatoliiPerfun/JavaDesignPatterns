import java.util.Objects;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/27/2022 - 8:57 AM
 */

public class DataKey {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DataKey [name=" + name + ", id=" + id + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataKey dataKey)) return false;
        return id == dataKey.id && name.equals(dataKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
