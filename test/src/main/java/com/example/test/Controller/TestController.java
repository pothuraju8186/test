package com.example.test.Controller;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.TestEntity;
import com.example.test.Repo.TestRepo;
@RestController
public class TestController {
	
	@Autowired
	TestRepo testrepo;
	
	@PostMapping("/saveTest")
	public TestEntity saveTest(@RequestBody TestEntity  test) {
		return testrepo.save(test);
	}
      @GetMapping("/getTest")
    public List<TestEntity>findAllTestEntity(){
	return testrepo.findAll();
}
      @GetMapping("/getTest/{id}")
      public Optional<TestEntity> findByid(@PathVariable Integer id){
    	  return testrepo.findById(id);
      }
      @PutMapping("/updateTest/{id}")
      public TestEntity updateTest(@PathVariable Integer id,@RequestBody TestEntity test) {
    	  
    	  TestEntity test1= testrepo.findById(id).get(); 
   	  test1.setFirstname(test.getFirstname());
    	  testrepo.save(test1);
    	  return  test1;
    	  
    	  
     }
      @DeleteMapping("/deleteTest/{id}")
      public Integer deleteTest(@PathVariable Integer id)
      {
    	
    	testrepo.deleteById(id);
    		
    	return id;
    	
      }
     
}
