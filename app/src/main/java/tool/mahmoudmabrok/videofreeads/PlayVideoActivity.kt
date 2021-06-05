package tool.mahmoudmabrok.videofreeads

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import tool.mahmoudmabrok.videofreeads.databinding.ActivityPlayVideoBinding

class PlayVideoActivity : AppCompatActivity() {

    private var url: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPlayVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        url = intent.extras?.getString(Intent.EXTRA_TEXT) ?: ""
        url = url.substring(url.lastIndexOf("/") + 1)
        Log.i("TestTest", "PlayVideoActivity onCreate $url")
        binding.youtubePlayer.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(url, 0F)
            }
        })

    }


}