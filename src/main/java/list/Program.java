package list;

import java.util.List;

public class Program {
    private String name;
    private int id;
    private List<String> classes;

    public Program(String name, int id, List<String> classes) {
        this.name = name;
        this.id = id;
        this.classes = classes;
    }

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

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", classes=" + classes +
                '}';
    }
}
