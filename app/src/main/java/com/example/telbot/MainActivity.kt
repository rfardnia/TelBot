package com.example.telbot

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telbot.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: DeviceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sample device list
        val devices = mutableListOf(
            DeviceItem(id = "A-001", name = "Device A", status = "Idle"),
            DeviceItem(id = "B-002", name = "Device B", status = "Running"),
            DeviceItem(id = "C-003", name = "Device C", status = "Offline")
        )

        adapter = DeviceAdapter(devices) { item ->
            Toast.makeText(this, "Clicked: ${item.name}", Toast.LENGTH_SHORT).show()
        }
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = adapter

        binding.btnStart.setOnClickListener {
            Toast.makeText(this, "Start pressed", Toast.LENGTH_SHORT).show()
        }
        binding.btnStop.setOnClickListener {
            Toast.makeText(this, "Stop pressed", Toast.LENGTH_SHORT).show()
        }
        binding.btnSettings.setOnClickListener {
            Toast.makeText(this, "Settings pressed", Toast.LENGTH_SHORT).show()
        }

        // Build info
        val version = BuildConfig.VERSION_NAME
        val sha = BuildConfig.GIT_SHA
        val time = BuildConfig.BUILD_TIME_UTC
        binding.buildInfo.text = getString(R.string.build_info, version, sha.take(7), time)
        Toast.makeText(this, "v$version (${sha.take(7)} @ $time)", Toast.LENGTH_LONG).show()
    }
}
