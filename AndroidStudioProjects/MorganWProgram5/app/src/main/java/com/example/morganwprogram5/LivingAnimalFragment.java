package com.example.morganwprogram5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LivingAnimalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LivingAnimalFragment extends Fragment {

    private MainViewModel mViewModel;
    private TextView livingTV;
    private Button livingBTN;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private MainViewModel mainViewModel;
    private TextView livingText;
    private Button livingBTN;

    public LivingAnimalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LivingAnimalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LivingAnimalFragment newInstance(String param1, String param2) {
        LivingAnimalFragment fragment = new LivingAnimalFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dead_animal, container, false);

        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        livingTV = view.findViewById(R.id.livingText);
        livingBTN = view.findViewById(R.id.livingBTN);

        livingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.livingIncrease();
            }
        });

        MainViewModel.livingTV().observe(getViewLifecycleOwner(), text -> livingText.setText(text));

        // Inflate the layout for this fragment
        return view;
    }
}