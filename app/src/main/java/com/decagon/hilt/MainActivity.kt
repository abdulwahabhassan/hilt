package com.decagon.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    /* @AndroidEntryPoint generates an individual Hilt component for each Android class in your project.
    These components can receive dependencies from their respective parent classes
     */

    /* Once Hilt is set up in your Application class and an application-level component is available,
    Hilt can provide dependencies to other Android classes that have the @AndroidEntryPoint annotation
    such as this activity
     */

    /* If you annotate an Android class with @AndroidEntryPoint,
    then you also must annotate Android classes that depend on it. For example,
    if you annotate a fragment, then you must also annotate any activities where you use that fragment.
     */

    /* To obtain dependencies from a component, use the @Inject annotation to perform field injection:
     */

    @Inject lateinit var car: Car


    /* Note: Fields injected by Hilt cannot be private.
    Attempting to inject a private field with Hilt results in a compilation error.
     */

    /* To perform field injection, Hilt needs to know how to provide instances of the necessary
    dependencies from the corresponding component. A binding contains the information necessary to
    provide instances of a type as a dependency.
     */

    /* One way to provide binding information to Hilt is constructor injection. Use the @Inject annotation
    on the constructor of a class to tell Hilt how to provide instances of that class:
     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}