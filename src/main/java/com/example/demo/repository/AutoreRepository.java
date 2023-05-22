package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.AutoreLibroDTO;
import com.example.demo.dto.IAutoreLibroDTO;
import com.example.demo.model.Autore;

public interface AutoreRepository extends JpaRepository<Autore, Long> {

	@Query(value = "SELECT new com.example.demo.dto.AutoreLibroDTO(a.nome , a.cognome , COUNT(l)) "
			+ "FROM Autore a " + " left join  a.libri l "
			+ "GROUP BY a" , nativeQuery = false)
	List<AutoreLibroDTO> findAutoreLibriInJoin();
	
	
	@Query(value = "SELECT a.nome as nome , a.cognome as cognome, COUNT(l.id) as quantiLibri "
			+ "FROM Autore a  left outer join  Libro l on l.autore_id=a.id "
			+ "GROUP BY a.id" , nativeQuery = true)
	List<IAutoreLibroDTO> findAutoreLibriInJoinNativo();

}
