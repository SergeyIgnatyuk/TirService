package TirService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service")
    private String service;

    private Date startTime;

    private Date endTime;

    @Column(name = "vehicle_id")
    @JsonIgnore
    private Long vehicleId;

    @Column(name = "employee_id")
    @JsonIgnore
    private Long employeeId;

}
