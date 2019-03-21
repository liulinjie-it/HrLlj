package com.newer.HRMongoDB.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.newer.HRMGDB.HR;


@Repository
public interface HRRepository extends MongoRepository<HR, String> {
}