package com.example.uas;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;

class FoodData {
    public static ArrayList<Integer> getGambar() {
        ArrayList<Integer> drawables = new ArrayList<Integer>();
        drawables.add(R.drawable.batagor);
        drawables.add(R.drawable.black_salad);
        drawables.add(R.drawable.cappuchino);
        drawables.add(R.drawable.cheesecake);
        drawables.add(R.drawable.cireng);
        drawables.add(R.drawable.donut);
        drawables.add(R.drawable.kopi_hitam);
        drawables.add(R.drawable.mie_goreng);
        drawables.add(R.drawable.nasigoreng);
        drawables.add(R.drawable.sparkling_tea);

        return drawables;
    }

    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Makananan batagor, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 10000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Makananan Salad, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 9000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Cappucino", "Minuman Cappucino, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 8000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "Makananan Cheesecake, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 50000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng", "Makananan Cireng, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 2000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut", "Makananan Donut, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 2500, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Kopi Hitam", "Minuman kopi hitam, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 5000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Makananan Mie Goreng, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 7000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Makananan Nasi Goreng, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 15000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Sparkling Tea", "Minuman Sparkling Tea, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 10000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }

}
