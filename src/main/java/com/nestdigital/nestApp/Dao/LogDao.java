package com.nestdigital.nestApp.Dao;

import com.nestdigital.nestApp.Model.LogModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface LogDao extends CrudRepository<LogModel,Integer> {
    @Modifying
    @Query(value = "UPDATE `logs` SET `check_out`=:check_out,`out_date`=:out_date WHERE `empcode`=:empcode",nativeQuery = true)
    void logOutStatus(String check_out,String out_date, Integer empcode);

    @Query(value = "SELECT l.`id`, l.`check_in`, l.`check_out`, l.`empcode`, l.`in_date`, l.`out_date`,e.name FROM `logs` l JOIN emp_add e ON l.empcode=e.empcode " ,nativeQuery = true)
    List<Map<String,String>> viewAllLogBy();

    @Query(value = "SELECT l.`id`, l.`check_in`, l.`check_out`, l.`empcode`, l.`in_date`, l.`out_date`,e.name FROM `logs`l JOIN  emp_add e ON l.`empcode`=e.empcode WHERE l.`empcode`=:empcode",nativeQuery = true)
    List<Map<String,String>> viewlogByEmpid(Integer empcode);
}


