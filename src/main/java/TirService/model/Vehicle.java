package TirService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "model")
    private String model;

    @Column(name = "vin")
    private String vin;

    @Column(name = "year_of_issue")
    private String yearOfIssue;

    @Column(name = "employee_id")
    private Long employeeId;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private Set<Order> orders = new HashSet<>();
}
