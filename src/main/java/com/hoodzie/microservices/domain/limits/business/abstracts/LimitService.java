package com.hoodzie.microservices.domain.limits.business.abstracts;

import com.hoodzie.microservices.domain.limits.entities.dtos.LimitDto;

public interface LimitService {

  LimitDto retrieveLimits();
}