package com.example.uas;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Database database = new Database(getApplicationContext());
        ArrayList<Food> data = (ArrayList<Food>) database.getFoodList(getApplicationContext());
        input();
        RecyclerView recyclerView = findViewById(R.id.list_item_view);
        FoodsAdapter adapter = new FoodsAdapter(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public  void input(){
        Database database = new Database(getApplicationContext());
        ArrayList<Food> data = FoodData.getData(getApplicationContext());

        for (com.example.uas.Food food: data) {
            database.input(food);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout_item:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                this.finish();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}