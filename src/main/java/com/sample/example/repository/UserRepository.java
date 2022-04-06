package com.sample.example.repository;

import com.sample.example.domain.Landlord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<Landlord, UUID> {
}
