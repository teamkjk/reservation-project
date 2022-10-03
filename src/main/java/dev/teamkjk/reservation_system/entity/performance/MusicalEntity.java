package dev.teamkjk.reservation_system.entity.performance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "musical")
@DiscriminatorValue("musical")
public class MusicalEntity extends PerformanceEntity {

  private String location;
}