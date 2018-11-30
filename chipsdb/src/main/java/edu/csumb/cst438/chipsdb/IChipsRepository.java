package edu.csumb.cst438.chipsdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.chipsdb.entities.chip;


@Repository
public interface IChipsRepository extends MongoRepository<chip, String> {
    
}