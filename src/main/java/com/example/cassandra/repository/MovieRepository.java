package com.example.cassandra.repository;

import com.example.cassandra.model.Movie;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface MovieRepository extends CassandraRepository<Movie, Integer> {

}
