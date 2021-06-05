package tool.mahmoudmabrok.videofreeads

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import reactivecircus.flowbinding.android.view.clicks
import tool.mahmoudmabrok.videofreeads.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlay.clicks()
            .onEach {
                startActivity(Intent(this, PlayVideoActivity::class.java).apply {
                    putExtra(Intent.EXTRA_TEXT, binding.edUrl.text.toString())
                })
            }
            .launchIn(lifecycleScope)


    }
}