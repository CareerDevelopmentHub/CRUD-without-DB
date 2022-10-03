package com.example.crudwithoutdb;

public class Student {

    private Long id;
    private String name;
    private String department;
    private long batch;

    public Student() {
    }

    public Student(Long id, String name, String department, long batch) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.batch = batch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getBatch() {
        return batch;
    }

    public void setBatch(long batch) {
        this.batch = batch;
    }

}
