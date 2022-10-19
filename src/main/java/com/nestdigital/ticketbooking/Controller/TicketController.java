package com.nestdigital.ticketbooking.Controller;

import com.nestdigital.ticketbooking.Dao.TicketDao;
import com.nestdigital.ticketbooking.Model.TicketModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TicketController {
    @Autowired
    private TicketDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public String ticket(@RequestBody TicketModel ticket) {
        dao.save(ticket);
        return "{status:'Success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<TicketModel>viewticket(){
        return (List<TicketModel>) dao.findAll();
    }
}
