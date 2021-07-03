package com.decagon.hilt

interface Functionalities {

    fun drive ()
    /* Since interfaces cannot be constructor-injected, we must provide hilt with a binding information
    that tells it how to provide this interface to a class that depends on it (in this case, our Car class).
    To do this, we create an abstract function inside a hilt module and annotate the abstract function
    with @Binds
    The @Binds annotation tells Hilt which implementation to use when it needs to provide an instance of an interface.
     */

    /* The annotated bind function provides the following information to Hilt:
    *  - The function return type tells Hilt what interface the function provides instances of.
    *  - The function parameter tells Hilt which implementation to provide.*/
}