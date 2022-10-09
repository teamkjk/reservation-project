package dev.teamkjk.reservation_system.domain.performance;

import dev.teamkjk.reservation_system.domain.BaseTimeEntity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "performance")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
public abstract class PerformanceEntity extends BaseTimeEntity {

  @Id
  private String id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String postUrl;

  @Column(nullable = false)
  private String storyline;

  @Column(nullable = false)
  private int runningTime;

  @Column(nullable = false)
  private int certification;

  @Column(nullable = false)
  private boolean isClosed;

  @Column(nullable = false)
  private double rate;

  @Column(nullable = false)
  private String genre;

  @Column(nullable = false)
  private String trailerUrl;
}