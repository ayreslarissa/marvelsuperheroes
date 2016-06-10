package lma.marvelsuperheroes;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import lma.marvelsuperheroes.HeroesDescription.DescricaoActivity;

/**
 * Created by Larissa on 10/06/2016.
 */
public class HeroesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private Context context;
    public static TextView nome;
    public static ImageView foto;


    public HeroesViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
        nome = (TextView) itemView.findViewById(R.id.textViewName);
        foto = (ImageView) itemView.findViewById(R.id.background);

        itemView.setOnClickListener(this);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), DescricaoActivity.class);

                v.getContext().startActivity(intent);

            }
        });
    }



    @Override
    public void onClick(View v) {
        Toast.makeText(context, nome.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
