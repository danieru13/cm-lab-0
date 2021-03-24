package com.example.helloworld

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount =  findViewById(R.id.show_count);

    }

    /*
    * Shows a Toast when the TOAST button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since a toast always shows on the top,
    *             the passed in view is not used.
    */
    fun showToast(view: View?) {
        val toast: Toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT)
        toast.show()
    }

    /*
    * Increments the number in the TextView when the COUNT button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since the count always appears in the TextView,
    *             the passed in view is not used.
    */
    fun countUp(view: View?) {
        mCount++
        if (mShowCount != null) mShowCount!!.text = Integer.toString(mCount)
    }
}