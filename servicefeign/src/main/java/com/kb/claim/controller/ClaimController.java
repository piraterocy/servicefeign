package com.kb.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kb.claim.service.SchedualClaimService;

@RestController
public class ClaimController {
	@Autowired
    SchedualClaimService schedualClaimService;
	
	@RequestMapping(value = "/claims/{id}",method = RequestMethod.GET)
    public String getClaim(@PathVariable("id") String id){
        return schedualClaimService.getClaimFromFeign(id);
    }
}
