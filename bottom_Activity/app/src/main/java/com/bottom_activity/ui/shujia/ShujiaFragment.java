package com.bottom_activity.ui.shujia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.bottom_activity.R;

public class ShujiaFragment extends Fragment {

    private ShujiaViewModel shujiaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shujiaViewModel =
                ViewModelProviders.of(this).get(ShujiaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shujia, container, false);
        shujiaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
            }
        });
        return root;
    }
}