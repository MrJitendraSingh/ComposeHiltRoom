package com.mj.composewithroom.ui.main.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import com.mj.composewithroom.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.mj.composewithroom.data.model.Vehicle
import com.mj.composewithroom.ui.main.navigation.MainScreenRoute
import com.mj.composewithroom.ui.theme.DarkNavy
import com.mj.composewithroom.ui.theme.LightBlue
import com.mj.composewithroom.utility.squareBorder


@Composable
fun HomeScreen(navController: NavHostController) {

    val viewModel: HomeViewModel = hiltViewModel()

    val gradientBrush = Brush.linearGradient(
        colors = listOf(Color(0xFF081B44), Color(0xFF030C27)),
        start = Offset(0f, 0f),
        end = Offset.Infinite
    )
    Column(Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth().height(260.dp)
            .background(brush = gradientBrush)
            .padding(16.dp)) {
            Row(Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                Image(painter = painterResource(R.drawable.avatar),
                    contentDescription = "Circular Image",
                    contentScale = ContentScale.Crop, // Center crop
                    modifier = Modifier
                        .size(52.dp)
                        .clip(CircleShape))
                Column {
                    Text("Hi, Amin \uD83D\uDC4B", style = MaterialTheme.typography.titleLarge, color = White)
                    Text("Welcome back!", style = MaterialTheme.typography.bodyMedium, color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.height(38.dp))
            Row (Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(14.dp)){
                ShowDataCard("\uD83D\uDE98",
                    "00",
                    "Total Vehicles",
                    Color(0xFFFDF0DC),
                    modifier = Modifier.weight(1f))

                ShowDataCard("⚡",
                    "00",
                    "Total EV",
                    Color(0xFFE9F4EC),
                    modifier = Modifier.weight(1f))
            }
        }

        Column(Modifier.fillMaxWidth()
            .weight(1f)
            .padding(horizontal = 12.dp)){

            Text("Vehicle Inventory List", style = MaterialTheme.typography.titleSmall, color = Color.Black,
                modifier = Modifier.padding(vertical = 24.dp))

            Row(modifier = Modifier.height(38.dp)
                .border(1.dp, color = Color.LightGray, shape = RoundedCornerShape(12.dp))
                .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)) {

                Icon(Icons.Default.Info, contentDescription = "")
                Text(
                    text = "Filter",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Table Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color(0xFFF1F5F9), RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .border(BorderStroke(1.dp, Color.LightGray), shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                listOf("Model & Brand", "Vehicle Number", "Fuel Type", "Year of Purchase").forEachIndexed { index, item ->
                    Text(
                        text = item,
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(if (index == 0 || index == 2) 1f else 1.4f)
                            .padding(12.dp)
                    )
                    if (index != 3) Spacer(modifier = Modifier.height(56.dp).width(1.dp).background(Color.LightGray))

                }
            }

            Box(Modifier.weight(1f)) {
                // Vehicle List
                LazyColumn {
                    items(viewModel.sampleVehicles) { vehicle ->

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.height(72.dp).width(1.dp).background(Color.LightGray))
                            Column(modifier = Modifier.weight(1f).padding(12.dp)) {
                                Text(vehicle.model, style = MaterialTheme.typography.labelMedium)
                                Text(vehicle.brand, style = MaterialTheme.typography.labelSmall)
                            }
                            Spacer(modifier = Modifier.height(72.dp).width(1.dp).background(Color.LightGray))

                            Text(
                                text = vehicle.fuelType,
                                color = LightBlue,
                                style = MaterialTheme.typography.titleSmall,
                                modifier =  Modifier.weight(1.4f).padding(8.dp)
                            )
                            Spacer(modifier = Modifier.height(72.dp).width(1.dp).background(Color.LightGray))

                            Text(
                                text = vehicle.vehicleNumber,
                                style = MaterialTheme.typography.labelMedium,
                                modifier = Modifier.weight(1f).padding(12.dp)
                            )
                            Spacer(modifier = Modifier.height(72.dp).width(1.dp).background(Color.LightGray))
                            Column (modifier = Modifier.weight(1.4f).padding(12.dp)){
                                Text(vehicle.year, style = MaterialTheme.typography.labelMedium)
                                Text(vehicle.ownerName, style = MaterialTheme.typography.labelSmall)
                            }
                            Spacer(modifier = Modifier.height(72.dp).width(1.dp).background(Color.LightGray))
                        }
                        Spacer(modifier = Modifier.height(1.dp).fillMaxWidth().background(Color.LightGray))

                    }

                }

                // Floating Action Button
                FloatingActionButton(
                    onClick = { navController.navigate(MainScreenRoute.AddVehicleScreen.route) },
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(vertical = 16.dp),
                    containerColor = LightBlue
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)
                    ) {
                        Icon(Icons.Default.Add, contentDescription = null, tint = Color.White)
                        Spacer(modifier = Modifier.width(10.dp))
                        Text("Add Vehicle", color = Color.White)
                    }
                }
            }

        }



    }
}



@Composable
fun ShowDataCard(
    icon: String,
    total: String,
    title: String,
    color: Color,
    modifier: Modifier = Modifier
){
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = color), // Light cream
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 14.dp)
                .height(100.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = icon,
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = total,
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 16.sp,
                ),
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.labelSmall.copy(
                    color = DarkNavy,
                    fontSize = 12.sp
                )
            )
        }
    }
}

@Composable
fun SystemBarColor(
    statusBar: Color = DarkNavy,
    navigationBar: Color = White,
    topIcon: Boolean = false,
    bottomIcon: Boolean = false){
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(
            color = statusBar,
            darkIcons = topIcon
        )
        systemUiController.setNavigationBarColor(
            color = navigationBar,
            darkIcons = bottomIcon
        )
    }
}