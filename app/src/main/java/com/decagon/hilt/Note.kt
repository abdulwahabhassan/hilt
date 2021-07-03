package com.decagon.hilt

/* In cases where you need Hilt to provide different implementations of the same type as dependencies,
you must provide Hilt with multiple bindings. You can define multiple bindings for the same type
with qualifiers.
 */

/* A qualifier is an annotation that you use to identify a specific binding for a type when that type
has multiple bindings defined.
 */

/* Hilt provides some predefined qualifiers. For example, as you might need the Context class from
either the application or the activity, Hilt provides the @ApplicationContext and @ActivityContext
qualifiers.
 */