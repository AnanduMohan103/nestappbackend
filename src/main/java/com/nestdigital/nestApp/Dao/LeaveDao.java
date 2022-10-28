package com.nestdigital.nestApp.Dao;

import com.nestdigital.nestApp.Model.LeaveModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface LeaveDao extends CrudRepository<LeaveModel,Integer> {

    @Modifying
    @Query(value = "UPDATE `leaves` SET `status`=:status WHERE `id`=:id",nativeQuery = true)
    void updateById(Integer status,Integer id);

    @Query(value = "SELECT l.`id`, l.`status`, l.`apply_date`, l.`empcode`, l.`leave_date`, l.`type`, l.`discrip`,e.name FROM `leaves` l JOIN emp_add e ON l.empcode=e.empcode",nativeQuery = true)
    List<Map<String,String>> viewAllLeaveBy();

    @Query(value = "SELECT l.`id`, l.`status`, l.`apply_date`, l.`empcode`, l.`leave_date`, l.`type`, l.`discrip`,e.name FROM `leaves` l JOIN emp_add e ON l.empcode=e.empcode",nativeQuery = true)
    List<Map<String,String>> viewAllLeaveById(Integer empcode);

}

