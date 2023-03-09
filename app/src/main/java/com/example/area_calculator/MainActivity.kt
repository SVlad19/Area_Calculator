package com.example.area_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val Pi = 3.14
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //-----------------------------Circle----------------------------------------//
    fun CalcCircleArea(){
        val ET_Radius_Element = findViewById<EditText>(R.id.ET_Radius)
        val TV_CircleArea = findViewById<TextView>(R.id.TV_CircleArea)

        val Radius = ET_Radius_Element.text.toString().toDouble()
        //Integer.parseInt(ET_Radius_Element.getText().toString())

        val Area = (Radius * Radius) * Pi
        TV_CircleArea.setText(Area.toString())

    }
    //-----------------------------Circle----------------------------------------//

    //-----------------------------Square----------------------------------------//

    fun CalcSquareArea(){
        val ET_Side_Element = findViewById<EditText>(R.id.ET_Side_Square)
        val TV_SquareArea = findViewById<TextView>(R.id.TV_Square_Area)

        val Side  = ET_Side_Element.text.toString().toDouble()
        //Integer.parseInt(ET_Side_Element.getText().toString())

        val Area = Side * Side
        TV_SquareArea.setText(Area.toString())

    }

    //-----------------------------Square----------------------------------------//

    //-----------------------------Rectangle----------------------------------------//

    fun CalcRectangleArea(){
        val ET_FirstSide_Element = findViewById<EditText>(R.id.ET_FirstSide_Rectangle)
        val ET_SecondSide_Element = findViewById<EditText>(R.id.ET_SecondSide_Rectangle)
        val TV_SquareArea = findViewById<TextView>(R.id.TV_Rectangle_Area)

        val FirstSide  = ET_FirstSide_Element.text.toString().toDouble()
        //Integer.parseInt(ET_FirstSide_Element.getText().toString())
        val SecondSide  = ET_SecondSide_Element.text.toString().toDouble()
        //Integer.parseInt(ET_SecondSide_Element.getText().toString())

        val Area = FirstSide * SecondSide
        TV_SquareArea.setText(Area.toString())

    }

    //-----------------------------Rectangle----------------------------------------//

    //-----------------------------Triangle----------------------------------------//

    fun CalcTriangleArea(){
        val ET_TriangleSide = findViewById<EditText>(R.id.ET_TriangleSide)
        val ET_TriangleHeight = findViewById<EditText>(R.id.ET_TriangleHeight)
        val TV_Triangle_Area = findViewById<TextView>(R.id.TV_Triangle_Area)

        val TriangleSide  = ET_TriangleSide.text.toString().toDouble()
        //Integer.parseInt(ET_FirstSide_Element.getText().toString())
        val HeightSide  = ET_TriangleHeight.text.toString().toDouble()
        //Integer.parseInt(ET_SecondSide_Element.getText().toString())

        val Area = (TriangleSide * HeightSide) * 0.5
        TV_Triangle_Area.setText(Area.toString())
    }

    //-----------------------------Triangle----------------------------------------//

    //-----------------------------OnClick----------------------------------------//

    fun OnClickCalc(view: View){
        CalcCircleArea()
        CalcSquareArea()
        CalcRectangleArea()
        CalcTriangleArea()
    }

    //-----------------------------OnClick----------------------------------------//
}