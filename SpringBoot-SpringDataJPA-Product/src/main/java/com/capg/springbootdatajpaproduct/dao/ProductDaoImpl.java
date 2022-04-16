package com.capg.springbootdatajpaproduct.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springbootdatajpaproduct.entity.ProductBean;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public ProductBean findById(int id) {

		return em.find(ProductBean.class, id);
	}

	@Override
	public ProductBean update(ProductBean bean) {
		return em.merge(bean);

	}

}
