package lma.marvelsuperheroes.HeroesDescription;

/**
 * Created by Larissa on 14/07/2015.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import lma.marvelsuperheroes.R;


/**
 * Created by ess on 17/08/14.
 */
public class     DescricaoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private Context context;
    public static TextView nome;
    public static TextView descricao;
    public static ImageView foto;


    public DescricaoViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
        nome = (TextView) itemView.findViewById(R.id.nome_info);

        foto = (ImageView) itemView.findViewById(R.id.circleView_info);
        
    }



    @Override
    public void onClick(View v) {
        Toast.makeText(context, nome.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
