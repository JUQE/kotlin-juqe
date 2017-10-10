package ca.juqe.juqe.auth

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ca.juqe.juqe.Constants
import ca.juqe.juqe.R
import com.spotify.sdk.android.authentication.AuthenticationRequest
import com.spotify.sdk.android.authentication.AuthenticationResponse
import com.spotify.sdk.android.authentication.LoginActivity.REQUEST_CODE
import com.spotify.sdk.android.authentication.AuthenticationClient
import ca.juqe.juqe.MainActivity
import com.spotify.sdk.android.authentication.LoginActivity.REQUEST_CODE
import android.content.Intent
import android.util.Log


class AuthActivity: AppCompatActivity() {
    val REQUEST_CODE = 1337

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)

        val builder: AuthenticationRequest.Builder = AuthenticationRequest.Builder(
                Constants.CLIENT_ID,
                AuthenticationResponse.Type.TOKEN,
                Constants.REDIRECT_URI
        )

        builder.setScopes(arrayOf("user-read-private", "streaming", "playlist-read-private"))
        val request = builder.build()

        AuthenticationClient.openLoginActivity(this, REQUEST_CODE, request)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent) {
        super.onActivityResult(requestCode, resultCode, intent)

        // Check if result comes from the correct activity
        if (requestCode == REQUEST_CODE) {
            val response = AuthenticationClient.getResponse(resultCode, intent)
            if (response.type == AuthenticationResponse.Type.TOKEN) {
//                val playerConfig = Config(this, response.accessToken, Constants.CLIENT_ID)
//                Spotify.getPlayer(playerConfig, this, object : SpotifyPlayer.InitializationObserver() {
//                    fun onInitialized(spotifyPlayer: SpotifyPlayer) {
//                        mPlayer = spotifyPlayer
//                        mPlayer.addConnectionStateCallback(this@MainActivity)
//                        mPlayer.addNotificationCallback(this@MainActivity)
//                    }

//                    fun onError(throwable: Throwable) {
//                        Log.e("MainActivity", "Could not initialize player: " + throwable.message)
//                    }
//                })
            }
        }
    }
}