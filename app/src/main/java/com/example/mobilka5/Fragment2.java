package com.example.mobilka5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.Navigation;

public class Fragment2 extends Fragment {
    private static final String TAG = "MyApp";
    private int defaultValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment2, container, false);

        View view = inflater.inflate(R.layout.fragment2, container, false);
        TextView textView = view.findViewById(R.id.text_return);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.getString("bundleKey2");
            if (name != null) {
                textView.setText(name);
            }
        }


        return view;

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ImageView imageView = view.findViewById(R.id.image_cup);
        TextView textView = view.findViewById(R.id.text_sections);
        TextView textView2 = view.findViewById(R.id.text_gymnastics);
        TextView textView3 = view.findViewById(R.id.text_swimming);
        TextView textView4 = view.findViewById(R.id.text_acrobatics);
        TextView textView5 = view.findViewById(R.id.text_yoga);
        TextView textView6 = view.findViewById(R.id.text_football);
        TextView textView7 = view.findViewById(R.id.text_boxing);

        Button button = view.findViewById(R.id.button_sign_up);
        Button button_back = view.findViewById(R.id.button_end2);

        EditText sectionEditText = view.findViewById(R.id.section);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle result = new Bundle();
                String sectionToPass = sectionEditText.getText().toString();
                result.putString("bundleKey", sectionToPass);

                Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment3, result);
            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment1);
            }
        });

    }
}