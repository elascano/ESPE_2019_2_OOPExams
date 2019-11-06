/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Labs-DCCO
 */
public class DataBook {
    public String name;
    public String title;
    public String editor;
    public int id;
    public int year;
    
    
    public DataBook(String name, String title, String editor, int id, int year){
        this.name = name;
        this.editor = editor;
        this.title = title;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String[] getArray(){
    String[] datos ={String.valueOf(name), String.valueOf(editor), String.valueOf(year), String.valueOf(id), String.valueOf(title)};
        return datos;
    }
    
}
