package dasturlash.uz;

import javax.persistence.*;
import java.time.LocalDateTime;

@NamedQueries(
        {
                @NamedQuery(
                        name = "findAllStudentByName",
                        query = "from StudentEntity s where s.name = :name"
                ),
                @NamedQuery(
                        name = "findStudentById",
                        query = "from StudentEntity s where s.id = :id"
                )
        }
)
@NamedNativeQueries(
        {
                @NamedNativeQuery(
                        name = "findAllStudentByNameNativeQuery",
                        query = "select * from student s where s.name = :name",
                        resultClass = StudentEntity.class
                )
        }
)
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}






