package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int voto;
	private String corso;
	private LocalDate data;    //MAI usare una stringa dove serve un oggetto che abbia delle caratteristiche speciali, qui non è una stringa e non è un numero.
					//Posso usare l'oggetto Date o Calendar, questi erano, in passato, l'unico modo di gestire le date.	
					//Esiste la nuova libreria java.time che al suo interno detiene l'oggetto LocalDate
	
}
