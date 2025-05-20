package com.example.assignment1.ass1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InfoRow(
    label: String,
    value: String,
    valueColor: Color = Color.White,
    labelColor: Color = Color.Gray,
    image: Painter? = null,
    icon: ImageVector,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (image != null) {
            Image(
                painter = image,
                contentDescription = "Credit Score",
                colorFilter = ColorFilter.tint(Color.White)
            )
            Spacer(modifier = Modifier.width(2.dp))
        }
        Text(
            text = label,
            color = labelColor,
            modifier = Modifier.weight(1f),
            fontSize = 13.sp
        )

        Text(
            text = value,
            color = valueColor,
            fontWeight = FontWeight.Medium,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.width(16.dp))
        Icon(icon, contentDescription = null, tint = Color.Gray)
    }
}