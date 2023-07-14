lazy val printerCE3 = (project in file("."))
  .settings(
    name := "printerCE3",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.1"
  )