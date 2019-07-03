package com.my.tmall.mapper;

import com.my.tmall.pojo.Category;
import com.my.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {

    List<Category> list(Page page);

    int total();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
