package dev.teamkjk.reservation_system.web.dto;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class ErrorResponseDto {

  private final String message;
  private final String code;

}
