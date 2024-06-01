// expressions vs statements
// expression has return value while statement doesn't
// in scala we dont have void keyword so everything need to have a return type and statement has return type Unit

1 + 2 // expression return type int

print("hello") // statement with return type Unit

// Unit
// Unit return type implies that method doesn't have anything to return
// i.e. method mostly be doing IO operation or setting up or updating variable
// Unit is sometimes referred as empty tuple ()
// Unit is descended from AnyVal like other primitives