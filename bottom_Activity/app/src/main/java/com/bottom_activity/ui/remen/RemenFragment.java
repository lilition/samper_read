package com.bottom_activity.ui.remen;

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

public class RemenFragment extends Fragment {

    private RemenViewModel remenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        remenViewModel =
                ViewModelProviders.of(this).get(RemenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_remen, container, false);
        final TextView textView = root.findViewById(R.id.text_remen);
        remenViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}