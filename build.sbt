ThisBuild / scalaVersion := "2.13.10"
ThisBuild / organization := "ru.delimobil"

val cabbitVersion = "0.2.0-RC3"

name := "cabbit-example"

libraryDependencies ++=
  Seq(
    "ru.delimobil" %% "cabbit" % cabbitVersion,
    "ru.delimobil" %% "cabbit-circe" % cabbitVersion,
    "io.circe" %% "circe-generic" % "0.14.10",
  )
