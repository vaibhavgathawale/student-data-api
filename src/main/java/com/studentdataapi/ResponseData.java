package com.studentdataapi;

public class ResponseData {

    private Student student;
    private Collage collage;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCollage(Collage collage) {
        this.collage = collage;
    }

    public Student getStudent() {
        return student;
    }

    public Collage getCollage() {
        return collage;
    }
}
