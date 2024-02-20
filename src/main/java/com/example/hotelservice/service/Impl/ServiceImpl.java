package com.example.hotelservice.service.Impl;

import com.example.hotelservice.entities.Hotel;
import com.example.hotelservice.repository.HotelRepository;
import com.example.hotelservice.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements HotelService{

    private final HotelRepository hotelRepository;

    @Override
    public Hotel getHotel(String hotelId) {
        return null;
    }

    @Override
    public Hotel create(Hotel hotel){
        return hotelRepository.save(hotel);
    }
    @Override
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> getLong(int id) {
        return hotelRepository.findById(id);
    }
}
