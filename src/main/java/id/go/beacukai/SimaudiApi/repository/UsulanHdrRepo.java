/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.beacukai.SimaudiApi.repository;

import id.go.beacukai.SimaudiApi.model.TdUsulanHeader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Asus
 */
public interface UsulanHdrRepo extends JpaRepository<TdUsulanHeader, Integer> {
    
}