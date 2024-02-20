package com.example.hotelservice.service;

import com.example.hotelservice.entities.Hotel;
import java.util.List;
import java.util.Optional;

public interface HotelService {

    public Hotel create(Hotel hotel);

    public List<Hotel> getAll();

    Optional<Hotel> getLong(int id);
}
