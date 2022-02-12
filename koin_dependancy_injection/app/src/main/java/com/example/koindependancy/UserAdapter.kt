package com.example.koindependancy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.user_list.view.*

class UserAdapter(var userList: List<GithubUser>) :
    RecyclerView.Adapter<UserAdapter.PhotosViewHolder>() {

    inner class PhotosViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.user_list, parent, false)
        return PhotosViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        var currentUser = userList[position]

        holder.itemView.apply {
            Glide.with(context).load(currentUser.avatar_url)
                .placeholder(R.drawable.ic_launcher_background)
                .into(user_avatar_image)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}