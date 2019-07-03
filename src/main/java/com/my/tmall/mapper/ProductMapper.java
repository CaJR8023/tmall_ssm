package com.my.tmall.mapper;

import com.my.tmall.pojo.Product;

/**
 * @Author CAJR
 * @create 2019/6/3 1:30
 */

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}