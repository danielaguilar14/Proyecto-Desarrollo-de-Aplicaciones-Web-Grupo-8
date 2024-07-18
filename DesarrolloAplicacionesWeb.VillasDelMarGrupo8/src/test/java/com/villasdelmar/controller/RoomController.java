/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.villasdelmar.controller;

import com.villasdelmar.model.Room;
import com.villasdelmar.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author dagui
 */
@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/available")
    public List<Room> getAvailableRooms() {
        return roomService.findAvailableRooms();
    }

    @GetMapping("/type/{type}")
    public List<Room> getRoomsByType(@PathVariable String type) {
        return roomService.findRoomsByType(type);
    }

    @GetMapping("/priceLessThan/{price}")
    public List<Room> getRoomsByPriceLessThan(@PathVariable double price) {
        return roomService.findRoomsByPriceLessThan(price);
    }

    @GetMapping("/features/{features}")
    public List<Room> getRoomsByFeatures(@PathVariable String features) {
        return roomService.findRoomsByFeatures(features);
    }
}
