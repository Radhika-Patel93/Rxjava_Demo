package com.demo.rxjava_demo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.demo.rxjava_demo.R
import com.demo.rxjava_demo.server.response.User
import com.demo.rxjava_demo.util.loadImage
import kotlinx.android.synthetic.main.row_list.view.*


class ListAdapter(var users: ArrayList<User>) :
    RecyclerView.Adapter<ListAdapter.UserViewHolder>() {

    fun updateUsers(newUsers: List<User>) {
        users.clear()
        users.addAll(newUsers)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = UserViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_list, parent, false)
    )

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imageView = view.imageView
        private val userName = view.name
        private val userEmail = view.email

        fun bind(country: User) {
            userName.text = country.firstName + " " + country.lastName
            userEmail.text = country.email
            imageView.loadImage(country.avatar)
        }
    }

}