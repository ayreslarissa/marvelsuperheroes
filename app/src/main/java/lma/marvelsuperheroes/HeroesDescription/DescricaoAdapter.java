package lma.marvelsuperheroes.HeroesDescription;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import lma.marvelsuperheroes.R;


/**
 * Created by Larissa on 14/07/2015.
 */
public class DescricaoAdapter extends RecyclerView.Adapter<DescricaoViewHolder>  {

        private Context context;
        private ArrayList<Descricao> items;


        public DescricaoAdapter(Context context, ArrayList<Descricao> items) {
            this.context = context;
            this.items = items;
        }

    // Create new views (invoked by the layout manager)
        @Override
        public DescricaoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_info, parent, false);
        DescricaoViewHolder viewHolder = new DescricaoViewHolder(context, view);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(final DescricaoViewHolder viewHolder, final int position) {
            Descricao heroes = items.get(position);
            viewHolder.nome.setText(heroes.getNome());
            viewHolder.foto.setImageResource(heroes.getFoto());
            viewHolder.descricao.setText(heroes.getDescricao());
        }

    @Override
    public int getItemCount() {
        return 0;
    }

}

