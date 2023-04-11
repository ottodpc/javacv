package com.example.otto_cv;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity {
     public void onCreate (Bundle saveInstancesState) {
         super.onCreate(saveInstancesState);
         setContentView(R.layout.page_competence);

         ArrayList<Langages> langages = new ArrayList<>();
        langages.add(new Langages("React", 5F));
         langages.add(new Langages("Kubernetes", 4f));
         langages.add(new Langages("Node.js", 5f));
         langages.add(new Langages("Docker", 4f));
         langages.add(new Langages("Rust", 2F));
         langages.add(new Langages("Symfony", 3F));
        langages.add(new Langages("MongoDB", 5F));
        langages.add(new Langages("MySQL", 4F));

         ListView ListViewMyLangage= findViewById(R.id.ListViewMyLangage);
         LangageBaseAdapter langageadapter = new LangageBaseAdapter(langages, this);
         ListViewMyLangage.setAdapter(langageadapter);

         ArrayList<Projet> projets = new ArrayList<>();
         projets.add(new Projet("OTTO CV", "https://github.com/ottodpc", "Java Android App"));

         ListView ListViewMyProjet= findViewById(R.id.ListViewMyProjet);
         ProjetBaseAdapter projetadapter = new ProjetBaseAdapter(projets, this);
         ListViewMyProjet.setAdapter(projetadapter);
     }

}
