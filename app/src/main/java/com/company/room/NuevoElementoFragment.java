package com.company.room;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.company.room.databinding.FragmentNuevoElementoBinding;


public class NuevoElementoFragment extends Fragment {
    private FragmentNuevoElementoBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentNuevoElementoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ElementosViewModel elementosViewModel = new ViewModelProvider(requireActivity()).get(ElementosViewModel.class);
        NavController navController = Navigation.findNavController(view);

        binding.crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = binding.nombre.getText().toString();
                String descripcion = binding.descripcion.getText().toString();
                String tipo = binding.tipo.getText().toString();

                switch (nombre){
                    case "iron man":
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.ironman, tipo));
                        break;
                    case "capitan america":
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.capitanamerica, tipo));
                        break;
                    case "craneo rojo":
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.craneorojo, tipo));
                        break;
                    case "spiderman":
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.spiderman, tipo));
                        break;
                    case "thanos":
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.thanos, tipo));
                        break;
                    case "thor":
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.thor, tipo));
                        break;
                    case "ultron":
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.ultron, tipo));
                        break;
                    default:
                        elementosViewModel.insertar(new Elemento(nombre, descripcion, R.drawable.predeterminada, tipo));
                        break;
                }


                navController.popBackStack();
            }
        });
    }
}