import com.github.j5ik2o.sbt.wrapper.gen.SbtWrapperGenPlugin.autoImport._
import com.github.j5ik2o.sbt.wrapper.gen.model.TypeDesc
import com.lucidchart.sbt.scalafmt.ScalafmtCorePlugin.autoImport.{ scalafmtOnCompile, scalafmtTestOnCompile }
import sbt.{ Classpaths, Credentials, Def, Resolver, Test, addCompilerPlugin, taskKey, _ }
import sbt.Keys._
import wartremover.WartRemover.autoImport.{ wartremoverErrors, wartremoverExcluded, Wart, Warts }
import xerial.sbt.Sonatype.autoImport.{ sonatypeProfileName, sonatypePublishTo }

object Settings {
  val scalaVersion211 = "2.11.12"
  val scalaVersion212 = "2.12.8"

  val awsSdk1Version = "1.11.528"
  val awsSdk2Version = "2.5.11"

  val catsVersion  = "1.5.0"
  val monixVersion = "3.0.0-RC2"
  val akkaVersion  = "2.5.21"

  val compileScalaStyle = taskKey[Unit]("compileScalaStyle")

  //lazy val scalaStyleSettings = Seq(
  //  (scalastyleConfig in Compile) := file("scalastyle-config.xml"),
  //  compileScalaStyle := scalastyle.in(Compile).toTask("").value,
  //  (compile in Compile) := (compile in Compile)
  //    .dependsOn(compileScalaStyle)
  //    .value
  //)

  val coreSettings = Seq(
    sonatypeProfileName := "com.github.j5ik2o",
    organization := "com.github.j5ik2o",
    scalaVersion := scalaVersion212,
    crossScalaVersions ++= Seq(scalaVersion211, scalaVersion212),
    scalacOptions ++= {
      Seq(
        "-feature",
        "-deprecation",
        "-unchecked",
        "-encoding",
        "UTF-8",
        "-language:_",
        "-Ypartial-unification",
        "-Ydelambdafy:method",
        "-target:jvm-1.8"
      )
    },
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ =>
      false
    },
    pomExtra := {
      <url>https://github.com/j5ik2o/reactive-aws-client</url>
        <licenses>
          <license>
            <name>The MIT License</name>
            <url>http://opensource.org/licenses/MIT</url>
          </license>
        </licenses>
        <scm>
          <url>git@github.com:j5ik2o/reactive-aws-client.git</url>
          <connection>scm:git:github.com/j5ik2o/reactive-aws-client</connection>
          <developerConnection>scm:git:git@github.com:j5ik2o/reactive-aws-client.git</developerConnection>
        </scm>
        <developers>
          <developer>
            <id>j5ik2o</id>
            <name>Junichi Kato</name>
          </developer>
        </developers>
    },
    publishTo in ThisBuild := sonatypePublishTo.value,
    credentials := {
      val ivyCredentials = (baseDirectory in LocalRootProject).value / ".credentials"
      Credentials(ivyCredentials) :: Nil
    },
    scalafmtOnCompile in ThisBuild := true,
    scalafmtTestOnCompile in ThisBuild := true,
    resolvers ++= Seq(
      Resolver.bintrayRepo("danslapman", "maven"),
      "Seasar Repository" at "http://maven.seasar.org/maven2/",
      Resolver.sonatypeRepo("releases"),
      "DynamoDB Local Repository" at "https://s3-ap-northeast-1.amazonaws.com/dynamodb-local-tokyo/release"
    ),
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7"),
    libraryDependencies ++= Seq(
      "com.beachape"           %% "enumeratum"         % "1.5.13",
      "org.slf4j"              % "slf4j-api"           % "1.7.25",
      "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.0",
      "org.scalatest"          %% "scalatest"          % "3.0.5" % Test,
      "org.scalacheck"         %% "scalacheck"         % "1.14.0" % Test,
      "ch.qos.logback"         % "logback-classic"     % "1.2.3" % Test
    ),
    parallelExecution in Test := false,
    wartremoverErrors ++= Warts.allBut(
      Wart.ArrayEquals,
      Wart.Any,
      Wart.Throw,
      Wart.Nothing,
      Wart.Product,
      Wart.NonUnitStatements,
      Wart.DefaultArguments,
      Wart.ImplicitParameter,
      Wart.StringPlusAny,
      Wart.Overloading
    ),
    wartremoverExcluded += baseDirectory.value / "src" / "test" / "scala"
  ) // ++ scalaStyleSettings

  val dynamoDBLocalVersion = "1.11.477"
  val sqlite4javaVersion   = "1.0.392"

  lazy val copySqlite4javaJars = taskKey[Unit]("copyJars")

  lazy val copySqlite4javaJarsSettings = Seq(
    copySqlite4javaJars := {
      import java.io.File
      import java.nio.file.Files
      // For Local Dynamo DB to work, we need to copy SQLLite native libs from
      // our test dependencies into a directory that Java can find ("lib" in this case)
      // Then in our Java/Scala program, we need to set System.setProperty("sqlite4java.library.path", "lib");
      // before attempting to instantiate a DynamoDBEmbedded instance
      val artifactTypes = Set("dylib", "so", "dll")
      val files         = Classpaths.managedJars(Test, artifactTypes, update.value).files
      Files.createDirectories(new File(baseDirectory.value, "native-libs").toPath)
      files.foreach { f =>
        val fileToCopy =
          new File(new File(baseDirectory.value, "native-libs"), f.name)
        if (!fileToCopy.exists()) {
          Files.copy(f.toPath, fileToCopy.toPath)
        }
      }
    }
  )

  def scalaWrapperGenBaseSettings(name: String): Seq[Def.Setting[_]] =
    Seq(
      templateDirectories in scalaWrapperGen := Seq((baseDirectory in LocalRootProject).value / "ftl",
                                                    baseDirectory.value / "sbt-wrapper-gen"),
      outputSourceDirectoryMapper in scalaWrapperGen := { _ =>
        (scalaSource in Compile).value
      },
      inputSourceDirectory in scalaWrapperGen := (baseDirectory in LocalRootProject).value / s"aws-sdk-src/aws-sdk-java-v2/services/$name/target/generated-sources/sdk/software/amazon/awssdk/services/$name"
    )

  val scalaWrapperGenKinesisBaseSettings: Seq[Def.Setting[_]]  = scalaWrapperGenBaseSettings("kinesis")
  val scalaWrapperGenDynamoDBBaseSettings: Seq[Def.Setting[_]] = scalaWrapperGenBaseSettings("dynamodb")
  val scalaWrapperGenS3BaseSettings: Seq[Def.Setting[_]]       = scalaWrapperGenBaseSettings("s3")
  val scalaWrapperGenSQSBaseSettings: Seq[Def.Setting[_]]      = scalaWrapperGenBaseSettings("sqs")
  val scalaWrapperGenAppSyncBaseSettings: Seq[Def.Setting[_]]  = scalaWrapperGenBaseSettings("appsync")

}
