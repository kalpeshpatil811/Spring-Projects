package com.capg.springbootdatajpaproduct.dao;

import com.capg.springbootdatajpaproduct.entity.ProductBean;

public interface ProductDao {

	public ProductBean findById(int id);

	public ProductBean update(ProductBean bean);

}
