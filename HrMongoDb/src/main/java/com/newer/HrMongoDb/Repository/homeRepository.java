package com.newer.HrMongoDb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.newer.HrMongoDb.HR;


@Repository
public interface homeRepository  extends MongoRepository<HR, String> {

}
