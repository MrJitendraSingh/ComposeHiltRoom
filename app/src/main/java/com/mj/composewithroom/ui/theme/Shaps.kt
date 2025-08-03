package com.mj.composewithroom.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview



@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange:(String) -> Unit,
    label: String,
    placeholder: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = {onValueChange(it)},
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        textStyle = TextStyle(color = Color.Black),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f),
            focusedBorderColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
        ),
        label = { Text(label, style = MaterialTheme.typography.labelLarge, color = Color.Gray) },
        singleLine = true,
        placeholder = { Text(placeholder, style = MaterialTheme.typography.bodyLarge, color = LightGray) }
    )

}


@Composable
fun DropDownTextField(
    value: String,
    label: String,
    placeholder: String,
    onClick: () -> Unit
){
    OutlinedTextField(
        value = value,
        onValueChange = {},
        modifier = Modifier.fillMaxWidth().clickable{ onClick() },
        shape = RoundedCornerShape(16.dp),
        textStyle = TextStyle(color = Color.Black),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
            focusedBorderColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
        ),
        label = { Text(label, style = MaterialTheme.typography.labelLarge, color = Color.Gray) },
        singleLine = true,
        readOnly = true,
        enabled = false,
        trailingIcon = {
            Icon(Icons.Default.ArrowDropDown, contentDescription = "DropDown")
        },
        placeholder = { Text(placeholder, style = MaterialTheme.typography.bodyLarge, color = LightGray) }
    )
}