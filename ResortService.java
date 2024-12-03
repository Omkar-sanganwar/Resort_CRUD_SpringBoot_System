package com.tka.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.ResortDaoInterface;
import com.tka.entity.Customers;

@Service
public class ResortService implements ResortServiceInterface {

    @Autowired
    private ResortDaoInterface resortDao;

    @Override
    public List<Customers> getAllBookingsAPI() {
        return resortDao.getAllBookingsAPI();
    }

    @Override
    public Customers getOneBookingAPI(int id) {
        return resortDao.getOneBookingAPI(id);
    }

    @Override
    public Customers addOneBookingAPI(Customers customer) {
        return resortDao.addOneBookingAPI(customer);
    }

    @Override
    public void deleteOneBookingAPI(int id) {
        resortDao.deleteOneBookingAPI(id);
    }

    @Override
    public Customers updateOneBookingAPI(Customers customer) {
        return resortDao.updateOneBookingAPI(customer);
    }
}
