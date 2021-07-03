package com.decagon.hilt

import javax.inject.Inject

class Car @Inject constructor(
    private val wheels : Wheel
) : Functionalities {
    var lights = 2

    /* The parameters of an annotated constructor of a class are the dependencies of that class.
    In this case, Wheel is a dependency of Car, hence Hilt must know to provide an instance of this
    dependency to car.
     */

    /* At build time, Hilt generates Dagger components for Android classes.  Then, Dagger walks
    through our code to build and validate dependency graph, generates the classes that it uses at runtime
    to create the actual objects and their dependencies.*/

    /* We use hilt modules to provide binding information to Hilt for types which cannot be constructor-injected
    such as interfaces and classes which we do not own that come from an external library. Hilt modules are
    annotated with @Module. This module informs hilt how to provide instances of certain types.
     */

    /* Unlike Dagger modules, you must annotate Hilt modules with @InstallIn to tell Hilt which Android
    class each module will be used or installed in. Dependencies that you provide in Hilt modules are
    available in all generated components that are associated with the Android class where you install the Hilt module.
     */

    override fun drive() {

    }

    /* Car implements the Functionalities interface hence override the drive method */

}
