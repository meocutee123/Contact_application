package com.gmail.nghia241717378.contactapp;

public class Model {
    String txtName, txtDOB, txtPhone;

    public Model(String txtName, String txtDOB, String txtPhone) {
        this.txtName = txtName;
        this.txtDOB = txtDOB;
        this.txtPhone = txtPhone;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtDOB() {
        return txtDOB;
    }

    public void setTxtDOB(String txtDOB) {
        this.txtDOB = txtDOB;
    }

    public String getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(String txtPhone) {
        this.txtPhone = txtPhone;
    }
}
