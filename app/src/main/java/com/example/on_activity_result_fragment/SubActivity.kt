package com.example.on_activity_result_fragment

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.on_activity_result_fragment.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub)
        binding.buttonSub.setOnClickListener {
            finish()
        }
    }

    companion object {
        const val COMPLETE_RESULT_CODE = 1

        fun createIntent(context: Context): Intent {
            return Intent(context, SubActivity::class.java)
        }
    }
}