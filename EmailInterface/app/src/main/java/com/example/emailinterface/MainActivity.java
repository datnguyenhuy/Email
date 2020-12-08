package com.example.emailinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EmailAdapter adapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Email> list=getData();

        listView=(ListView) findViewById(R.id.listview);

        adapter=new EmailAdapter(list,this);
        listView.setAdapter(adapter);
    }

    private List<Email> getData(){
        List<Email> listEmail=new ArrayList<>();

        Email email_yel=new Email("yellow","","Datnguyenhuy","Thu moi tham gia hoi nghi coder toan quoc duoc to chuc tai Ho Chi Minh","11:03 am");
        Email email_pik=new Email("pink","","Trinhthitam","<p> Kinh gui Trinh Thi Tam, toi la NguyenHuyDat, toi 22 tuoi <p>","10:24 am");
        Email email_gre=new Email("green","","Nguyenquanhuy","Thu moi tham gia hoi nghi coder toan quoc duoc to chuc tai Ho Chi Minh","11:03 am");

        listEmail.add(email_yel);
        listEmail.add(email_pik);
        listEmail.add(email_gre);
        listEmail.add(email_pik);
        listEmail.add(email_yel);
        listEmail.add(email_pik);
        listEmail.add(email_gre);
        listEmail.add(email_pik);
        listEmail.add(email_yel);
        listEmail.add(email_gre);
        listEmail.add(email_pik);

        return listEmail;
    }
}

