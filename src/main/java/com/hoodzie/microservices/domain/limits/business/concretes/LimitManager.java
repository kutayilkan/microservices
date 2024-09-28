package com.hoodzie.microservices.domain.limits.business.concretes;

import com.hoodzie.microservices.domain.limits.business.abstracts.LimitService;
import com.hoodzie.microservices.domain.limits.entities.dtos.LimitDto;
import org.springframework.stereotype.Component;

@Component
public class LimitManager implements LimitService {

  @Override
  public LimitDto retrieveLimits() {
    return LimitDto.builder()
        .minimum(1)
        .maximum(1000)
        .build();
  }
}
