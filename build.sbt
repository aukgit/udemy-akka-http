name := "udemy-akka-http"

version := "0.1"

scalaVersion := "2.12.8"

val akkaVersion = "2.6.4"
val akkaHttpVersion = "10.1.8"
val scalaTestVersion = "3.1.0"

libraryDependencies ++= Seq(
  // akka streams
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  // akka http
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",

  // testing
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % scalaTestVersion,
  
  // JWT
  "com.pauldijou" %% "jwt-spray-json" % "2.1.0"

)