package com.poc.controller;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.common.core.response.subscription.details.SubscriptionDetailsResponse;
import com.poc.service.ICustomerService;

@RestController
@RequestMapping("/v1/customer")
public class CustomerServiceController {

	@Autowired
	ICustomerService customerService;

	@RequestMapping(value = "/{id}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public ResponseEntity<SubscriptionDetailsResponse> getCustomerSubscriptionDetails(@PathParam("id") String id) {
		return new ResponseEntity<SubscriptionDetailsResponse>(customerService.getSubscriptionDetailsResponse("1"),
				HttpStatus.OK);
	}

}
