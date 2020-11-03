package br.com.erudio.converter;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerConverter {

	/*
	 * Dozer serve para criar objetos sem necessidade de instanciar e setar cada um.
	 * Ex: Person person = new person();
	 *     person.setId(origin.getId());
	 * Com o Dozer essa instanciação é feita de maneira mais simples, 
	 * como mostra o código implementado.
	 * 
	 * OBS: Caso seja uma aplicação de alta perfomace, não usar o Dozer, 
	 * fazer instancia de forma normal como no Ex.
	 */

	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

	public static <O, D> D parseObject(O origin, Class<D> destination) {
		return mapper.map(origin, destination);
	}

	public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
		List<D> destinationObjects = new ArrayList<D>();
		for (Object o : origin) {
			destinationObjects.add(mapper.map(o, destination));
		}
		return destinationObjects;
	}

}
