package com.poc.service;

import com.common.core.response.subscription.details.SubscriptionDetailsResponse;


public interface ICustomerService {

	SubscriptionDetailsResponse getSubscriptionDetailsResponse(String id);

}
