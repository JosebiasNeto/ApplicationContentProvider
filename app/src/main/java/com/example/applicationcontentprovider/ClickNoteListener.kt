package com.example.applicationcontentprovider

import android.database.Cursor

interface ClickNoteListener {
    fun clickNoteItem(cursor: Cursor)
    fun removeNoteItem(cursor: Cursor?)
}