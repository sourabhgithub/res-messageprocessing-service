package com.dtcc.mp.model;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Value.Immutable
@JsonDeserialize(as = ImmutableData.class)
public interface Data {

  @Value.Parameter
  String getName();

  @Value.Parameter
  String getCompany();

  @Value.Parameter
  String guid();
}
