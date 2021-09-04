@file:Suppress("SpellCheckingInspection")

package com.example.lolapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class ChampActivity : AppCompatActivity() {
    // map of roles to respective champions for random selection based on role
    private val roles = mapOf("top" to listOf("Aatrox","Akali","Akshan","Camille","Cassiopeia","Cho'Gath","Darius","Dr. Mundo","Fiora","Gangplank","Garen","Gnar","Gragas","Gwen","Heimerdinger","Illaoi","Irelia","Jax","Jayce","Kayle","Kennen","Kled","Lillia","Malphite","Maokai","Mordekaiser","Nasus","Ornn","Pantheon","Poppy","Quinn","Renekton","Rengar","Riven","Rumble","Ryze","Sett","Shen","Singed","Sion","Sylas","Tahm Kench","Teemo","Trundle","Tryndamere","Urgot","Vayne","Vladimir","Volibear","Warwick","Wukong","Yasuo","Yone","Yorick","Zac"),
        "jungle" to listOf("Amumu","Diana","Ekko","Elise","Evelynn","Fiddlesticks","Gragas","Graves","Gwen","Hecarim","Ivern","Jarvan IV","Jax","Karthus","Kayn","Kha'Zix","Kindred","Lee Sin","Lillia","Master Yi","Nidalee","Nocturne","Nunu & Willump","Olaf","Poppy","Rammus","Rek'Sai","Rengar","Rumble","Sejuani","Shaco","Shyvana","Skarner","Taliyah","Trundle","Udyr","Vi","Viego","Volibear","Warwick","Xin Zhao","Zac"),
        "mid" to listOf("Aatrox","Ahri","Akali","Akshan","Anivia","Annie","Aurelion Sol","Azir","Cassiopeia","Corki","Diana","Ekko","Fizz",
            "Galio","Garen","Graves","Heimerdinger","Irelia","Jayce","Kassadin",
            "Katarina","Kennen","LeBlanc","Lissandra","Lux","Malphite","Malzahar","Neeko","Orianna","Pantheon","Qiyana","Renekton","Riven","Rumble","Ryze","Sett","Sylas","Syndra","Talon","Tryndamere","Twisted Fate","Veigar","Viego","Viktor","Vladimir","Xerath","Yasuo","Yone","Zed","Ziggs","Zoe"),
        "adc" to listOf("Aphelios","Ashe","Caitlyn","Cassiopeia","Draven","Ezreal","Jhin",
            "Jinx","Kai'Sa","Kalista","Kog'Maw","Lucian","Miss Fortune","Samira","Senna","Sivir","Swain","Syndra","Tristana","Twitch","Varus","Vayne","Xayah","Yasuo","Ziggs"),
        "support" to listOf("Alistar","Amumu","Bard","Blitzcrank","Brand","Braum","Fiddlesticks","Galio","Gragas","Janna","Karma","Leona","Lulu","Lux","Maokai","Morgana","Nami","Nautilus","Pantheon","Poppy","Pyke","Rakan","Rell","Senna","Seraphine","Sett","Shaco","Shen","Sona","Soraka","Swain","Tahm Kench","Taric","Thresh","Trundle","Veigar","Vel'Koz","Xerath","Yuumi","Zac","Zilean","Zyra"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // get role passed from intent
        val role = intent.getStringExtra("role")
        // set content view after role for orientation check
        setContentView(R.layout.champ)

        // refresh button
        val refresh = findViewById<ImageButton>(R.id.refreshBtn)
        // var init for champ image and text display
        val image = findViewById<ImageView>(R.id.champImage)
        val champtxt = findViewById<TextView>(R.id.champText)
        // var init for image resourceID to display image
        var resourceId: Int
        // var init for champ name and filename for image resource
        var champ: String?
        var champRes: String?


        // sets the champ based on role passed as extra from MainActivity
        // created as a function in order to allow for refresh button
        fun setChamp(roleName: String?) {
            when(roleName){
                // if role is top, pick toplaner, set img and txt
                "top"->{
                    champ = (roles["top"])?.random()
                    champRes = champ?.replace(' ', '_')?.replace('&','_')?.replace('.','_')?.replace("'", "_")
                    champRes = champRes?.lowercase()
                    resourceId = resources.getIdentifier("drawable/$champRes", "drawable,", packageName)
                    image.setImageResource(resourceId)
                    champtxt.text = resources.getString(R.string.topSelect, champ)
                }
                // if role is jungle, pick jungler, set img and txt
                "jgl"->{
                    champ = (roles["jungle"])?.random()
                    champRes = champ?.replace(' ', '_')?.replace('&','_')?.replace('.','_')?.replace("'", "_")
                    champRes = champRes?.lowercase()
                    resourceId = resources.getIdentifier("drawable/$champRes", "drawable,", packageName)
                    image.setImageResource(resourceId)
                    champtxt.text = resources.getString(R.string.jglSelect, champ)
                }
                // if role is mid, pick midlaner, set img and txt
                "mid"->{
                    champ = (roles["mid"])?.random()
                    champRes = champ?.replace(' ', '_')?.replace('&','_')?.replace('.','_')?.replace("'", "_")
                    champRes = champRes?.lowercase()
                    resourceId = resources.getIdentifier("drawable/$champRes", "drawable,", packageName)
                    image.setImageResource(resourceId)
                    champtxt.text = resources.getString(R.string.midSelect, champ)
                }
                // if role is adc, pick adc, set img and txt
                "adc"->{
                    champ = (roles["adc"])?.random()
                    champRes = champ?.replace(' ', '_')?.replace('&','_')?.replace('.','_')?.replace("'", "_")
                    champRes = champRes?.lowercase()
                    resourceId = resources.getIdentifier("drawable/$champRes", "drawable,", packageName)
                    image.setImageResource(resourceId)
                    champtxt.text = resources.getString(R.string.adcSelect, champ)
                }
                // if role is supp, pick support, set img and txt
                "supp"->{
                    champ = (roles["support"])?.random()
                    champRes = champ?.replace(' ', '_')?.replace('&','_')?.replace('.','_')?.replace("'", "_")
                    champRes = champRes?.lowercase()
                    resourceId = resources.getIdentifier("drawable/$champRes", "drawable,", packageName)
                    image.setImageResource(resourceId)
                    champtxt.text = resources.getString(R.string.suppSelect, champ)
                }
            }
        }

        setChamp(role)
        refresh.setOnClickListener {setChamp(role)}
    }
}