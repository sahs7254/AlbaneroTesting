package com.example.emp.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public class StudentService {
		
		@Autowired
	    private StudentRepository repo;
		
		public List<Student> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Student std) {
	        repo.save(std);
	    }
	     
	    public Student get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	 
	}
}
