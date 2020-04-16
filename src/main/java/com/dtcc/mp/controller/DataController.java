package com.dtcc.mp.controller;

import com.dtcc.mp.model.Data;
import com.dtcc.mp.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.function.Supplier;

@RestController
@RequestMapping(value = "/data")
public class DataController {

  static final Logger LOGGER = LoggerFactory.getLogger(DataController.class);

  private static final Supplier<ResourceNotFoundException> notFoundException =
      () -> new ResourceNotFoundException("Resource not found");

  @Autowired DataService dataService;

  @GetMapping("/{id}")
  public ResponseEntity<Page<Data>> getData(
      @RequestParam(value = "name", required = false) final Optional<String> name,
      @RequestParam(value = "company", required = false) final Optional<String> company,
      @RequestParam(value = "guid", required = false) final Optional<String> guid,
      final Pageable pageable) {

    return new ResponseEntity<>(HttpStatus.OK);
  }
}
