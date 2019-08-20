/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.beacukai.SimaudiApi.controller;

import id.go.beacukai.SimaudiApi.model.TdSt;
import id.go.beacukai.SimaudiApi.repository.StRepo;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
public class StController {
    @Autowired
    StRepo stRepo;
    
    @CrossOrigin
    @GetMapping(path = "/st", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TdSt> getInfo() throws ParseException {
        List<TdSt> tdSt = stRepo.findAll();
        return tdSt;
    }
    
}
