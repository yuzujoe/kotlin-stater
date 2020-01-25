package `class`

class SecondCustomer(val name: String) {
//  constructor defined in other than the class header is called the secondary constructor
    constructor(firstName: String, lastName: String)
//       can be called for constructors in the same class
         : this("$firstName $lastName")
}