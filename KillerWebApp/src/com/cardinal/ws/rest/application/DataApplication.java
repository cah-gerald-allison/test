package com.cardinal.ws.rest.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.cardinal.ws.rest.resource.DataResource;


public class DataApplication extends Application {

	public DataApplication() {
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(DataResource.class);

		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		Set<Object> s = new HashSet<Object>();

		// Register the Jackson provider for JSON
		ObjectMapper mapper = new ObjectMapper();
		// suppress nulls and defaults in POJOs
		mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_DEFAULT);

		JacksonJsonProvider basicProvider = new JacksonJsonProvider();
		basicProvider.setMapper(mapper);

		s.add(basicProvider);
		return s;
	}

}