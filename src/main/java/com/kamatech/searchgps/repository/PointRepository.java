package com.kamatech.searchgps.repository;

import com.kamatech.searchgps.model.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Long> {

}
