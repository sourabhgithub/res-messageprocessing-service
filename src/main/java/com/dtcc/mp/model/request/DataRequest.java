package com.dtcc.mp.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Value.Immutable
@JsonDeserialize(as = ImmutableDataRequest.class)
public interface DataRequest {

  @Value.Parameter
  @Size(max = 30)
  @NotNull
  String getName();

  @Value.Parameter
  @Size(max = 30)
  @NotNull
  String getCompany();

  @Value.Parameter
  @Size(max = 100)
  @NotNull
  String guid();
}
