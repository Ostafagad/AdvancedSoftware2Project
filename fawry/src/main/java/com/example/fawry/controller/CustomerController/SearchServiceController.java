package com.example.fawry.controller.CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.Response;
import com.example.fawry.model.ServiceModel.Services;
import com.example.fawry.service.CustomerService.SearchService;

@RestController
@RequestMapping("/SearchServiceController")
public class SearchServiceController {
	@Autowired
	SearchService searchservice=new SearchService();
	@GetMapping("/searchservice/{description}")
    public Response<Services> searchService(@PathVariable("description") String description) {
        var service = searchservice.SearchServices(description);
        Response<Services> response = new Response<Services>();
        if (service == null ) {
          response.setStatus(false);
            response.setMessage("Service Not Found");
            response.object = null;

          return response;
        }
        response.setStatus(true);
        response.setMessage("Search Service Successfully");
        response.object =  service;

      return response;

        
    }
	

}
