/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.beacukai.SimaudiApi.controller;

import id.go.beacukai.SimaudiApi.model.TdUsulanHeader;
import id.go.beacukai.SimaudiApi.repository.UsulanHdrRepo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
public class UsulanController {
    @Autowired
    UsulanHdrRepo usulanHdrRepo;
    
    @GetMapping(path = "/usulan", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TdUsulanHeader> getInfo() throws ParseException {
        List<TdUsulanHeader> tdUsulanHeader = usulanHdrRepo.findAll();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < tdUsulanHeader.size(); i++) {
            String strDate=formatter.format(tdUsulanHeader.get(i).getTanggalDokumen());
            System.out.println("Date : "+strDate);
            Date date=formatter.parse(strDate);
            tdUsulanHeader.get(i).setTanggalDokumen(date);
        }
        return tdUsulanHeader;
    }
}
