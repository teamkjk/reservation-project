package dev.teamkjk.reservation_system.web.dto;

import java.util.List;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class ResponseDto<T> {

  private final int statusCode;
  private final boolean success;
  private final List<T> payload;
  private final ErrorResponseDto error;

}
