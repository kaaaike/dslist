package com.devsuperior.dslist.projection;

public interface GameMinProjection {
	
	// Getters para a consulta JPA na GameRepository
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();

}
