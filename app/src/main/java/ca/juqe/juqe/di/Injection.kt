package ca.juqe.juqe.di

import android.content.Context
import ca.juqe.juqe.di.providers.GsonProvider
import com.google.gson.Gson


object Injection {
    //TODO
    val PREF_FILE_NAME = "replace.with.pref.key"

    fun providGson(): Gson = GsonProvider.provideGson()

}