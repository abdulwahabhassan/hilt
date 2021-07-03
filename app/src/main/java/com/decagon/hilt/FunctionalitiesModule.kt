package com.decagon.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class FunctionalitiesModule {

    /* The module is abstract. Since we want hilt to inject the dependencies that we provide here to
    our MainActivity, we have specified that the module will be installed and used in all of our activity
    components using the annotation "@InstallIn(ActivityComponent::class)". Hence, the dependencies
    will be available to all generated components that are associated with our activity class.
     */

    @Binds
    abstract fun bindFunctionalities (
        carImpl : Car
    ) : Functionalities

    /* bindsFunctionalities is abstract. This abstract function literally tells hilt how to construct and
    provide an instance of Functionalities to our car class. The function parameter tells Hilt which
    implementation to provide. In this case, Car as an implementation of Functionalities.
     */

    /* The function return type tells Hilt what interface the function provides instances of. In this
    * case Functionalities */

    /* In a second case where we do not own a class we want to inject such as classes coming from
    an external library, take a look at 'RepairServiceModule'
     */


}