/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.customs.simaudiapi.controller;

import id.go.customs.simaudiapi.model.TdUsulanHeader;
import id.go.customs.simaudiapi.repository.UsulanHdrRepo;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.kudu.client.KuduClient;
import org.apache.kudu.client.KuduException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Asus
 */
@RestController
public class UsulanController {
    private static final String KUDU_MASTERS = System.getProperty("kuduMasters", "gayolues:7051");

    @Autowired
    UsulanHdrRepo usulanHdrRepo;


    @Cacheable("getTesterKudu")
    @RequestMapping(value = "/testerSimaudi", method = RequestMethod.GET)
    public String getTesterKudu() throws KuduException {
        KuduClient client = new KuduClient.KuduClientBuilder(KUDU_MASTERS).build();
        String tableName = "impala::audit.td_usulan_header";
        return "OK";
    }

    @CrossOrigin
    @GetMapping(path = "/usulan", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TdUsulanHeader> getUsulan() throws ParseException {
        List<TdUsulanHeader> tdUsulanHeader = usulanHdrRepo.findAll();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return tdUsulanHeader;
    }

    @PostMapping(path = "/addusulan", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TdUsulanHeader addUsulan(@RequestBody TdUsulanHeader newUser) {
        return usulanHdrRepo.save(newUser);
    }

    @DeleteMapping(path = "deleteusulan/{id}")
    public void deleteUsulan(@PathVariable(value = "id") BigDecimal id) {
        usulanHdrRepo.deleteById(id);
    }
}
