package dev.teamkjk.reservation_system.domain.performance;

import java.time.LocalDateTime;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@Entity
@DiscriminatorValue("movie")
public class MovieEntity extends PerformanceEntity {

  private LocalDateTime releaseAt;
}