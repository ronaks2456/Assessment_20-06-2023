package com.dxc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, String>{
	Optional<List<Note>> findByCreatedBy(String createdBy); 

}
