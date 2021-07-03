package com.decagon.hilt

import javax.inject.Inject

class RepairServiceImpl @Inject constructor(): RepairService {

    /* We assume that this class is from a third party library, we do not own it.
    We appended @Inject to make things work as normal. Normally, if we owned the class,
    we would append the @Inject annotation to the constructor. This is because hilt needs to
    know how to provide instances of RepairServiceImpl too!
     */
    override fun fixCar(): String {
       return "car fixed. Done!"
    }
}