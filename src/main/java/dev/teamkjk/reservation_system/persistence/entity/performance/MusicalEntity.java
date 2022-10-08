package dev.teamkjk.reservation_system.persistence.entity.performance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("musical")
public class MusicalEntity extends PerformanceEntity {

  private String location;
}