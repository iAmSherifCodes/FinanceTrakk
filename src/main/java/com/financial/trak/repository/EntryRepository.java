package com.financial.trak.repository;

import com.financial.trak.model.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntryRepository extends MongoRepository<Entry, String> {
}
