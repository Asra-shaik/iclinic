/**
 * 
 */
package com.river.bend.iclinic.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.river.bend.iclinic.models.BaseAuth;

public interface BaseAuthRepository extends MongoRepository<BaseAuth, String> {
    
    @Query("{email:'?0'}")
    BaseAuth findUserByEmail(String email);
    

}