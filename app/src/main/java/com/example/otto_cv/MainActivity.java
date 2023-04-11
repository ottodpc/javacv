package com.example.otto_cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("Mai 2022",
                "Aujourd'hui", "NV Gallery",
                "Dévelopeur web Full-Stack React/Symfony"));
        experiences.add(new Experience("Juin 2018",
                "Mai 2022", "Marcello",
                "Barman"));

        ListView listViewExperiences = findViewById(R.id.listViewExperiences);
        ExperienceBaseAdapter adapter = new ExperienceBaseAdapter(experiences, this);
        listViewExperiences.setAdapter(adapter);


        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2023 ",
                "Bac+3 Concepteur Développeur d'Application",
                "CFA INSTA"
        ));
        formations.add(new Formation("2022",
                "Bac+2 Développeur Web",
                "Openclassroom"
        ));
        formations.add(new Formation("2020",
                "Bac+2 Physique",
                "La Sorbonne"
        ));
        ListView listViewFormations = findViewById(R.id.listViewFormations);
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter(formations, this);
        listViewFormations.setAdapter(formationAdapter);

        Button next = (Button) findViewById(R.id.buttonCompetence);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), CompetenceActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }



}
