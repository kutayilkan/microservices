package com.hoodzie.microservices.domain.limits.entities.dtos;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link com.hoodzie.microservices.domain.limits.entities.concretes.Limit}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LimitDto implements Serializable {

  @Serial
  private static final long serialVersionUID = 1333768168621999332L;

  private Integer minimum;
  private Integer maximum;
  private Integer name;
}