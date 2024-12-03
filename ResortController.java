package com.tka.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tka.entity.Customers;
import com.tka.service.ResortServiceInterface;

@RestController
@RequestMapping("/api/resort")
public class ResortController {

    @Autowired
    private ResortServiceInterface resortService;

    // Get all bookings
    @GetMapping("/bookings")
    public List<Customers> getAllBookings() {
        return resortService.getAllBookingsAPI();
    }

    // Get one booking by ID
    @GetMapping("/booking/{id}")
    public Customers getOneBooking(@PathVariable int id) {
        return resortService.getOneBookingAPI(id);
    }

    // Add one booking
    @PostMapping("/booking")
    public Customers addBooking(@RequestBody Customers customer) {
        return resortService.addOneBookingAPI(customer);
    }

    // Delete one booking by ID
    @DeleteMapping("/booking/{id}")
    public void deleteBooking(@PathVariable int id) {
        resortService.deleteOneBookingAPI(id);
    }

    // Update a booking
    @PutMapping("/booking")
    public Customers updateBooking(@RequestBody Customers customer) {
        return resortService.updateOneBookingAPI(customer);
    }
}
