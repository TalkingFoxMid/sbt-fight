ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-siblings"
  ).dependsOn(printerCE3, printerZIO, magicNumbersUtils)
  .aggregate(printerCE3, printerZIO, magicNumbersUtils)

lazy val printerCE3 = project.in(file("printer-ce3"))
  .dependsOn(magicNumbersUtils).aggregate(magicNumbersUtils)

lazy val printerZIO = project.in(file("printer-zio"))

lazy val magicNumbersUtils = project.in(file("magic-numbers"))

enablePlugins(UniversalPlugin)