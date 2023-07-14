package ru.tfox.ce3p
import ru.tfox.magic._
import cats.effect.{IO, IOApp}

object Printer extends IOApp.Simple {
  override def run: IO[Unit] =
    IO {
      println("horny")
    }
}
