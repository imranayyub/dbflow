package com.example.im.dbflow;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.UUID;

/**
 * Created by Im on 07-12-2017.
 */
@Table(database=Appdatabase.class)
public class TestModel extends BaseModel{
    @PrimaryKey(autoincrement = true) // at least one primary key required
           int id;

    @Column
    String name;

    @Column
    String fname;

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
