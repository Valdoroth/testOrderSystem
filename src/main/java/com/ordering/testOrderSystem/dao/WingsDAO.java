package com.ordering.testOrderSystem.dao;

import com.ordering.testOrderSystem.entity.Wings;

import java.util.List;

public interface WingsDAO {
    List<Wings> wingsList();
    Object wingsByID(int wingsId);
    void saveOrUpdate(Wings wings);
    void deleteWings(int wingsId);
}
