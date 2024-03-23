package com.kamatech.searchgps.service;

import com.kamatech.searchgps.model.Point;
import com.kamatech.searchgps.repository.PointRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {

  @Autowired
  private PointRepository repository;

  public Point create(Point point) {
    return this.repository.save(point);
  }

  public List<Point> getAll() {
    return this.repository.findAll();
  }
}
