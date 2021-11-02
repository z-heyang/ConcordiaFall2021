package ca.concordia.cejv416.fall2021.Class_13.Entities;

public interface IAttendance {

    void signIn();
    void signOut();
    boolean isSignedIn();


//    IEnumerable
//     next()
//     previous()
//     reset()
//
//    IComparable
//     compareTo(object a, object b)
//
//    ISerializable
//     serialize()
//     deserialize()


    // DO's
    // Must be public
    // It CAN contain constant values.
    // Name it with "I + PascalCase function".
    // Basically contains signatures of methods.
    //
    // Don'ts
    // Cannot contain code (implementation of the method).

}
