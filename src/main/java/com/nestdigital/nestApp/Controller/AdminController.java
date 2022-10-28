package com.nestdigital.nestApp.Controller;

import com.nestdigital.nestApp.Dao.AdminDao;
import com.nestdigital.nestApp.Model.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminDao dao;

    @CrossOrigin("*")
    @PostMapping(path = "/addemp",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody AdminModel add){
        dao.save(add);
        return "{success}";
    }
    @CrossOrigin("*")
    @GetMapping("/viewemp")
    public List<AdminModel> ViewAdmin(){
        return(List<AdminModel>) dao.findAll();
    }

    @CrossOrigin("*")
    @PostMapping(path = "/searchemp",consumes = "application/json",produces = "application/json")
    public List<AdminModel> Searchemp(@RequestBody AdminModel search){
        return (List<AdminModel>)
                dao.SearchEmp(search.getEmpcode());
    }
    @CrossOrigin("*")
    @Transactional
    @PostMapping(path = "/deleteemp")
    public String Deleteemp(@RequestBody AdminModel delete){
        dao.DeleteEmp(delete.getEmpcode());
       return "{status:success}";
    }
    @CrossOrigin
    @Transactional
    @PostMapping(path = "/updateemp",consumes = "application/json",produces = "application/json")
    public String UpdateEmp(@RequestBody AdminModel update){
        dao.EditEmp(update.getAddress(), update.getDob(),update.getEmail(),update.getJod(),update.getName(),update.getPassword(),update.getPhone(),update.getUsername(), update.getEmpcode());
        return "{status=success}";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/loginemp",consumes = "application/json",produces = "application/json")
    public  List<AdminModel>Login(@RequestBody AdminModel login){
        return (List<AdminModel>) dao.LoginEmployee(login.getUsername(), login.getPassword());
    }

}
