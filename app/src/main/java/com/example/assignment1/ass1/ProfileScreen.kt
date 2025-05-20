package com.example.assignment1.ass1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(innerPadding: PaddingValues) {
    val backgroundColor = Color(0xFF121212)
    val cardColor = Color(0xFF1E1E1E)
    val textColor = Color.White
    val grayColor = Color(0xFFAAAAAA)
    val dividerColor = Color(0xFF2E2E2E)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(onClick = { /* Handle back */ }) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Back",
                                    tint = Color.White
                                )
                            }
                            Text(
                                text = "Profile",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(onClick = { /* Handle support click */ }) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_message_24),
                                    contentDescription = "Support",
                                    modifier = Modifier.size(24.dp),
                                    colorFilter = ColorFilter.tint(Color.White)
                                )
                            }
                            Text(
                                text = "Support",
                                color = Color.White,
                                fontSize = 16.sp
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColor,
                    titleContentColor = Color.White
                )
            )
        },
        containerColor = backgroundColor
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.Gray),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_person_24),
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(30.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        "Andaz Kumar",
                        color = textColor,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text("member since Dec, 2020", color = grayColor, fontSize = 14.sp)
                }

                Spacer(modifier = Modifier.weight(1f))

                Icon(Icons.Default.Edit, contentDescription = "Edit", tint = Color.Gray)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = cardColor),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_car_rental_24),
                        contentDescription = "Car",
                        colorFilter = ColorFilter.tint(Color.Gray)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            "get to know your vehicles, inside out",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                        Text("CRED garage →", color = grayColor, fontSize = 12.sp)
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text("CRED INSIGHTS", color = grayColor, fontWeight = FontWeight.SemiBold)

            Section {
                MixedColorInfoRow(
                    labelPrefix = "credit score •",
                    labelSuffix = "REFRESH AVAILABLE",
                    value = "757",
                    image = painterResource(id = R.drawable.baseline_credit_score_24)
                )
                HorizontalDivider(color = dividerColor, thickness = 0.5.dp)
                InfoRow(
                    "lifetime cashback",
                    "₹3",
                    image = painterResource(id = R.drawable.baseline_attach_money_24),
                    icon = Icons.AutoMirrored.Filled.ArrowForward
                )
                HorizontalDivider(color = dividerColor, thickness = 0.5.dp)
                InfoRow(
                    "bank balance",
                    "check",
                    image = painterResource(id = R.drawable.baseline_fast_forward_24),
                    icon = Icons.AutoMirrored.Filled.ArrowForward
                )
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text("YOUR REWARDS & BENEFITS", color = grayColor, fontWeight = FontWeight.SemiBold)

            Section {
                InfoRow(
                    "cashback balance",
                    "₹0",
                    icon = Icons.AutoMirrored.Filled.KeyboardArrowRight
                )
                HorizontalDivider(color = dividerColor, thickness = 0.5.dp)
                InfoRow("coins", "26,46,583", icon = Icons.AutoMirrored.Filled.KeyboardArrowRight)
                HorizontalDivider(color = dividerColor, thickness = 0.5.dp)
                InfoRow(
                    "win upto Rs 1000",
                    "refer and earn",
                    icon = Icons.AutoMirrored.Filled.KeyboardArrowRight
                )
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text("TRANSACTIONS & SUPPORT", color = grayColor, fontWeight = FontWeight.SemiBold)

            Section {
                InfoRow("all transactions", "", icon = Icons.AutoMirrored.Filled.KeyboardArrowRight)
            }
        }
    }
}