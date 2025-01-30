package com.example.morganwprogram5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DeadAnimalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DeadAnimalFragment extends Fragment {

    private DeadViewModel DeadViewModel;
    private TextView racTV, opTV, otherTV;
    private Button racBTN, opBTN, otherBTN;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DeadAnimalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DeadAnimalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DeadAnimalFragment newInstance(String param1, String param2) {
        DeadAnimalFragment fragment = new DeadAnimalFragment();
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

        racTV = view.findViewById(R.id.racoonTV);
        opTV = view.findViewById(R.id.opossumTV);
        otherTV = view.findViewById(R.id.otherTV);
        racBTN = view.findViewById(R.id.racBTN);
        opBTN = view.findViewById(R.id.opBTN);
        otherBTN = view.findViewById(R.id.otherBTN);

        racBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeadViewModel.racIncrease();
                ((MainActivity) requireActivity()).deadIncrease();
            }
        });

        opBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeadViewModel.opIncrease();
                ((MainActivity) requireActivity()).deadIncrease();
            }
        });

        otherBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeadViewModel.otherIncrease();
                ((MainActivity) requireActivity()).deadIncrease();
            }
        });

        DeadViewModel.racTV.observe(getViewLifecycleOwner(), text -> racTV.setText(text));
        DeadViewModel.opTV.observe(getViewLifecycleOwner(), text -> opTV.setText(text));
        DeadViewModel.otherTV.observe(getViewLifecycleOwner(), text -> otherTV.setText(text));

        // Inflate the layout for this fragment
        return view;
    }
}