package com.schiavone.honorsmobileapps.scorelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val teamAScore: TextView =findViewById(R.id.team_1_score)
        val a3Points: Button =findViewById(R.id.team_1_3)
        val a2Points: Button =findViewById(R.id.team_1_2)
        val aFree: Button =findViewById(R.id.team_1_free)
        val teamBScore: TextView =findViewById(R.id.team_2_score)
        val b3Points: Button =findViewById(R.id.team_2_3)
        val b2Points: Button =findViewById(R.id.team_2_2)
        val bFree: Button =findViewById(R.id.team_2_free)
        val reset: Button=findViewById(R.id.reset)
        var aTotal=0
        var bTotal=0
        val teamASnackbar=Snackbar.make(findViewById(R.id.coordinate_layout), R.string.aSnackbar, Snackbar.LENGTH_SHORT)
        val teamBSnackbar=Snackbar.make(findViewById(R.id.coordinate_layout), R.string.bSnackbar, Snackbar.LENGTH_SHORT)
        a3Points.setOnClickListener{view->
            aTotal+=3
            teamAScore.text="$aTotal"
            teamASnackbar.show()
        }
        a2Points.setOnClickListener{view->
            aTotal+=2
            teamAScore.text="$aTotal"
        }
        aFree.setOnClickListener{view->
            aTotal+=1
            teamAScore.text="$aTotal"
        }
        b3Points.setOnClickListener{view->
            bTotal+=3
            teamBScore.text="$bTotal"
            teamBSnackbar.show()
        }
        b2Points.setOnClickListener{view->
            bTotal+=2
            teamBScore.text="$bTotal"
        }
        bFree.setOnClickListener{view->
            bTotal+=1
            teamBScore.text="$bTotal"
        }
        reset.setOnClickListener{view->
            aTotal=0
            bTotal=0
            teamAScore.text="$aTotal"
            teamBScore.text="$bTotal"
        }
    }
}