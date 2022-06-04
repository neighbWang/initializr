object deps {

        object android {
            const val version = "4.0.0"
            const val library = "com.android.library"
            const val application = "com.android.application"
        }

        object kotlin {
        }

        object booster {
            const val version = "4.9.0"
            const val id = "com.didiglobal.booster"
            override fun toString() = "${id}:booster-gradle-plugin:${version}"
        }

        object codegen {
            const val version = "1.0.0"
        }

}
