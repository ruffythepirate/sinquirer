import org.scoverage.coveralls.Imports.CoverallsKeys._

import java.io.File

name := """sinquirer"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "org.mockito" % "mockito-core" % "2.2.22" % "test"

coverageEnabled := true

coverallsToken := {
  val token = IO.read(new File("project/coverall/coverallToken.txt"))
  Some(token)
}
