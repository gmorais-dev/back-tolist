package ToDoList.ListaDeTarefas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "Tasks")
@Setter
@Getter
@ToString

    public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(nullable = false)
     private String title;

     @Column(nullable = false)
     private String description;

     @Column(nullable = false)
     private Date deadLine;

     @CreationTimestamp
     @Column(name = "created_at", nullable = false, updatable = false)
     private Date createdAt;

     @UpdateTimestamp
     @Column(name = "updated_at")
    private Date updatedAt;

}
