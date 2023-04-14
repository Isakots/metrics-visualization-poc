package hu.isakots.metricspoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dummy")
public class DummyEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
