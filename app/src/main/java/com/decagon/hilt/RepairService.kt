package com.decagon.hilt

interface RepairService {
    /* We assume that this interface is from a third party Library and is impl in a class (RepairService)
     that we do not also own from the same third party library. Normal it should not be defined
    here like we have done as though it is ours. But you get the idea.
     */
    fun fixCar () : String
}