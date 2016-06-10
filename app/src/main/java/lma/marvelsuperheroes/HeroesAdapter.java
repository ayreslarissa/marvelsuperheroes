package lma.marvelsuperheroes;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Larissa on 09/06/2016.
 */
public class HeroesAdapter extends RecyclerView.Adapter<HeroesViewHolder> {

    private Context context;
    public ArrayList<HeroesData> items;
    private static RecyclerViewOnClickListenerHack mRecyclerViewOnClickListenerHack;

    public HeroesAdapter(Context context, ArrayList<HeroesData> items) {
        this.context = context;
        this.items = items;
    }

    public HeroesAdapter(FragmentActivity activity, List<HeroesData> mList) {
    }

    @Override
    public HeroesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_card, parent, false);

        view.setOnClickListener(MainActivity.myOnClickListener);


        HeroesViewHolder myViewHolder = new HeroesViewHolder(context,view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(HeroesViewHolder holder, int position) {
        HeroesData heroes = items.get(position);
        holder.nome.setText(heroes.name);
        holder.foto.setImageResource(heroes.foto);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
