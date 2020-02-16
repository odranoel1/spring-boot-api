package com.bolsadeideas.springboot.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.apirest.models.entity.Client;

public interface IClientDao extends CrudRepository<Client, Long> {

}
