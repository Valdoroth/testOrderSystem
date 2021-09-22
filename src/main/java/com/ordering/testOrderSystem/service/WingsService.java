package com.ordering.testOrderSystem.service;

import com.ordering.testOrderSystem.entity.Wings;

import java.util.List;

public interface WingsService {
        List<Wings> wingsList();
        Object wingsByID(int wingsId);
        void saveOrUpdate(Wings wings);
        void deleteWings(int wingsId);
}
