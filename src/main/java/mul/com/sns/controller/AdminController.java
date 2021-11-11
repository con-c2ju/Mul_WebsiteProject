package mul.com.sns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.com.sns.service.AdminService;

@RestController
@RequestMapping(value="/admin")
public class AdminController {

	@Autowired
	AdminService service;
}
