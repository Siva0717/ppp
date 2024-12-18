package com.example.carbooking.repository;

import com.example.carbooking.entities.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity,Long> {

    List<BookingEntity> findByCarid(int carid);
}
