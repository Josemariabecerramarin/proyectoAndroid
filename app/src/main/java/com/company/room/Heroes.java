package com.company.room;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import com.bumptech.glide.Glide;
import com.company.room.databinding.FragmentRecyclerElementosBinding;
import com.company.room.databinding.ViewholderElementoBinding;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Heroes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Heroes extends RecyclerElementosFragment {

    @Override
    LiveData<List<Elemento>> obtenerElementos(){
        return elementosViewModel.obtenerHeroes();
    }
}