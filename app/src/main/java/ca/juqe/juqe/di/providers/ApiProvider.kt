package ca.juqe.juqe.di.providers

import ca.juqe.juqe.api.JuqeApi
import retrofit2.Retrofit


class ApiProvider private constructor(retrofit: Retrofit) {

    val juqeApi: JuqeApi = retrofit.create(JuqeApi::class.java)

    companion object {
        private var INSTANCE: ApiProvider? = null

        @JvmStatic fun getInstance(retrofit: Retrofit): ApiProvider =
                INSTANCE ?: ApiProvider(retrofit).apply { INSTANCE = this }
    }
}