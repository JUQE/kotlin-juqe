package ca.juqe.juqe.data.source.token


class TokenLocalDataSource: TokenDataSource {
    companion object {
        private var INSTANCE: TokenLocalDataSource? = null

        @JvmStatic fun getInstance(): TokenLocalDataSource =
            INSTANCE ?: TokenLocalDataSource().apply{ INSTANCE }

        @JvmStatic fun destroyInstance() {
            INSTANCE = null
        }
    }
}