package com.kidssaveocean.fatechanger.policy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kidssaveocean.fatechanger.R
import com.kidssaveocean.fatechanger.firebase.model.HijackPolicyLocationModel
import kotlinx.android.synthetic.main.item_location.view.*

class LocationsAdapter: RecyclerView.Adapter<LocationsAdapter.LocationsViewHolder>() {
    private var policyLocations: List<Pair<String, HijackPolicyLocationModel>>? = null
    lateinit var onItemCLickedListener: OnItemCLickedListener

    fun setpolicyLocations(data: List<Pair<String, HijackPolicyLocationModel>>?){
        policyLocations = data
        notifyDataSetChanged()
    }

    interface OnItemCLickedListener{
        fun onItemClicked(view: View, position: Int)
    }

    fun setOnItemClickedListener(listner: OnItemCLickedListener){
        onItemCLickedListener = listner
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_location, parent, false)
        return LocationsViewHolder(view)
    }

    override fun getItemCount(): Int = policyLocations?.size ?: 0

    override fun onBindViewHolder(holder: LocationsViewHolder, position: Int) {
        holder.itemView.tvLocation.text = policyLocations?.get(position)?.second?.location ?: ""
        holder.itemView.setOnClickListener{
            onItemCLickedListener.onItemClicked(it, position)
        }
    }

    class LocationsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){}
}