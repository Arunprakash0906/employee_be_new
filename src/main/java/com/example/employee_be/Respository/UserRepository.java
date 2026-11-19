package com.example.employee_be.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.employee_be.Model.User;
@Repository 
public interface UserRepository extends JpaRepository<User,Integer> {

}
