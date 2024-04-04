package com.example.p_4_1



import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.p_4_1.ui.theme.Android_lessonsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.name)

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val textView = findViewById<TextView>(R.id.textView)
                textView.text = "вы ввели " + s
            }


            fun ccd(view: View) {
                val textView = findViewById<TextView>(R.id.textView)
                val editText = findViewById<EditText>(R.id.name)

                textView.text = "вы вошли в систему"

            }
        })

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