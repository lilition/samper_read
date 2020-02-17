package com.bottom_activity.ui.mine;

import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.bottom_activity.R;
import com.bottom_activity.SearchActivity;

public class MineFragment extends Fragment {

    private MineViewModel mineViewModel;
    private ConstraintLayout edit;
    private ConstraintLayout massage;
    private ConstraintLayout star;
    private ConstraintLayout local;
    private ConstraintLayout guanyu;
    private ImageView login;
    private TextView yonghuming;
    private TextView coin;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mineViewModel =
                ViewModelProviders.of(this).get(MineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mine, container, false);
        mineViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        edit=getActivity().findViewById(R.id.edit);
        massage=getActivity().findViewById(R.id.massage);
        star=getActivity().findViewById(R.id.star);
        guanyu=getActivity().findViewById(R.id.guanyu);
        yonghuming=getActivity().findViewById(R.id.yonghuming);
        login=getActivity().findViewById(R.id.login);
        coin=getActivity().findViewById(R.id.coin);
        local=getActivity().findViewById(R.id.local);
        setListener();
    }
    private void setListener() {
        OnClick onClick=new OnClick();
        edit.setOnClickListener(onClick);
        massage.setOnClickListener(onClick);
        star.setOnClickListener(onClick);
        guanyu.setOnClickListener(onClick);
        yonghuming.setOnClickListener(onClick);
        login.setOnClickListener(onClick);
        coin.setOnClickListener(onClick);
        local.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.edit: {
                    Toast.makeText(getActivity(),"我的作品",Toast.LENGTH_SHORT).show();
                    break;
                }

                case R.id.massage: {
                    Toast.makeText(getActivity(),"我的消息",Toast.LENGTH_SHORT).show();
                    break;
                }

                case R.id.star: {
                    Toast.makeText(getActivity(),"我的收藏",Toast.LENGTH_SHORT).show();
                    break;
                }

                case R.id.local: {
                    Toast.makeText(getActivity(),"本地文件",Toast.LENGTH_SHORT).show();
                    break;
                }

                case R.id.guanyu: {
                    Toast.makeText(getActivity(),"关于简阅",Toast.LENGTH_SHORT).show();
                    break;
                }

                case R.id.login: {
                    Toast.makeText(getActivity(),"我的头像",Toast.LENGTH_SHORT).show();
                    break;
                }

                case R.id.coin: {
                    Toast.makeText(getActivity(),"我的金币",Toast.LENGTH_SHORT).show();
                    break;
                }

                default:break;
            }
        }
    }
}