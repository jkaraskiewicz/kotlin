fun <T, R> downcastOfNonReifiedToNonReified(x: T?, y: T, z: R) {
    if(x is <!CANNOT_CHECK_FOR_ERASED!>T<!>) {}
    run { <!UNCHECKED_CAST!>x as T<!> }

    if (x is <!CANNOT_CHECK_FOR_ERASED!>T?<!>) {}
    run { x <!USELESS_CAST!>as T?<!> }

    if (y is <!CANNOT_CHECK_FOR_ERASED!>T<!>) {}
    run { y <!USELESS_CAST!>as T<!> }

    if (y is <!CANNOT_CHECK_FOR_ERASED!>T<!USELESS_NULLABLE_CHECK!>?<!><!>) {}
    run { y <!USELESS_CAST!>as T?<!> }

    if (z is <!CANNOT_CHECK_FOR_ERASED!>T<!>) {}
    run { <!UNCHECKED_CAST!>z as T<!> }

    if (z is <!CANNOT_CHECK_FOR_ERASED!>T<!USELESS_NULLABLE_CHECK!>?<!><!>) {}
    run { <!UNCHECKED_CAST!>z as T?<!> }
}

inline fun <reified T, R> downcastOfReifiedToNonReified(x: T?, y: T, <!UNUSED_PARAMETER!>z<!>: R) {
    if (x is <!CANNOT_CHECK_FOR_ERASED!>R<!>) {}
    run { <!UNCHECKED_CAST!>x as R<!> }

    if (x is <!CANNOT_CHECK_FOR_ERASED!>R?<!>) {}
    run { <!UNCHECKED_CAST!>x as R?<!> }

    if (y is <!CANNOT_CHECK_FOR_ERASED!>R<!>) {}
    run { <!UNCHECKED_CAST!>y as R<!> }

    if (y is <!CANNOT_CHECK_FOR_ERASED!>R<!USELESS_NULLABLE_CHECK!>?<!><!>) {}
    run { <!UNCHECKED_CAST!>y as R?<!> }
}

inline fun <reified T, R> downcastOfNonReifiedToReified(z: R) {
    if (z is T) {}
    run { z as T }
}

