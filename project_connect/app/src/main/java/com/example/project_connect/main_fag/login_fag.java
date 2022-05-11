package com.example.project_connect.main_fag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.project_connect.R;
import com.google.android.material.textfield.TextInputLayout;

public class login_fag extends Fragment {
    private TextInputLayout first , second ;
    private TextView new_p ;
    private Button enter_check ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.check_me , container , false);

        first = v.findViewById(R.id.em_sh);
        second = v.findViewById(R.id.pass);
        new_p = v.findViewById(R.id.fog_pass);
        enter_check = v.findViewById(R.id.bn_log);

        enter_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getEditText().getText().toString().trim().isEmpty() ) {

                    first.setError(" ");

                }
                  else if(second.getEditText().getText().toString().isEmpty()) {

                      second.setError(" ");

                }
                else {
                    // call function to check the enter details
                }
            }
        });


        return v ;
    }
}
