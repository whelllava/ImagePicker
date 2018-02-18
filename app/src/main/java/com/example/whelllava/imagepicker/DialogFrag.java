package com.example.whelllava.imagepicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Whelllava on 2/18/2018.
 */

//public class DialogFrag extends DialogFragment {
//    View view;
//    RecyclerView recyclerView;
//    RecycleViewImageAdabter recycleViewAdabter;
//    List<ImageModel> model;
//
//
//    public DialogFrag() {
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        view = inflater.inflate(R.layout.my_picker, container, false);
//         recyclerView = view.findViewById(R.id.recycler_image_picker);
//        recycleViewAdabter = new RecycleViewImageAdabter(getContext(), model);
//        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
//        recyclerView.setAdapter(recycleViewAdabter);
//
//        return view;
//    }
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        model = new ArrayList<>();
//        model.add(new ImageModel(R.drawable.work ,"Work" ));
//        model.add(new ImageModel(R.drawable.weekly1 , "Weekly 1"));
//        model.add(new ImageModel(R.drawable.study , "Study"));
//        model.add(new ImageModel(R.drawable.sleep , "Sleep"));
//        model.add(new ImageModel(R.drawable.mylove , "My Love"));
//        model.add(new ImageModel(R.drawable.gym , "Gym"));
//
//    }
//}


