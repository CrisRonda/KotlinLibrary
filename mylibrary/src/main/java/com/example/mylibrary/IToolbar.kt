package com.example.mylibrary

import android.widget.Toolbar


interface IToolbar {
    fun toolbarToLoad(toolbar: Toolbar?)
    fun enableHomeDisplay(value: Boolean)
}