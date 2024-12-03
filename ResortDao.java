package com.tka.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public class ResortDao implements ResortDaoInterface {

    @Autowired
    private JpaRepository<Customers, Integer> repository; // Fix: inject the actual repository

    @Override
    public List<Customers> getAllBookingsAPI() {
        return repository.findAll();
    }

    @Override
    public Customers getOneBookingAPI(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Customers addOneBookingAPI(Customers customer) {
        return repository.save(customer);
    }

    @Override
    public void deleteOneBookingAPI(int id) {
        repository.deleteById(id);
    }

    @Override
    public Customers updateOneBookingAPI(Customers customer) {
        return repository.save(customer);
    }
}
