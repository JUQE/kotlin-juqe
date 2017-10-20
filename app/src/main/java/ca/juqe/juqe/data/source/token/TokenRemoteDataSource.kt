package ca.juqe.juqe.data.source.token


class TokenRemoteDataSource: TokenDataSource {
    companion object {
        private var INSTANCE: TokenRemoteDataSource? = null

        @JvmStatic fun getInstance(): TokenRemoteDataSource =
                INSTANCE ?: TokenRemoteDataSource().apply{ INSTANCE }

        @JvmStatic fun destroyInstance() {
            INSTANCE = null
        }
    }
}