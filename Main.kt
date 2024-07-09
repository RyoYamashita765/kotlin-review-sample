import kotlinx.coroutines.runBlocking
import java.time.LocalDateTime
import kotlin.math.pow
import java.util.*
import kotlinx.coroutines.delay
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import java.io.File
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val currentTime = LocalDateTime.now()
        val randomNumber = Random.nextDouble().pow(2)

        runBlocking {
            delay(1000)
            textView.text = "Current time: $currentTime\nRandom number: $randomNumber"
        }

        val file = File("example.txt")
        file.writeText(UUID.randomUUID().toString())
    }
}
