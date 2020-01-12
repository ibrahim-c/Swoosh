package com.example.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXRTA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league=intent.getStringExtra(EXTRA_LEAGUE)
    }


    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked=false
        skill="Baller"

    }

    fun onBeginnerclick(view: View){
        BallerSkillBtn.isChecked=false
        skill="Beginner"

    }

    fun onSkillFinishClicked(view: View){
        if (skill!=""){  val finishActivity=Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXRTA_SKILL,skill)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this,"please select a level",Toast.LENGTH_SHORT).show()
        }

    }






}
