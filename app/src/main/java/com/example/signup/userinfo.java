package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class userinfo extends AppCompatActivity {
ListView lv_showuser;
EditText edt_message;
Button btn_send;
 static String Username;
 ArrayList<User> users=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        if (getIntent()!=null){

            Username=getIntent().getStringExtra("username");

        }

        lv_showuser=findViewById(R.id.lv_showuser);
        final UserAdapter userAdapter=new UserAdapter(getApplicationContext(),users);
        lv_showuser.setAdapter(userAdapter);

        edt_message=findViewById(R.id.edt_message);
        btn_send=findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                users.add(new User(Username,edt_message.getText().toString(),R.drawable.fffff));
                userAdapter.notifyDataSetChanged();
                edt_message.setText("");

            }
        });
        lv_showuser.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),users.get(position).toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
