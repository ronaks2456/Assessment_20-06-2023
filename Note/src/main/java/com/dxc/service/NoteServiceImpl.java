package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Note;
import com.dxc.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	NoteRepository repo;
	
	@Override
	public Note createNote(Note note) {
		// TODO Auto-generated method stub
		return repo.save(note);
	}

	@Override
	public Note updateNote(Note note, String noteId) {
		// TODO Auto-generated method stub
		Note n1=repo.getById(noteId);
		n1.setNoteTitle(note.getNoteTitle());
		n1.setNoteContent(note.getNoteContent());
		n1.setNoteStatus(note.getNoteStatus());
		n1.setCreatedAt(note.getCreatedAt());
		return repo.save(n1);
	}

	@Override
	public void deleteNote(String noteId) {
		repo.deleteById(noteId);
	}

	@Override
	public List<Note> getNoteByCreatedBy(String createdBy) {
		// TODO Auto-generated method stub
		Optional <List<Note>> optionalNotes= repo.findByCreatedBy(createdBy);
		return optionalNotes.get();
	}

}
