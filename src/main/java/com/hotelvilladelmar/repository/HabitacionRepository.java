/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelvilladelmar.repository;

import com.hotelvilladelmar.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dagui
 */
public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {
}
