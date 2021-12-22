package com.dianmediana.tugasproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dianmediana.tugasproject.menu.MenuAppetizers;
import com.dianmediana.tugasproject.menu.MenuBreakfast;
import com.dianmediana.tugasproject.menu.MenuDesserts;
import com.dianmediana.tugasproject.menu.MenuDinner;
import com.dianmediana.tugasproject.menu.MenuDrinks;
import com.dianmediana.tugasproject.menu.MenuIdeal;
import com.dianmediana.tugasproject.menu.MenuLunch;
import com.dianmediana.tugasproject.menu.MenuMainDishes;
import com.dianmediana.tugasproject.menu.MenuSoups;
import com.dianmediana.tugasproject.menu.MenuSupper;
import com.dianmediana.tugasproject.menu.MenuUnderweight;
import com.dianmediana.tugasproject.model.MenuObese;
import com.dianmediana.tugasproject.model.MenuOverweight;

public class RecipeFragment extends Fragment implements View.OnClickListener {

    CardView breakfast, lunch, dinner, supper, underweight, ideal, overweight, obese;
    ImageView salads, main_dishes, soups, desserts, drinks;

    public static com.dianmediana.tugasproject.RecipeFragment getInstance(){
        com.dianmediana.tugasproject.RecipeFragment recipeFragment = new com.dianmediana.tugasproject.RecipeFragment();
        return recipeFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recipe, container, false);
        breakfast = view.findViewById(R.id.breakfast);
        lunch = view.findViewById(R.id.lunch);
        dinner = view.findViewById(R.id.dinner);
        supper = view.findViewById(R.id.supper);
        salads = view.findViewById(R.id.salads);
        main_dishes = view.findViewById(R.id.main_dishes);
        soups = view.findViewById(R.id.soups);
        desserts = view.findViewById(R.id.desserts);
        drinks = view.findViewById(R.id.drinks);
        underweight = view.findViewById(R.id.kurus);
        ideal = view.findViewById(R.id.ideal);
        overweight = view.findViewById(R.id.berisi);
        obese = view.findViewById(R.id.gemuk);

        breakfast.setOnClickListener(this);
        lunch.setOnClickListener(this);
        dinner.setOnClickListener(this);
        supper.setOnClickListener(this);
        salads.setOnClickListener(this);
        main_dishes.setOnClickListener(this);
        soups.setOnClickListener(this);
        desserts.setOnClickListener(this);
        drinks.setOnClickListener(this);
        underweight.setOnClickListener(this);
        ideal.setOnClickListener(this);
        overweight.setOnClickListener(this);
        obese.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.breakfast:
                Intent intent = new Intent(getActivity(), MenuBreakfast.class);
                startActivity(intent);
                break;
            case R.id.lunch:
                intent = new Intent(getActivity(), MenuLunch.class);
                startActivity(intent);
                break;
            case R.id.dinner:
                intent = new Intent(getActivity(), MenuDinner.class);
                startActivity(intent);
                break;
            case R.id.supper:
                intent = new Intent(getActivity(), MenuSupper.class);
                startActivity(intent);
                break;
            case R.id.salads:
                intent = new Intent(getActivity(), MenuAppetizers.class);
                startActivity(intent);
                break;
            case R.id.main_dishes:
                intent = new Intent(getActivity(), MenuMainDishes.class);
                startActivity(intent);
                break;
            case R.id.soups:
                intent = new Intent(getActivity(), MenuSoups.class);
                startActivity(intent);
                break;
            case R.id.desserts:
                intent = new Intent(getActivity(), MenuDesserts.class);
                startActivity(intent);
                break;
            case R.id.drinks:
                intent = new Intent(getActivity(), MenuDrinks.class);
                startActivity(intent);
                break;
            case R.id.kurus:
                intent = new Intent(getActivity(), MenuUnderweight.class);
                startActivity(intent);
                break;
            case R.id.ideal:
                intent = new Intent(getActivity(), MenuIdeal.class);
                startActivity(intent);
                break;
            case R.id.berisi:
                intent = new Intent(getActivity(), MenuOverweight.class);
                startActivity(intent);
                break;
            case R.id.gemuk:
                intent = new Intent(getActivity(), MenuObese.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}