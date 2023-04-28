package com.example.note;

public class Note {
    private String mTitle;
    private String mDescription;
    private boolean mIdea;
    private boolean mTodo;
    private boolean mImportant;

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public boolean ismIdea() {
        return mIdea;
    }

    public boolean ismTodo() {
        return mTodo;
    }

    public boolean ismImportant() {
        return mImportant;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setIdea(boolean mIdea) {
        this.mIdea = mIdea;
    }

    public void setTodo(boolean mTodo) {
        this.mTodo = mTodo;
    }

    public void setImportant(boolean mImportant) {
        this.mImportant = mImportant;
    }
}
