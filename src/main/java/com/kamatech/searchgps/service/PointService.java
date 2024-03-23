package com.kamatech.searchgps.service;

import com.kamatech.searchgps.model.Location;
import com.kamatech.searchgps.model.Point;
import com.kamatech.searchgps.repository.PointRepository;
import java.util.ArrayList;
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

  public List<Point> getNearby(Location location) {
    List<Point> allLocations = this.getAll();
    List<Point> nearbyLocations = new ArrayList<>();

    for (Point point : allLocations) {
      Integer distanceLatitude = Math.abs(point.getLatitude() - location.getLatitude());
      Integer distanceLongitude = Math.abs(point.getLongitude() - location.getLongitude());
      Integer distanceTotal = distanceLatitude + distanceLongitude;
      if (distanceTotal <= location.getDistance()) {
        nearbyLocations.add(point);
      }
    }

    return nearbyLocations;
  }
}
