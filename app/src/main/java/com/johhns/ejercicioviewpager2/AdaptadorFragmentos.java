package com.johhns.ejercicioviewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdaptadorFragmentos extends FragmentStateAdapter {

    public AdaptadorFragmentos(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentoUno();
            case 1:
                return new FragmentoDos();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2 ;
    }
}

