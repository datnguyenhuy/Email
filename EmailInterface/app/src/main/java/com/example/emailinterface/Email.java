package com.example.emailinterface;

import android.widget.ImageView;
import android.widget.TextView;

public class Email {
        String image_Profile;
        String text_Lower;
        String text_Name;
        String text_Content;
        String text_Time;

        public Email(String image_Profile,String text_Lower,String text_Name,String text_Content,String text_Time)
        {
            this.image_Profile=image_Profile;
            this.text_Lower=text_Lower;
            this.text_Name=text_Name;
            this.text_Content=text_Content;
            this.text_Time= text_Time;
        }

        public String getimage_Profile(){
            return image_Profile;
    }

    public void setimage_Profile(String image_Profile){
        this.image_Profile=image_Profile;
    }

    public String gettext_Lower(){
        return text_Lower;
    }

    public void settext_Lower(String text_Lower){
        this.text_Lower=text_Lower;
    }

    public String gettext_Name(){
            return text_Name;
    }

    public void settext_Name(String text_Name){
            this.text_Name=text_Name;
    }

    public String gettext_Content(){
        return text_Content;
    }

    public void settext_Content(String text_Content){
        this.text_Content=text_Content;
    }

    public String getText_Time()
    {
        return text_Time;
    }

    public void setText_Time(String text_Time){
        this.text_Time=text_Time;
    }
}
