package com.hariClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.hariClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	

}
