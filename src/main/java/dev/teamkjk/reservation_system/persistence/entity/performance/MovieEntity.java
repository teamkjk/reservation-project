package dev.teamkjk.reservation_system.persistence.entity.performance;

import java.time.LocalDateTime;
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
@Table(name = "movie")
@DiscriminatorValue("movie")
public class MovieEntity extends PerformanceEntity {

  private LocalDateTime releaseAt;
}