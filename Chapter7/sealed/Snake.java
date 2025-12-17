/**
 * Example: Location of the subclass inside the sealed class
 * permits clause is optional here
 */

public sealed class Snake {

    final class Cobra extends Snake {}
}