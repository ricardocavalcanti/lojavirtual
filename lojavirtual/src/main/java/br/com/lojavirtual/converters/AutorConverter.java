package br.com.lojavirtual.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.lojavirtual.models.Autor;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent componet, String id) {
		
		System.out.println("Convertendo para Objeto: " + id);
		
		if (id == null || id.trim().isEmpty()) return null;
		
		Autor autor = new Autor();		
		autor.setId(Integer.valueOf(id));
		
		return autor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent componet, Object autorObject) {
		
		System.out.println("Convertendo para String: " + autorObject);
		
		if(autorObject == null) return null;
		
		Autor autor = (Autor) autorObject;
		
		return autor.getId().toString();
	}
	

}
