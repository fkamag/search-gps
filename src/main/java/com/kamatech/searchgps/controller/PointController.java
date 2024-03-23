package com.kamatech.searchgps.controller;

import com.kamatech.searchgps.model.Point;
import com.kamatech.searchgps.service.PointService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/point")
public class PointController {

  @Autowired
  private PointService service;

  @PostMapping
  public Point create(@RequestBody Point point) {
    return this.service.create(point);
  }

  @GetMapping
  public List<Point> getAll() {
    return this.service.getAll();
  }



}
