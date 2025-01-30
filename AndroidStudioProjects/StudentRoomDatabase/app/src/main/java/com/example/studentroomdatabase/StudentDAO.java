package com.example.studentroomdatabase;

import androidx.annotation.DisplayContext;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDAO {
    @Insert
    void insertAll(Student... students);

    @Query("Select * from Student")
    List<Student> getAll();

    @Query("Select * from student where lastName IN(:s)")
    List<Student> findByLastName(String s);

    @Delete
    void Delete(Student s);

    @Update
    void Update(Student s);

    @DisplayContext
    void Display(Student s);
}
