package com.example.simon.tdnote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Animaux> mesAnimaux;
    TextView nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nom = (TextView) findViewById(R.id.TextClick);

        //Listes de planetes
        mesAnimaux = new ArrayList<Animaux>();
        initList(mesAnimaux);

        RecyclerView rView= (RecyclerView) findViewById(R.id.MainRecycler);


        //Instenciation LinearLayout Manager
        LinearLayoutManager monManager = new LinearLayoutManager(this);

        rView.setLayoutManager(monManager);

        final RecyclerviewAdapter monAdapter = new RecyclerviewAdapter(mesAnimaux);

        rView.setAdapter(monAdapter);

        rView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Animaux selected = (Animaux) mesAnimaux.get(position);

                //Log.v("list perso", "Element selct : "+selected.getNom());
                //Toast.makeText(getBaseContext(),"Element selectioner : "+selected.getNom(),Toast.LENGTH_SHORT).show();
                nom.setText(selected.getNom());

            }
        }));

    }

    public void initList(ArrayList<Animaux> list)
    {
        Animaux p1 = new Animaux();
        p1.setImageName("pnoire");
        p1.setNom("Panthère noire");
        p1.setEspece("Panthère");
        p1.setNote("Entierement noire");
        list.add(p1);
        Animaux p2 = new Animaux();
        p2.setImageName("marm");
        p2.setNom("Marmotte");
        p2.setEspece("Rongeur");
        p2.setNote("Deux grosse dent");
        list.add(p2);
        Animaux p3 = new Animaux();
        p3.setImageName("dober");
        p3.setNom("dobermann");
        p3.setEspece("chien");
        p3.setNote("fidele");
        list.add(p3);
        Animaux p4 = new Animaux();
        p4.setImageName("ecu");
        p4.setNom("ecureuil");
        p4.setEspece("Rongeur");
        p4.setNote("Deux grosse dent");
        list.add(p4);
        Animaux p5 = new Animaux();
        p5.setImageName("loutre");
        p5.setNom("loutre");
        p5.setEspece("Rongeur");
        p5.setNote("Deux grosse dent");
        list.add(p5);
        Animaux p6 = new Animaux();
        p6.setImageName("opo");
        p6.setNom("oposum");
        p6.setEspece("Rongeur");
        p6.setNote("Deux sur la photo");
        list.add(p6);
        Animaux p7 = new Animaux();
        p7.setImageName("ours");
        p7.setNom("ours");
        p7.setEspece("Rongeur");
        p7.setNote("nounours");
        list.add(p7);
        Animaux p8 = new Animaux();
        p8.setImageName("ours");
        p8.setNom("ours");
        p8.setEspece("Rongeur");
        p8.setNote("nounours");
        list.add(p8);
        Animaux p9 = new Animaux();
        p9.setImageName("ours");
        p9.setNom("ours");
        p9.setEspece("Rongeur");
        p9.setNote("nounours");
        list.add(p8);

    }

    public void ViderText(View View){nom.setText("");
    }
}
