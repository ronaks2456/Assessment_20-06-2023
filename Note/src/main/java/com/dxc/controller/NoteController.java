package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Note;
import com.dxc.service.NoteService;

@RestController
@RequestMapping("/note")
public class NoteController {
	
	@Autowired
	NoteService service;
	
	@PostMapping("/create")
	public Note createNote(@RequestBody Note note)
	{
		return service.createNote(note);
	}
	@PutMapping("/update/{noteId}")
	public Note updateNote(@RequestBody Note note, @PathVariable String noteId)
	{
		return service.updateNote(note, noteId);
	}
	@DeleteMapping("/delete/{noteId}")
	public void deleteNote(@PathVariable String noteId)
	{
		service.deleteNote(noteId);
	}
	@GetMapping("/get-notes/userId-{userId}")
	public List<Note> getNoteByCreatedBy(@PathVariable("userId") String createdBy)
	{
		return service.getNoteByCreatedBy(createdBy);
	}

}