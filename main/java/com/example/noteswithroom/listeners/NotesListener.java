package com.example.noteswithroom.listeners;

import com.example.noteswithroom.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note,int position);
}
