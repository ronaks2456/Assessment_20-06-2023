package com.dxc.service;

import java.util.List;

import com.dxc.model.Note;

public interface NoteService {
	//Create a Note, 
	public Note createNote(Note note);
	//update a note,
	public Note updateNote(Note note, String noteId);
	//delete a note,
	public void deleteNote(String noteId);
	//get all notes of a specific userId
	public List<Note> getNoteByCreatedBy(String createdBy);
}
