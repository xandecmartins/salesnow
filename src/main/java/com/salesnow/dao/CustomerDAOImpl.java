package com.salesnow.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.salesnow.entity.Customer;

@Repository("customerDAO")
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@PersistenceContext
	public EntityManager entityManager;

	@Transactional(readOnly = false)
	public Customer addCustomer(Customer customer) {

		entityManager.persist(customer);
		return customer;
	}

	@Transactional(readOnly = false)
	public Customer updateCustomer(Customer customer) {
		entityManager.merge(customer);
		return customer;
	}

	@Transactional(readOnly = false)
	public void deleteCustomer(long customerId) {

		Customer cusomer = getCustomer(customerId);
		entityManager.remove(cusomer);
	}

	@Transactional(readOnly = true)
	public Customer getCustomer(long customerId) {
		String sql = "select customer from Customer customer where customer.customerId="
				+ customerId;
		try {
			return (Customer) entityManager.createQuery(sql).getSingleResult();
		} catch (Exception e) {
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Customer> getCustomers() {

		return entityManager.createQuery(
				"select customer from Customer customer").getResultList();
	}

}
