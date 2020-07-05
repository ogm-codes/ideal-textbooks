package com.example.idealtextbook;

public class Book
{
    private String Title;
    private String Category;
    private String Description;
    private int  Thumbnail;

    public Book(String title,String category,String description,int thumbnail)
    {

        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    //Getter Method
    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    //Setter Methods

    public void setDescription(String description) {
        Description = description;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
