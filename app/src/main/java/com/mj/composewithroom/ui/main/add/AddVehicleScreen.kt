package com.mj.composewithroom.ui.main.add

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mj.composewithroom.ui.theme.CustomOutlinedTextField
import com.mj.composewithroom.ui.theme.DropDownTextField
import com.mj.composewithroom.ui.theme.LightBlue
import com.mj.composewithroom.ui.theme.LightGray


@Composable
fun AddVehicleScreen(navController: NavController) {

    val viewModel : AddVehicleViewModel = hiltViewModel()

    Column(Modifier.fillMaxSize()
        .padding(horizontal = 16.dp)) {

        Row(Modifier.fillMaxWidth().height(56.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(Icons.Default.ArrowBack, contentDescription = "", modifier = Modifier
                .padding(12.dp).size(24.dp)
                .clip(CircleShape)
                .clickable{
                    navController.popBackStack()
                })
            Text(text = "Add Vehicle", style = MaterialTheme.typography.titleMedium)
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "VEHICLE DETAILS",
            style = MaterialTheme.typography.labelMedium.copy(
                color = LightGray,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
            ))
        Spacer(modifier = Modifier.height(20.dp))
        DropDownTextField(
            viewModel.brand,
            "Brand",
            "Select a brand") {

        }
        Spacer(modifier = Modifier.height(20.dp))
        DropDownTextField(
            viewModel.model,
            "Model",
            "Select a Model") {

        }

        Spacer(modifier = Modifier.height(20.dp))
        DropDownTextField(
            viewModel.fuelType,
            "Fuel Type",
            "Select Fuel Type") {

        }

        Spacer(modifier = Modifier.height(20.dp))
        CustomOutlinedTextField(
            viewModel.vehicleNumber,
            onValueChange = {
                viewModel.vehicleNumber = it
            },
            "Vehicle Number",
            "Enter vehicle number (e.g.. MH 12 AB 1234")

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "OTHER DETAILS",
            style = MaterialTheme.typography.labelMedium.copy(
                color = LightGray,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
            ))
        Spacer(modifier = Modifier.height(20.dp))
        CustomOutlinedTextField(
            viewModel.year,
            onValueChange = {
                viewModel.year = it
            },
            "Year of Purchase",
            "Enter year of purchase")
        Spacer(modifier = Modifier.height(20.dp))
        CustomOutlinedTextField(
            viewModel.ownerName,
            onValueChange = {
                viewModel.ownerName = it
            },
            "Owner Name",
            "Enter owner's full name")
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { /* Add vehicle logic */ },
            modifier = Modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = LightBlue,  // Blue background
                contentColor = Color.White            // White text
            )
        ) {
            Text("Add Vehicle", style = MaterialTheme.typography.titleMedium)
        }

    }
}


