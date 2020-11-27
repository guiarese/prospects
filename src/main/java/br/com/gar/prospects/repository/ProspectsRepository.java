package br.com.gar.prospects.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.gar.prospects.model.Prospects;

public interface ProspectsRepository extends MongoRepository<Prospects, String>{

}
