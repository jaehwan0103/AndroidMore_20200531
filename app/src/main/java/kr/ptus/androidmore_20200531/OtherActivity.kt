package kr.ptus.androidmore_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setupEvent()
        setValues()

        Log.d("다른화면","onCreate실행")

    }

    override fun setupEvent() {



    }

    override fun setValues() {

    }
}
