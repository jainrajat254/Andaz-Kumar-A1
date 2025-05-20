package com.example.assignment1.ass1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable

@Composable
fun Section(content: @Composable ColumnScope.() -> Unit) {
    Column { content() }
}