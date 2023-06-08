package com.studentdataapi;

public class Student {

    private Long studentId;
    private String studentName;
    private String address;
    private Long collageId;

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCollageId(Long collageId) {
        this.collageId = collageId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAddress() {
        return address;
    }

    public Long getCollageId() {
        return collageId;
    }
}
