package com.nestdigital.nestApp.Controller;

import com.nestdigital.nestApp.Dao.AdminDao;
import com.nestdigital.nestApp.Dao.SecurityDao;
import com.nestdigital.nestApp.Model.AdminModel;
import com.nestdigital.nestApp.Model.SecurityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostRemove;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class SecurityController {
    @Autowired
    private SecurityDao dao;

    @CrossOrigin("*")
    @PostMapping(path = "/addsecurity",consumes = "application/json",produces = "application/json")
    public String AddSecurity(@RequestBody SecurityModel addSecurity){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String currentdate= String.valueOf(dt.format(now));
        addSecurity.setsDate(currentdate);
        System.out.println(addSecurity.toString());
        dao.save(addSecurity);
        return "{success}";
    }

    @CrossOrigin
    @GetMapping("/viewsecurity")
    public List<SecurityModel> ViewSecurity(){
        return (List<SecurityModel>) dao.findAll();
    }

    @CrossOrigin("*")
    @PostMapping(path = "/searchsecurity",consumes = "application/json",produces = "application/json")
    public List<SecurityModel> SearchSecurity (@RequestBody SecurityModel search){
        return  (List<SecurityModel>)
                dao.SearchSecurity(search.getsCode());
    }
    @CrossOrigin("*")
    @Transactional
    @PostMapping(path = "/deletesecurity",consumes = "application/json",produces = "application/json")
    public String DeleteSecurity(@RequestBody SecurityModel delete){
        dao.DeleteSecurity(delete.getsCode());
        return "{success}";
    }

    @CrossOrigin("*")
    @Transactional
    @PostMapping(path = "/updatesecurity",consumes = "application/json",produces = "application/json")
    public String UpdateSecurity(@RequestBody SecurityModel update){
        dao.EditSecurity(update.getsName(), update.getsPassword(), update.getsPhone(), update.getsUsername(), update.getsCode());
        return "{status=success}";
    }
    @CrossOrigin("*")
    @PostMapping(path = "/loginsecurity",consumes = "application/json",produces = "application/json")
    public  List<SecurityModel>Login(@RequestBody SecurityModel login){
        return (List<SecurityModel>) dao.LoginSecurity(login.getsUsername(), login.getsPassword());
    }

}
