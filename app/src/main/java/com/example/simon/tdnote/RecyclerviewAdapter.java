package com.example.simon.tdnote;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by simon on 23/11/2016.
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    private  ArrayList<Animaux> animauxList;

    private Resources res;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //Instentiation des donné de linterface de chaque element de la liste
        public CardView cardview;
        public ImageView image;
        public TextView nom;
        public TextView espece;
        public TextView note;



        //Constructeur du ViewHolder
        public ViewHolder(View view) {
            super(view);
            cardview = (CardView) view.findViewById(R.id.cdv);
            image = (ImageView) view.findViewById(R.id.img);
            nom = (TextView) view.findViewById(R.id.Nom);
            espece= (TextView) view.findViewById(R.id.Espece);
            note= (TextView) view.findViewById(R.id.Note);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Récuperation des ressources pour les image
        this.res = parent.getContext().getResources();
        //ainsi que du context
        this.context = parent.getContext();

        //j'ai pas compris
        View v = LayoutInflater.from(context).inflate(R.layout.list_animaux,parent,false);

        //Création du viewHolder
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Animaux planete = animauxList.get(position);
        holder.cardview.setRadius(10);
        holder.image.setImageResource(res.getIdentifier(planete.getImageName() , "drawable", context.getPackageName()));
        holder.nom.setText(planete.getNom());
        holder.espece.setText(planete.getEspece());
        holder.note.setText(planete.getNote());

    }

    //Constructeur de la classe RecyclerViewAdapter
    public RecyclerviewAdapter(ArrayList<Animaux> anim)
    {
        animauxList = anim;
    }

    //Fonction qui retourne la taille de mon "DataSet"
    @Override
    public int getItemCount() {
        return animauxList.size();
    }



}
