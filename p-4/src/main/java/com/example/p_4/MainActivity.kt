package com.example.p_4

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.p_4.ui.theme.Android_lessonsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val constraintLayout = ConstraintLayout(this)
        setContentView(R.layout.activity_main)
        val textView = TextView(this)

        textView.setBackgroundColor(-0x17150a)
        // установка цвета текста
        // установка цвета текста
        textView.setTextColor(-0xa39440)
        // делаем все буквы заглавными
        // делаем все буквы заглавными
        textView.isAllCaps = true
        // устанавливаем вравнивание текста по центру
        // устанавливаем вравнивание текста по центру
        textView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        // устанавливаем текста
        // устанавливаем текста
        textView.text = "Hello Android!"
        // установка шрифта
        // установка шрифта
        textView.setTypeface(Typeface.create("casual", Typeface.NORMAL))
        // устанавливаем высоту текста
        // устанавливаем высоту текста
        textView.textSize = 26f

        val layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        textView.setLayoutParams(layoutParams)

        constraintLayout.addView(textView)
        setContentView(constraintLayout)

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_lessonsTheme {
        Greeting("Android")
    }
}