package scala.misc
object EnumDemo extends App {
  trait Enum[A] {
    trait Value {
      self: A =>
    }
    val values: List[A]
  }
  sealed trait Currency extends Currency.Value
  object Currency extends Enum[Currency] {
    case object EUR extends Currency
    case object GBP extends Currency
    val values = List(EUR, GBP)
  }
  Currency.values.foreach(println)
}
