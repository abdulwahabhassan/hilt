package com.decagon.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApp : Application() {
    /* All apps that use Hilt must contain an Application class that is annotated with @HiltAndroidApp
    This generates a hilt component that is attached to the application object's lifecycle.
    This generated hilt component provides dependencies to the application object and also other
    components can access the dependencies that it provides because it is the parent component of the app
     */

}