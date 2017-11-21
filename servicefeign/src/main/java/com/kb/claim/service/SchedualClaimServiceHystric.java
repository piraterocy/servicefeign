package com.kb.claim.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class SchedualClaimServiceHystric implements SchedualClaimService {
    @Override
    public String getClaimFromFeign(String id) {
    	Map<String, Object> result = new HashMap<String, Object>();
		result.put("success", false);
		result.put("message", "claim,"+id+",sorry,error!");
		return result.toString();
    }
}