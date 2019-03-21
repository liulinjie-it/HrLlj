package com.newer.HRMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newer.HRMGDB.HR;



public interface HRRepository extends MongoRepository<HR, String> {
}