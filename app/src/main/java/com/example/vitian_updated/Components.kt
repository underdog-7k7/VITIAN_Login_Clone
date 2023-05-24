package com.example.vitian_updated

import android.annotation.SuppressLint
import android.graphics.Color.rgb
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vitian_updated.ui.theme.VITIAN_UpdatedTheme
import com.example.vitian_updated.ui.theme.mainblue
import com.example.vitian_updated.ui.theme.secondblue
import com.example.vitian_updated.ui.theme.thirdblue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import com.example.vitian_updated.ui.theme.mywhite
import java.time.format.TextStyle
import androidx.compose.foundation.layout.Arrangement.Horizontal
/*import androidx.compose.foundation.layout.Arrangement.placeCenter*/
import androidx.compose.material3.Button
import androidx.compose.material3.Text


/*import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.RowScopeInstance.weight*/
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldWithIcons(modifier: Modifier = Modifier
    .fillMaxWidth()
                       ,content:String,onTextChanged: (String) -> Unit) {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier= Modifier
            .padding(
                40.dp, 10.dp
            ) //this will anyway be default when we dont call it with a modifier
            /*.width(350.dp)*/
            .fillMaxWidth()
        ,
        value = text,
        onValueChange = {
            text = it
            onTextChanged(it)
        },
        placeholder = {
            Text(
                text = "$content",
                textAlign = TextAlign.Center
            )
        },
        leadingIcon = { Icon(Icons.Default.Person, contentDescription = "PERSON") },
        shape= RoundedCornerShape(30.dp),



        )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordInput(modifier: Modifier = Modifier
    .fillMaxWidth()
                  ,content:String,onTextChanged: (String) -> Unit) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier= Modifier
            .padding(
                40.dp, 30.dp
            ) //this will anyway be default when we dont call it with a modifier
            /*.width(350.dp)*/
            .fillMaxWidth()
        ,
        value = text,
        onValueChange = {
            text = it
            onTextChanged(it)
        },
        placeholder = {
            Text(
                text = "$content",
                textAlign = TextAlign.Center
            )
        },
        leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "PERSON") },
        shape= RoundedCornerShape(30.dp),
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
    )
}


@SuppressLint("SuspiciousIndentation")
@Composable
fun SubmitButton(
    /*modifier: Modifier = Modifier
        .padding(40.dp, 30.dp)
        .fillMaxWidth(),*/
    isEnabled: Boolean,
    onButtonClick: () -> Unit
) {
    val myblue= Color(rgb(82, 109, 130))
    val mygrey= Color(rgb(221, 230, 237))

        Button(
            onClick = onButtonClick,
            enabled = isEnabled,
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp, 30.dp),
            colors = ButtonDefaults.buttonColors(myblue)

        ) {
            Text("Submit")
        }

}
@Composable
fun Submitfieldcheck() {
    var registration_no by remember { mutableStateOf("") }
    var password_ by remember { mutableStateOf("") }

   Box(){
       Column(modifier = Modifier
           .padding(16.dp)
           ) {
           TextFieldWithIcons(content = "Registration Number", onTextChanged = {registration_no=it})
           PasswordInput(content = "Password", onTextChanged = {password_=it})
           SubmitButton(
               isEnabled = (registration_no.isNotEmpty()&&password_.isNotEmpty()),
               onButtonClick ={ /* Button click logic */ },
           )

       }
   }

}