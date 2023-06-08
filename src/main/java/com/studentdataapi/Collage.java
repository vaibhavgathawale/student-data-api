package com.studentdataapi;

public class Collage {


    private Long collageId;
    private String collageName;
    private String address;

    public void setCollageId(Long collageId) {
        this.collageId = collageId;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCollageId() {
        return collageId;
    }

    public String getCollageName() {
        return collageName;
    }

    public String getAddress() {
        return address;
    }
}
