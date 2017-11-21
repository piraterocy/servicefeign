package com.kb.claim.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-claim",fallback = SchedualClaimServiceHystric.class)
public interface SchedualClaimService {
	@RequestMapping(value = "/claims/{id}",method = RequestMethod.GET)
	String getClaimFromFeign(@PathVariable("id") String id);
}
