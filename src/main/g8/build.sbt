name := "$name$"
organization := "$organization$"
version := "0.0.1"
scalaVersion := "$scala_version$"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val ficusV        = "$ficus_version$"
  val scalaMockV    = "$scala_mock_version$"
  val lambdaUtilsV  = "$lambda_utils_version$"
  val lambdaEventsV = "$lambda_events_version$"

  Seq(
    "io.github.yeghishe" %% "scala-aws-lambda-utils"      % lambdaUtilsV,
    "com.iheart"         %% "ficus"                       % ficusV,
    "com.amazonaws"      %  "aws-lambda-java-events"      % lambdaEventsV,
    "org.scalamock"      %% "scalamock-scalatest-support" % scalaMockV % "it,test"
  )
}

lazy val root = project.in(file(".")).configs(IntegrationTest)
Defaults.itSettings
coverageEnabled := true

initialCommands := """
  import io.github.yeghishe._
  import io.github.yeghishe.lambda._
  import scala.concurrent._
  import scala.concurrent.duration._
""".stripMargin

assemblyJarName in assembly := s"\${name.value}.jar"
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _ *) => MergeStrategy.discard
  case _                              => MergeStrategy.first
}

enablePlugins(S3Plugin)
mappings in s3Upload := Seq((file(s"target/scala-2.12/\${name.value}.jar"), s"\${name.value}.jar"))
s3Host in s3Upload := "$s3_bucket$.s3.amazonaws.com"
s3Progress in s3Upload := true
//s3Upload <<= s3Upload dependsOn assembly
//s3Upload := {
//  assembly.value
//}
