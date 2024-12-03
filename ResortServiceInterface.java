package com.tka.service;

import java.util.List;
import com.tka.entity.Customers;

public interface ResortServiceInterface {

    List<Customers> getAllBookingsAPI();
    Customers getOneBookingAPI(int id);
    Customers addOneBookingAPI(Customers customer);
    void deleteOneBookingAPI(int id);
    Customers updateOneBookingAPI(Customers customer);
}
