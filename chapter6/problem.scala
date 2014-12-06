// problem 6.2
abstract class UnitConversion(private val initRatio: Double) {
  def converse(base: Double) = {initRatio * base}
}

object InchesToCentimeters extends UnitConversion(2.54){
  def apply(base: Double) = InchesToCentimeters.converse(base)
}

object GallonsToLiters extends UnitConversion(4.546){
  def apply(base: Double) = GallonsToLiters.converse(base)
}

object MilesToKilometers extends UnitConversion(1.609344){
  def apply(base: Double) = MilesToKilometers.converse(base)
}

object Test {
  def main(args: Array[String])
  {
    println(InchesToCentimeters(2))
    println(MilesToKilometers(2))
    println(GallonsToLiters(2))
  }
}

// problem 6.3
object PrintArgsReversed extends App{
  for(i <- (0 until args.length).reverse)
    print(args(i) + "|")
  println("")
}
