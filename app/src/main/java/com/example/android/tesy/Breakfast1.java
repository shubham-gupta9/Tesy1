package com.example.android.tesy;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link //Exercise1.//OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Exercise1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Breakfast1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // TODO: Rename and change types and number of parameters
    public static Breakfast1 newInstance() {
        Breakfast1 fragment = new Breakfast1();

        return fragment;
    }

    public Breakfast1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.breakfast1,container,false);
        //TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        //tvLabel.setText(page+"--"+title);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event



}
