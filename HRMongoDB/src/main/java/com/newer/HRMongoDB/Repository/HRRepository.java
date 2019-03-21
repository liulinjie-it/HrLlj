package com.newer.HRMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newer.HRMySql.HR;

public interface HRRepository extends MongoRepository<HR, String> {

}
