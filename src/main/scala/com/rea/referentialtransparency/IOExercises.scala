package com.rea.referentialtransparency

import cats.effect.IO

import scala.io.StdIn

object IOExercises {

  def readLineFromConsole(): IO[String] = IO {
    StdIn.readLine()
  }

  def writeToConsole(s: String): IO[Unit] = IO {
    println(s)
  }

  def readFromConsoleAndWriteToConsole: IO[Unit] = readLineFromConsole flatMap writeToConsole

  def run(effect: IO[Unit]): Unit = effect.unsafeRunSync()

}
