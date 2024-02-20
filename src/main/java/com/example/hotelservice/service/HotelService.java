package com.example.hotelservice.service;

import com.example.hotelservice.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;

@FeignClient(name="HOTEL-SERVICE")
public interface HotelService {

    @GetMapping("/hotels/{hotelId}")
    Hotel getHotel(@PathVariable String hotelId);

    public Hotel create(Hotel hotel);

    public List<Hotel> getAll();

    Optional<Hotel> getLong(int id);
}
