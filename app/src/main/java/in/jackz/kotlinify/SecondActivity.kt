package `in`.jackz.kotlinify

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    internal var mButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val i =intent
        val (id) = i.getSerializableExtra("data") as User
        Log.d("hai", id)
        mButton!!.setOnClickListener(onClickListener)

    }

    internal var onClickListener: View.OnClickListener = View.OnClickListener { }
}
