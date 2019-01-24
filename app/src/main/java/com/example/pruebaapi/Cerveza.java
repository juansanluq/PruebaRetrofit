package com.example.pruebaapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cerveza {
    @Expose
    @SerializedName("dept_no")
    int dept_no;
    @Expose
    @SerializedName("dnombre")
    String dnombre;
    @Expose
    @SerializedName("loc")
    String loc;

    public Cerveza(int dept_no, String dnombre, String loc) {
        this.dept_no = dept_no;
        this.dnombre = dnombre;
        this.loc = loc;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
