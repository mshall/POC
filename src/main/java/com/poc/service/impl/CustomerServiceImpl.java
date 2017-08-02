package com.poc.service.impl;

import org.springframework.stereotype.Service;

import com.common.core.response.subscription.details.SubscriptionDetailsResponse;
import com.common.core.response.subscription.list.CustomerAccounts;
import com.common.core.response.subscription.list.Extension;
import com.common.core.response.subscription.list.Parts;
import com.poc.service.ICustomerService;


@Service
public class CustomerServiceImpl implements ICustomerService {

	@Override
	public SubscriptionDetailsResponse getSubscriptionDetailsResponse(String id) {
		SubscriptionDetailsResponse response = new SubscriptionDetailsResponse();
		Extension extension = new Extension();
		extension.setAgreementEndDate("31-12-2017");
		extension.setAgreementStartDate("1-1-2017");
		response.setExtension(extension);
		response.setId("10000");
		response.setMsisdn("123456789");
		Parts parts = new Parts();
		CustomerAccounts customerAccounts = new CustomerAccounts();
		parts.setCustomerAccounts(customerAccounts);
		response.setType("Generic type");
		return response;
	}

}
