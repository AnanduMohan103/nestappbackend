package com.nestdigital.nestApp.Dao;

import com.nestdigital.nestApp.Model.AdminModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminDao extends CrudRepository<AdminModel,Integer> {
@Query(value = "SELECT * FROM `emp_add` WHERE `empcode`=:empcode",nativeQuery = true)
    List<AdminModel> SearchEmp(Integer empcode);

@Modifying
@Query(value = "DELETE FROM `emp_add` WHERE `empcode`=:empcode",nativeQuery = true)
    void DeleteEmp(Integer empcode);

@Modifying
@Query(value ="UPDATE `emp_add` SET `address`=:address,`dob`=:dob,`email`=:email,`jod`=:jod,`name`=:name,`password`=:password,`phone`=:phone,`username`=:username WHERE `empcode`=:empcode",nativeQuery = true )
void EditEmp(String address,String dob,String email,String jod,String name,String password,String phone,String username,Integer empcode);

@Query(value = "SELECT `id`, `address`, `dob`, `email`, `empcode`, `jod`, `name`, `password`, `phone`, `username` FROM `emp_add` WHERE `username`=:username AND `password`=:password",nativeQuery = true)
List<AdminModel>LoginEmployee (String username, String password);

}
