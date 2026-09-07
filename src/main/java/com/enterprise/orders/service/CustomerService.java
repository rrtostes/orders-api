package com.enterprise.orders.service;

import com.enterprise.orders.domain.Customer;
import com.enterprise.orders.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Customer findById(Long id) {
        return customerRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado: " + id));
    }

    public Customer create(Customer customer) {
        if (customerRepository.existsByEmail(customer.getEmail())) {
            throw new RuntimeException("Email já cadastrado: " + customer.getEmail());
        }
        return customerRepository.save(customer);
    }
}
