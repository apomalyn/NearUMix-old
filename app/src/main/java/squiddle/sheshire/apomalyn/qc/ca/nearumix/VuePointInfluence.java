package squiddle.sheshire.apomalyn.qc.ca.nearumix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import squiddle.sheshire.apomalyn.qc.ca.nearumix.DAO.PointInfluenceDAO;
import squiddle.sheshire.apomalyn.qc.ca.nearumix.modele.PointInfluence;

public class VuePointInfluence extends AppCompatActivity {

    PointInfluenceDAO point_influence_dao;
    PointInfluence pi_courant;
    protected TextView nom_pi;
    protected TextView nom_musique;
    protected ProgressBar avancement_musique;
    protected Button bouton_lecture;
    protected Button bouton_upvote;
    protected Button bouton_downvote;
    protected Button bouton_retour_carte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vue_point_influence);
        point_influence_dao = new PointInfluenceDAO();
        pi_courant = point_influence_dao.getPointInfluence(savedInstanceState.getInt("id_PI"));

        nom_pi=(TextView)findViewById(R.id.nom_pi);
        nom_musique=(TextView)findViewById(R.id.nom_musique);
        avancement_musique=(ProgressBar)findViewById(R.id.avancement_musique);
        bouton_lecture=(Button)findViewById(R.id.bouton_lecture);
        bouton_upvote=(Button)findViewById(R.id.bouton_upvote);
        bouton_downvote=(Button)findViewById(R.id.bouton_downvote);
        bouton_retour_carte=(Button)findViewById(R.id.bouton_retour_carte);

        nom_pi.setText(pi_courant.getNom());
        nom_musique.setText(pi_courant.getMusique().getNom());


    }

    public void retourCarte(View vue){
        this.finish();
    }
}