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

/* Hilt doesn't generate a component for broadcast receivers because Hilt injects broadcast receivers
directly from SingletonComponent.
 */

/* Hilt automatically creates and destroys instances of generated component classes following the
lifecycle of the corresponding Android classes.
 */

/* By default, all bindings (@provides and @binds) in Hilt are unscoped. This means that each time your app requests the binding,
Hilt creates a new instance of the needed type. */

/* However, Hilt also allows a binding to be scoped to a particular component. Hilt only creates a
scoped binding once per instance of the component that the binding is scoped to, and all requests for
that binding share the same instance.
 */

/* Note: Scoping a binding to a component can be costly because the provided object stays in memory
until that component is destroyed. Minimize the use of scoped bindings in your application.
 */

/* A binding's scope must match the scope of the component where it is installed. */