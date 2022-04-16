package com.capg.springbootdatajpaproduct.service;

import com.capg.springbootdatajpaproduct.entity.ProductBean;

public interface ProductService {

	public ProductBean findById(int id);

	public ProductBean update(ProductBean bean);

}
