package com.example.hotelservice.service.Impl;

import com.example.hotelservice.entities.Hotel;
import com.example.hotelservice.repository.HotelRepository;
import com.example.hotelservice.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements HotelService{
    private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);
    private final HotelRepository hotelRepository;

    @Override
    public Hotel getHotel(int hotelId) {
        logger.info("fetching hotel id");
        return null;
    }

    @Override
    public Hotel create(Hotel hotel){
        logger.info("fetching all hotel");
        return hotelRepository.save(hotel);
    }
    @Override
    public List<Hotel> getAll(){
        logger.info("fetching hotel list");
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> getLong(int id) {
        logger.info("fetching hotel id");
        return hotelRepository.findById(id);
    }
}
