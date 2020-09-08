package GAJI;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Member_table")
public class Member {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;

    @PostPersist
    public void onPostPersist(){
        Joined joined = new Joined();
        BeanUtils.copyProperties(this, joined);
        joined.publishAfterCommit();


    }

    @PreRemove
    public void onPreRemove(){
        Left left = new Left();
        BeanUtils.copyProperties(this, left);
        left.publishAfterCommit();
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
