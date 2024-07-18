/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.villasdelmar.service;

import com.villasdelmar.model.Room;
import com.villasdelmar.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author dagui
 */
@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> findAvailableRooms() {
        return roomRepository.findByAvailableTrue();
    }

    public List<Room> findRoomsByType(String type) {
        return roomRepository.findByAvailableTrueAndType(type);
    }

    public List<Room> findRoomsByPriceLessThan(double price) {
        return roomRepository.findByAvailableTrueAndPriceLessThan(price);
    }

    public List<Room> findRoomsByFeatures(String features) {
        return roomRepository.findByAvailableTrueAndFeaturesContaining(features);
    }
}
