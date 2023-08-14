package com.pyaraislam.islamicapp.fragment;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.islamicapp.R;


public class Read_By_Para extends Fragment {

    ListView listView;
    String[] rp_name;
    String[] rp_urls;
    ArrayAdapter<String> arrayAdapter;




    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public Read_By_Para() {
        // Required empty public constructor
    }


    public static Read_By_Para newInstance(String param1, String param2) {
        Read_By_Para fragment = new Read_By_Para();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read__by__para, container, false);

        listView = view.findViewById(R.id.listView);
        listView.setDivider(null);
        rp_name = Rp_Lists.rp_name;
        rp_urls = Rp_Lists.rp_urls;

        arrayAdapter = new ArrayAdapter<String>(getContext(), R.layout.rp_item, R.id.item_txt, rp_name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
            String pdfUrl = rp_urls[position];
            openPdf(pdfUrl);
        });

        return view;
    }

    private void openPdf(String pdfUrl) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.parse(pdfUrl), "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                // Handle error: PDF reader app not found
            }
}


}