package com.example.demo.Controller;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    public CustomerRepository customerRepository;

    @RequestMapping(value = "/get/{name}",method = RequestMethod.GET)
    public ResponseEntity<Customer> getUser(@PathVariable("name") String name){
        return new ResponseEntity<Customer>(customerRepository.findByUserName(name).get(), HttpStatus.OK);
    }


    @RequestMapping(value = "/user/",method = RequestMethod.POST)
    public ResponseEntity<Customer> addUser(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
