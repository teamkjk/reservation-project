package dev.teamkjk.reservation_system.domain.user;

import dev.teamkjk.reservation_system.domain.BaseTimeEntity;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private boolean emailVerified;

  private String password;

  @Column(nullable = false, length = 13)
  private String phoneNumber;

  @Column(nullable = false, length = 30)
  private String nickname;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Role role;

  private LocalDate birthday;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Gender gender;

  @Column(nullable = false)
  private boolean isExpire;

  @Builder
  public UserEntity(String email,
      String password,
      String phoneNumber,
      String nickname,
      LocalDate birthday,
      Gender gender) {
    this.email = email;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.nickname = nickname;
    this.birthday = birthday;
    this.gender = gender;
  }

  @PrePersist
  private void setDefaultValue() {
    this.role = Role.ROLE_USER;
    if (this.gender == null) {
      this.gender = Gender.NOT_PROVIDE;
    }
  }
}
