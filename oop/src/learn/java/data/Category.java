package learn.java.data;

public class Category {
    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if(id != null) {
            this.id = id;
        }
        return false;
    }

    public boolean isExpensive() {
        return expensive;
    }

    public boolean setExpensive(boolean expensive) {
        if(expensive){
            this.expensive = expensive;
        }
        return false;
    }
}
