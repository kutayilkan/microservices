package com.hoodzie.microservices.domain.limits.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Entity(name = "limits")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Limit {

  @Id
  @SequenceGenerator(
      name = "limit_sequence",
      sequenceName = "limit_sequence",
      allocationSize = 1

  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "limit_sequence"
  )
  private Long id;

  private String name;

}
