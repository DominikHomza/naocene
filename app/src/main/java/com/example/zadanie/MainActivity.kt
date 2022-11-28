package com.example.zadanie



import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bLeft = findViewById<Button>(R.id.dupa)
        val bRight = findViewById<Button>(R.id.siusiak)
        // make array with drawables
        val images = arrayOf(R.drawable.images, R.drawable.rys, R.drawable.sia_umysu_jpg)
        val image = findViewById<ImageView>(R.id.imageView2)
        bLeft.setOnClickListener() {
            // go to left image array, if last go to first
            if (image.drawable.constantState == resources.getDrawable(images[0]).constantState) {
                image.setImageResource(images[2])
            } else if (image.drawable.constantState == resources.getDrawable(images[1]).constantState) {
                image.setImageResource(images[0])
            } else if (image.drawable.constantState == resources.getDrawable(images[2]).constantState) {
                image.setImageResource(images[1])
            }
        }
        bRight.setOnClickListener() {
            // go to right image array, if last go to first
            if (image.drawable.constantState == resources.getDrawable(images[0]).constantState) {
                image.setImageResource(images[1])
            } else if (image.drawable.constantState == resources.getDrawable(images[1]).constantState) {
                image.setImageResource(images[2])
            } else if (image.drawable.constantState == resources.getDrawable(images[2]).constantState) {
                image.setImageResource(images[0])
            }
        }
        val res = findViewById<Button>(R.id.silniaaa)
        res.setOnClickListener() {
            // get text from edit text
            val text = findViewById<EditText>(R.id.sussy)
            // get text from edit text and convert to int
            val number = text.text.toString().toInt()
            val result = number*1*2*3
            // dialog box builder
            val textObj = findViewById<TextView>(R.id.ioduhuyaftw)
            textObj.text = "Wynik silni to $result"
        }

    }
}
