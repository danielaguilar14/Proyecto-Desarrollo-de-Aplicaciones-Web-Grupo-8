/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.villasdelmar.repository;

import com.villasdelmar.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 *
 * @author dagui
 */
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByAvailableTrue();

    List<Room> findByAvailableTrueAndType(String type);

    List<Room> findByAvailableTrueAndPriceLessThan(double price);

    List<Room> findByAvailableTrueAndFeaturesContaining(String features);
}
