package com.example.vitian_updated

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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier
                .fillMaxSize()
                .background(color = mainblue)
                .verticalScroll(scrollState)) {
                Image(painter = painterResource(id = R.drawable.logo) , contentDescription = "mylogo", modifier = Modifier
                    .padding(40.dp)
                    .fillMaxWidth()
                    .size(350.dp))
                Spacer(modifier = Modifier.height(40.dp))
                Column( modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 0.dp, bottomEnd = 0.dp))
                    .background(color = mywhite)
                    .fillMaxSize(), verticalArrangement = Arrangement.Top,
                    ) {
                            Submitfieldcheck()
                }

            }

        }
    }
}









