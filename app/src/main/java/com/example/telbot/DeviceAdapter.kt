package com.example.telbot

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telbot.databinding.ItemDeviceBinding

class DeviceAdapter(
    private val items: MutableList<DeviceItem>,
    private val onClick: (DeviceItem) -> Unit
) : RecyclerView.Adapter<DeviceAdapter.VH>() {

    inner class VH(val binding: ItemDeviceBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DeviceItem) {
            binding.tvName.text = item.name
            binding.tvId.text = "ID: ${item.id}"
            binding.tvStatus.text = "Status: ${item.status}"
            binding.root.setOnClickListener { onClick(item) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = ItemDeviceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}
