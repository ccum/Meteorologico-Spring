package com.tiempo.mvc.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.tiempo.mvc.model.RegistroDatos;
import com.tiempo.mvc.repository.RegistroDatosRepository;

public class RegistroMeteorologicoService {

	private RegistroDatosRepository repository;
	
	public RegistroMeteorologicoService() {
		super();
		// TODO Auto-generated constructor stub
		repository = new RegistroDatosRepository();
		
	}
	
	public List<String> provinciaList()
	{
		List<String> result = RegistroDatosRepository.getAll().stream().filter(distinctByKey(b -> b.getProvincia()))
				.map(RegistroDatos::getProvincia).collect(Collectors.toList());
		return result;
	}
	

	private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
