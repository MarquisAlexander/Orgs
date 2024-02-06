package com.example.orgs.extensions

import android.widget.ImageView
import coil.load
import com.example.orgs.R

fun ImageView.tentaCarregarImage(url: String? = null) {
    load(url) {
        fallback(com.example.orgs.R.drawable.erro)
        error(com.example.orgs.R.drawable.erro)
        placeholder(com.example.orgs.R.drawable.placeholder)
    }
}