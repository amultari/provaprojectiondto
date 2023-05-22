package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dto.IAutoreLibroDTO;
import com.example.demo.model.Autore;
import com.example.demo.model.Libro;
import com.example.demo.repository.AutoreRepository;
import com.example.demo.repository.LibroRepository;

@SpringBootApplication
public class ProvaprojectiondtoApplication implements CommandLineRunner {

	@Autowired
	private AutoreRepository autoreRepository;
	@Autowired
	private LibroRepository libroRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProvaprojectiondtoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Autore mario = new Autore("Mario", "Rossi", 35);
		autoreRepository.save(mario);
		Autore luca = new Autore("Luca", "Rossi", 45);
		autoreRepository.save(luca);
		Autore evaristo = new Autore("Evaristo", "Rossi", 75);
		autoreRepository.save(evaristo);

		Libro l1 = new Libro("titolo 1", 22, evaristo);
		Libro l2 = new Libro("titolo 2", 242, evaristo);
		Libro l3 = new Libro("titolo 3", 242, luca);
		libroRepository.saveAll(Arrays.asList(l1, l2, l3));

		System.out.println("autori presenti...." + autoreRepository.findAll());
		System.out.println("libri presenti...." + libroRepository.findAll());

		System.out.println(".........................................");
		System.out.println("dto presenti...." + autoreRepository.findAutoreLibriInJoin());
		System.out.println(".........................................");
		System.out.println(".........................................");
		System.out.println(".........................................");
		autoreRepository.findAutoreLibriInJoinNativo().forEach((IAutoreLibroDTO item) -> System.out
				.println("presenti: " + item.getNome() + " " + item.getQuantiLibri() + " libri "));

	}

}
