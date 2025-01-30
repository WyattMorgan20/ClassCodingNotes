package com.example.studentroomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AlertInfo.ResponseInterface{

    StudentDatabase stuDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBTN = findViewById(R.id.addBTN);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNameET = findViewById(R.id.firstNameET);
                EditText lastNameET = findViewById(R.id.lastNameET);
                String firstName = firstNameET.getText().toString();
                String lastName = lastNameET.getText().toString();
                AlertInfo alert = new AlertInfo(firstName, lastName);
                alert.show(getSupportFragmentManager(), "Confirmation");
            }
        });

        Button delBTN = findViewById(R.id.deleteBTN);
        delBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        stuDB = Room.databaseBuilder(getApplicationContext(),
                                StudentDatabase.class, "student").build();
                        EditText firstNameET = findViewById(R.id.firstNameET);
                        EditText lastNameET = findViewById(R.id.lastNameET);
                        String firstName = firstNameET.getText().toString();
                        String lastName = lastNameET.getText().toString();
                        List<Student> lastStudent = stuDB.studentDao().findByLastName(lastName);
                        for (Student s: lastStudent){
                            stuDB.studentDao().Delete(s);
                        }
                    }
                }).start();
            }
        });

        Button updateBTN = findViewById(R.id.updateBTN);
        updateBTN.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          new Thread(new Runnable() {
                                              @Override
                                              public void run() {
                                                  stuDB = Room.databaseBuilder(getApplicationContext(),
                                                          StudentDatabase.class, "student").build();
                                                  EditText firstNameET = findViewById(R.id.firstNameET);
                                                  EditText lastNameET = findViewById(R.id.lastNameET);
                                                  String firstName = firstNameET.getText().toString();
                                                  String lastName = lastNameET.getText().toString();
                                                  List<Student> lastStudent = stuDB.studentDao().findByLastName(lastName);
                                                  for (Student s : lastStudent) {
                                                      stuDB.studentDao().Update(s);
                                                  }
                                              }
                                          }).start();
                                      }
                                  });

        Button displayBTN = findViewById(R.id.displayBTN);
        displayBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        stuDB = Room.databaseBuilder(getApplicationContext(),
                                StudentDatabase.class, "student").build();
                        EditText firstNameET = findViewById(R.id.firstNameET);
                        EditText lastNameET = findViewById(R.id.lastNameET);
                        String firstName = firstNameET.getText().toString();
                        String lastName = lastNameET.getText().toString();
                        List<Student> lastStudent = stuDB.studentDao().findByLastName(lastName);
                        for (Student s : lastStudent) {
                            stuDB.studentDao().getAll();
                        }
                    }
                }).start();
            }
        });

        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                stuDB = Room.databaseBuilder(getApplicationContext(),
                        StudentDatabase.class, "student").build();
                Button addBTN = findViewById(R.id.addBTN);
                addBTN.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText firstNameET = findViewById(R.id.firstNameET);
                        EditText lastNameET = findViewById(R.id.lastNameET);
                        String firstName = firstNameET.getText().toString();
                        String lastName = lastNameET.getText().toString();
                        Student s = new Student(firstName, lastName);
                        stuDB.studentDao().insertAll();
                        Log.d("Room DB", "Insert is Successful");
                    }
                });

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                StudentDatabase stuDB = Room.databaseBuilder(getApplicationContext(),
                        StudentDatabase.class, "student").build();
                Log.d("Room DB", "database is built");
                Student s = new Student("Ram", "Singh");
                stuDB.studentDao().insertAll(s);
                Log.d("Room DB", "insert operation");

                // display all student data
                List<Student> listStudent1 = stuDB.studentDao().getAll();
                for(Student s1: listStudent1){
                    stuDB.studentDao().Delete(s1);
                }

                // display all student data
                List<Student> listStudent = stuDB.studentDao().getAll();
                for(Student s1: listStudent){
                    Log.d("Display", "firstname" + s1.firstName + "," + "lastname" + s1.lastName);
                }
            }
        }).start();
        */

    }

    @Override
    public void response(boolean res){
        if (res){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stuDB = Room.databaseBuilder(getApplicationContext(),
                            StudentDatabase.class, "student").build();
                    EditText firstNameET = findViewById(R.id.firstNameET);
                    EditText lastNameET = findViewById(R.id.lastNameET);
                    String firstName = firstNameET.getText().toString();
                    String lastName = lastNameET.getText().toString();
                    Student s = new Student(firstName, lastName);
                    stuDB.studentDao().insertAll(s);
                }
            }).start();
        }
        else{
            Toast.makeText(this,"Enter your correct information", Toast.LENGTH_LONG).show();

        }
    }
}