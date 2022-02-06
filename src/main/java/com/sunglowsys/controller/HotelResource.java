package com.sunglowsys.controller;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelResource {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/hotel")
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel){
        Hotel result = hotelService.save(hotel);
        return ResponseEntity.ok().body(result);
    }

    @PutMapping("/hotel/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable("id") Integer id, @RequestBody Hotel hotel){
        Hotel result = hotelService.update(hotel,id);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/hotel")
    public List<Hotel> findAll(){
        List<Hotel> hotels = hotelService.findAll();
        return hotels;
    }

    @GetMapping("/hotel/{id}")
    public Hotel findById(@PathVariable("id") Integer id){
        Hotel hotel = hotelService.findById(id);
        return hotel;
    }

    @DeleteMapping("/hotel/{id}")
    public String deleteHotel(@PathVariable("id") Integer id){
        hotelService.delete(id);
        return "deleted successfully--";
    }
}
