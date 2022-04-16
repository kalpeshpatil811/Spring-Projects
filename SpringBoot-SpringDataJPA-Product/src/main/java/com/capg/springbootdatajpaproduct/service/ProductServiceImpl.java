package com.capg.springbootdatajpaproduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springbootdatajpaproduct.dao.ProductDao;
import com.capg.springbootdatajpaproduct.entity.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;

	@Override
	public ProductBean findById(int id) {

		return productDao.findById(id);
	}

	@Override
	public ProductBean update(ProductBean bean) {

		return productDao.update(bean);
	}

}
