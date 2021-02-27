package com.mytube;

public class Video {
    private String fileName;
    private String title;
    private User user;

    public Video(String fileName, String title, User user) {
       setFileName(fileName);
         setTitle(title);
        setUser(user);
    }

    public String getFileName() {
        return fileName;
    }

    private void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    private void setUser(User user) {
        this.user = user;
    }

    private void setTitle(String title) {
        this.title = title;
    }    
    
    public String getTitle() {
        return title;
    }    

    public User getUser() {
        return user;
    }    

}
