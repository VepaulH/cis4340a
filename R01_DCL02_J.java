// Compliant code
// Rule 01. Declarations and Initialization (DCL) - DCL02-J

// ...
 
for (final Integer i: list) {
  Integer item = i;
  if (first) {
    first = false;
    item = new Integer(99);
  }
  System.out.println(" New item: " + item);
  // Process item
}

// ...