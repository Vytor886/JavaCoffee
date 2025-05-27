package com.MobileProjectJC.javacoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.MobileProjectJC.javacoffee.ui.theme.JavaCoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JavaCoffeeTheme {
                TelaPrincipalDoApp()
            }
        }
    }
}


@Composable
fun TelaPrincipalDoApp(){
    val navController = rememberNavControler

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> // 4. Configura o "mapa"(NavHost)
      NavHost(
          navController = navController,
          startDestination = "splash", // Tela inicial
          modifier = Modifier.padding(innerPadding) // Aplica o padding do Scaffold
        ){
          composable("splash"){              SplashScreen(navController = navController)
          }
          composable("cafe"){
              CafeScreen(navController = navController)
         }
          }
      }

}
    
