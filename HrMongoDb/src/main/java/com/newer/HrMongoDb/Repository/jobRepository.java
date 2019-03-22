package com.newer.HrMongoDb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.newer.HrMongoDb.Jobs;

@Repository
public interface jobRepository extends MongoRepository<Jobs, String> {

}
