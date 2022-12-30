package com.example.fawry.controller.CustomerController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.DiscountModel.DiscountDecorator;
import com.example.fawry.service.CustomerService.CheckDiscount;
import com.example.fawry.service.CustomerService.CustomerRegsration;

@RestController
@RequestMapping("/CheckDiscountController")
public class CheckDiscountController {
	@Autowired
	CheckDiscount checkdiscount=new CheckDiscount();
	
	@GetMapping("/discount/{service}")
	public ArrayList<DiscountDecorator> getAllDiscounts(@PathVariable("service") String service) {
        System.out.println("in getAll discounts");
        return checkdiscount.CheckDiscount(service);
    }
}
