package com.example.lenovo.recycleviewakmal;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSayur;
    private ArrayList<Sayur> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSayur = findViewById(R.id.rv_sayur);
        rvSayur.setHasFixedSize(true);

        list.addAll(SayurData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvSayur.setLayoutManager(new LinearLayoutManager(this));
        ListSayur listHeroAdapter = new ListSayur(list);
        rvSayur.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
    }

    private void showRecyclerGrid(){
        rvSayur.setLayoutManager(new GridLayoutManager(this, 2));
        GridSayur gridHeroAdapter = new GridSayur(list);
        rvSayur.setAdapter(gridHeroAdapter);
    }

    private void showRecyclerCardView(){
        rvSayur.setLayoutManager(new LinearLayoutManager(this));
        CardViewSayur cardViewHeroAdapter = new CardViewSayur(list);
        rvSayur.setAdapter(cardViewHeroAdapter);
    }
}
