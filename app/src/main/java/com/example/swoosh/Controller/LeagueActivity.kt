package com.example.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun leagueNextClicked (view: View){
        if (selectedLeague!=""){
            val skillIntent=Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillIntent)}
        else {
            Toast.makeText(this,"please select a league",Toast.LENGTH_SHORT).show()
        }

    }

    fun mensButonClicked(view: View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedLeague="mens"

    }

    fun womensButonClicked(view: View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedLeague="womens"
    }


    fun coedButonClicked(view: View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        selectedLeague="coed"

    }




}
