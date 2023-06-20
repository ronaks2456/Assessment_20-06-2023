package com.dxc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="note")
public class Note {
	
	 @Id
	 private String noteId;
	 private String noteTitle;
	 private String noteContent;
	 private String noteStatus;
	 private String createdAt;
	 private String createdBy;
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(String noteId, String noteTitle, String noteContent, String noteStatus, String createdAt,
			String createdBy) {
		super();
		this.noteId = noteId;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.noteStatus = noteStatus;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
	}
	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteContent() {
		return noteContent;
	}
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
	public String getNoteStatus() {
		return noteStatus;
	}
	public void setNoteStatus(String noteStatus) {
		this.noteStatus = noteStatus;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteTitle=" + noteTitle + ", noteContent=" + noteContent + ", noteStatus="
				+ noteStatus + ", createdAt=" + createdAt + ", createdBy=" + createdBy + "]";
	}
	 
	 
	 

}
