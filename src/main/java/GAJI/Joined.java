package GAJI;

public class Joined extends AbstractEvent {

    private Long id;
    private String name;

    public Joined(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
