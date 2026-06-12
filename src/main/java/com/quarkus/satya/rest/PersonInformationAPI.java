package com.quarkus.satya.rest;

import java.util.List;

import com.quarkus.satya.entity.Person;
import com.quarkus.satya.repository.PersonRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonInformationAPI {
	
	
	@Inject
	PersonRepository personRepository;

	@GET
	@Path("/test")
	public String hello() {
		return "Hello from Quarkus REST";
	}
	
	
	
	@GET
	@Path("/persons")
	public List<Person> getPersons() {
        return personRepository.getPersons();
    }
	
	@GET
    @Path("/person/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") String id) {
        return personRepository.getPerson(id);
    }

}
