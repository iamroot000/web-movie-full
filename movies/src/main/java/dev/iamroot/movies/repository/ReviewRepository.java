package dev.iamroot.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.iamroot.movies.entities.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{

}
