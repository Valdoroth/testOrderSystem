package com.ordering.testOrderSystem.service;

import com.ordering.testOrderSystem.dao.WingsDAO;
import com.ordering.testOrderSystem.entity.Wings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WingsServiceImpl implements WingsService {
    private final WingsDAO wingsDAO;

    @Autowired
    public WingsServiceImpl(WingsDAO wingsDAO) {
        this.wingsDAO = wingsDAO;
    }

    @Override
    public List<Wings> wingsList() {
        return this.wingsDAO.wingsList();
    }

    @Override
    public Object wingsByID(int wingsId) {
        return this.wingsDAO.wingsByID(wingsId);
    }

    @Override
    public void saveOrUpdate(Wings wings) {
        this.wingsDAO.saveOrUpdate(wings);
    }

    @Override
    public void deleteWings(int wingsId) {
        this.wingsDAO.deleteWings(wingsId);
    }
}
