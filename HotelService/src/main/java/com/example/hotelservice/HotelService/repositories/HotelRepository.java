package com.example.hotelservice.HotelService.repositories;

import com.example.hotelservice.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
