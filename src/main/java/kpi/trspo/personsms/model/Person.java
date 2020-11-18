package kpi.trspo.personsms.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@EnableAutoConfiguration
@Entity
@Table(name = "people")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private UUID driverId;
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column (name = "surname")
    private String surname;
    @NotNull
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @NotNull
    @Column(name = "role_id")
    private UUID role;
}
