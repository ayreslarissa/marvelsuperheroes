package lma.marvelsuperheroes;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import lma.marvelsuperheroes.BD.BD;

public class MainActivity extends AppCompatActivity {

    static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<HeroesData> heroes;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;
    CardView abrirNovaActivity;
    private BD banco;

    HeroesAdapter heroesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        setContentView(R.layout.activity_main);

        abrirNovaActivity = (CardView) findViewById(R.id.card_view);
        String publicKey = "1fcd301e844fbf29e2cea213fb7646bc";
         String privateKey = "8fabde8d295a3a840bc47b2bd1f58c902f34dc9d";

        banco = new BD(getApplicationContext());
        heroes = banco.getAllHeroes();

        heroesAdapter = new HeroesAdapter(getApplicationContext(), heroes);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(heroesAdapter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());



    }

         /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        // Associate searchable configuration with the SearchView
  SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        return true;
    }*/
}
