package ru.AliceBeyllic.scalalearn

object Nasledovanie {
  trait Animal {
    val sound: String
    def voice: Unit = println("voice: " + sound)
  }

  class Cat () extends Animal {

    override val sound = "Meow!"

  }
  class Dog () extends Animal {

    override val sound = "Woof!"

  }
  class Fish () extends Animal {

    override val sound = "Fishes are silent!"
    override def voice = println(sound)
  }
  object Main extends App {
    val animals = Seq(new Cat, new Dog, new Fish)
    animals.foreach(_.voice)
  }
}
