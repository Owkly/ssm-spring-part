package com.yannick.mapper;

import com.yannick.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> queryList(Integer id);

}
