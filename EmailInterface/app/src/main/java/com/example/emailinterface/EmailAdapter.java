package com.example.emailinterface;

import android.app.AppComponentFactory;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.text.HtmlCompat;

import java.util.ArrayList;
import java.util.List;

public class EmailAdapter extends BaseAdapter {
    final List<Email> listEmail;
    LayoutInflater layoutInflater;
    Context context;

    public EmailAdapter(List<Email> listEmail, Context context)
    {
        this.listEmail=listEmail;
        this.layoutInflater=LayoutInflater.from(context);
        this.context=context;
    }

    @Override
    public int getCount() {
        return listEmail.size();
    }

    @Override
    public Object getItem(int position) {
        return listEmail.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewhd;
        if(convertView==null)
        {
            convertView=layoutInflater.inflate(R.layout.activity_email,null);
            viewhd= new ViewHolder();
            viewhd.profile=(ImageView) convertView.findViewById(R.id.profile);
            viewhd.lower=(TextView) convertView.findViewById(R.id.lower);
            viewhd.name=(TextView) convertView.findViewById(R.id.name);
            viewhd.content=(TextView) convertView.findViewById(R.id.content);
            viewhd.time=(TextView) convertView.findViewById(R.id.time);
            convertView.setTag(viewhd);
        }
        else viewhd=(ViewHolder) convertView.getTag();

        Email email= this.listEmail.get(position);
        viewhd.name.setText(email.gettext_Name().toString());
        viewhd.content.setText(HtmlCompat.fromHtml(email.gettext_Content().toString(),0));
        viewhd.time.setText(email.getText_Time().toString());
        //viewhd.profile.setImageResource(R.drawable.yellow);
        viewhd.lower.setText(email.gettext_Name().toString().substring(0,1));
        int imageId=this.getMipmapResIdByName(email.getimage_Profile());
        viewhd.profile.setImageResource(imageId);

        return convertView;

        //Email email=(Email) getItem(position);

    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "drawable", pkgName);
        Log.v("CustomListView", "Res Name: " + resName + "==> Res ID = " + resID);
        return resID;
    }

    public static class ViewHolder{
        ImageView profile;
        TextView lower;
        TextView name;
        TextView content;
        TextView time;
    }

}
