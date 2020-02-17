package com.bottom_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    private TextView search_btn;
    private ImageView back_btn;
    private EditText search_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        search_btn = (TextView) findViewById(R.id.search);
        search_content = (EditText) findViewById(R.id.search_edit);
        back_btn = (ImageView) findViewById(R.id.back);
        setListener();
    }

    private void setListener() {
        OnClick onClick = new OnClick();
        search_btn.setOnClickListener(onClick);
        back_btn.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.back: {
                    finish();
                    break;
                }
                case R.id.search: {
                    if(search_content.getText().length()==0)
                    {
                        Toast.makeText(getApplicationContext(),"请输入搜索内容！",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    searchbook(search_content.getText().toString());
                }
                default:break;
            }
        }
    }

    private void searchbook(String name) {
        //跟据搜索内容在API中搜索
        Toast.makeText(this,("正在搜索"+name),Toast.LENGTH_SHORT).show();
    }
}