package com.webApp.myapp.repository;
import com.webApp.myapp.entity.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long>{

}
