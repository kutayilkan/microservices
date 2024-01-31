package com.hoodzie.microservices.domain.limits.dataAccess.abstracts;


import com.hoodzie.microservices.domain.limits.entities.concretes.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LimitRepository extends JpaRepository<Limit, Long> {

}
