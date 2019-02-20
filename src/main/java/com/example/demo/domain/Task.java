package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "description")
    private String desc;

    @Column(name = "target_date")
    private Date targetDate;

    @Column(name = "is_done")
    private boolean isDone;

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

}
