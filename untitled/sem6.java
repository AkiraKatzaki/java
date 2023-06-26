public class Notebook {
    int id;
    int ram;
    int processor;
    int hdd;
    String os;
    String color;

    public Notebook(int id, int ram, int processor, int ssd, String os, String color){
        this.id = id;
        this.ram = ram;
        this.processor = processor;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d GB, processor: %d GHz, ssd: %d GB, OS: %s, color: %s", id, ram, processor, ssd, os, color);
    }

    public boolean equals(Object o) {
        Notebook t = (Notebook) o;
        return id == t.id;
    }
}