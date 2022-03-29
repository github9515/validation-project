package com.valid.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.valid.model.Employee;

public interface EmoRepo extends JpaRepository<Employee, Integer>
{

}
