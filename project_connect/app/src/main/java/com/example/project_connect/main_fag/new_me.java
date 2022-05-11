package com.example.project_connect.main_fag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.project_connect.R;
import com.google.android.material.textfield.TextInputLayout;

public class new_me extends Fragment {
    private TextInputLayout first , second , third , fourth ;
    private Button done ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.new_me , container , false);

        first = v.findViewById(R.id.usname);
        second = v.findViewById(R.id.npass);
        third = v.findViewById(R.id.conf_pass);
        fourth = v.findViewById(R.id.born);
        done = v.findViewById(R.id.done_check);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getEditText().getText().toString().trim().isEmpty()) {
                    first.setError(" ");
                }
                else if(second.getEditText().getText().toString().trim().isEmpty()) {
                    second.setError(" ");
                }
                else if(third.getEditText().getText().toString().trim().isEmpty()) {
                    third.setError(" ");
                }
                else if(fourth.getEditText().getText().toString().trim().isEmpty()) {
                    fourth.setError(" ");
                }

                else {

                     // call the function to Perform the task
                }
            }
        });
        return v ;
    }
}
