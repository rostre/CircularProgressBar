package ro.twodoors.circularprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var progressValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateProgressBar()

        btn_increase.setOnClickListener {
            if (progressValue <= 90) {
                progressValue += 10
                updateProgressBar()
            }
        }

        btn_decrease.setOnClickListener {
            if (progressValue >= 10) {
                progressValue -= 10
                updateProgressBar()
            }
        }
    }

    private fun updateProgressBar(){
        progress_bar.progress = progressValue
        text_view_progress.text = "$progressValue%"
    }
}