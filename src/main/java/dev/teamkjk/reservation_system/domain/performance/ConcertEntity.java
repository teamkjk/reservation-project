package dev.teamkjk.reservation_system.domain.performance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@Entity
@DiscriminatorValue("concert")
public class ConcertEntity extends PerformanceEntity {

  private String location;
}