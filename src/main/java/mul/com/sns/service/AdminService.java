package mul.com.sns.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.com.sns.dao.AdminDao;

@Service
@Transactional
public class AdminService {

	@Autowired
	AdminDao dao;
}
