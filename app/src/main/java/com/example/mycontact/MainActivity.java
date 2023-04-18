package com.example.mycontact;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts =new ArrayList<ContactModel>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView =findViewById(R.id.recyclercontact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



      // ContactModel model = new ContactModel(R.drawable.ic_launcher_foreground, name= "AB" , number= "456123544");
        //arrContacts.add(model);

        //int img;
        //String name="";
        //String number = "";
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "aaa",  "1556"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "bbb",  "2566"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "ccc",  "3566"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "ddd",  "4556"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "eee",  "5566"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "fff",  "6566"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "ggg",  "7566"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "hhh",  "8566"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "iii",  "9556"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "jjj",  "1056"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "kkk",  "1156"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "lll",  "1256"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "mmm",  "1355"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "nnn",  "1456"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "ooo",  "1556"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "ppp",  "1656"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}