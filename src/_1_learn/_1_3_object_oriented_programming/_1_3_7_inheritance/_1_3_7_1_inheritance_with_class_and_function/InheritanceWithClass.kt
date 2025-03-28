package _1_learn._1_3_object_oriented_programming._1_3_7_inheritance._1_3_7_1_inheritance_with_class_and_function

/* ■ Access Modifiers
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Public Access Modifier                                 | Private Access Modifier                                    | Protected Access Modifier                                                                       | Package Private Access Modifier                                                                       |
|--------------------------------------------------------|------------------------------------------------------------|-------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| Applicable for both top-level classes and interfaces.  | Not applicable for both top-level classes and interfaces.  | Not applicable for both top-level classes and interfaces.                                       | Applicable for both top-level classes and interfaces.                                                 |
| Accessible from the child class of the same package.   | Not accessible from the child class of the same package.   | Accessible anywhere from the same package and by child classes outside the package.             | Accessible from the child class of the same package.                                                  |
| Accessible from non-child classes of the same package. | Not accessible from non-child classes of the same package. | Accessible from non-child classes of the same package.                                          | Accessible from non-child class of the same package.                                                  |
| Accessible from the child class of outside package.    | Not accessible from the child class of outside package.    | Accessible from the child class of the outside package using child reference only.              | Not accessible from the child class of outside package.                                               |
| Accessible from non-child class of outside package.    | Not accessible from non-child class of outside package.    | Not accessible from non-child class of outside package.                                         | Not accessible from non-child class of outside package.                                               |
| Most accessible modifier among all modifiers.          | Most restricted modifier among all modifiers.              | More accessible than the package and private modifier but less accessible than public modifier. | More restricted than the public and protected modifier but less restricted than the private modifier. |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

open class InheritanceWithClass : Apple() {
    protected class ProtectClass

    /* (Internal/Private) classes shouldn't be inherited by other classes! */
    internal class FinalClass

    private class PrivateClass

    inner class PublicClass

    override fun displayOrigin(origin: String) {
        super.displayOrigin(origin)
        print(" 🎌")
    }
}

fun main() {
    val Fuji = Apple()
    Fuji.name = "Fuji"
    Fuji.color = "Red"
    Fuji.displayName()
    Fuji.displayColor() // Dynamic Method Dispatch

    val inheritanceWithClassExample = InheritanceWithClass()
    inheritanceWithClassExample.displayOrigin("Japan")
}