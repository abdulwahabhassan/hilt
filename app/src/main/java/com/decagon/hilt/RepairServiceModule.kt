package com.decagon.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object RepairServiceModule {

    /* In a second case where we do not own a class we want to inject such as classes coming from
    an external library (e.g room database, retrofit e.t.c), we can tell hilt how to provide instances
    of such type of classes by similarly creating a function inside a hilt module but this time
    annotating with the annotation @Provides
     */

    /* As an example, let us define another interface called 'RepairService' that is implemented by
    by 'RepairServiceImpl
     */

    @Provides
    fun providesRepairService (
        //I could add potential dependencies of this type here if any is needed by the class
    ) : RepairService {

        return RepairServiceImpl()

        /* Below is a slightly realistic presentation of how we would do it if we were using an actual
        external library */
//        return Retrofit.Builder()
//            .baseUrl("https://example.com")
//            .build()
//            .create(RepairService::class.java)
    }

    /* The function parameters of the @Provides fun tell Hilt the dependencies of the corresponding type.
       The function return type tells Hilt what type the function provides instances of.
       The function body tells Hilt how to provide an instance of the corresponding type.
       Hilt executes the function body every time it needs to provide an instance of that type.
     */
}