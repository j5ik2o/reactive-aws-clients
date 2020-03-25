import com.github.j5ik2o.sbt.wrapper.gen.SbtWrapperGenPlugin.autoImport._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc
import sbt.Keys._
import sbt.{ Classpaths, Credentials, Def, Resolver, Test, addCompilerPlugin, taskKey, _ }
import wartremover.WartRemover.autoImport.{ wartremoverErrors, wartremoverExcluded, Wart, Warts }
import xerial.sbt.Sonatype.autoImport.{ sonatypeProfileName, sonatypePublishToBundle }
import org.scalafmt.sbt.ScalafmtPlugin.autoImport._

object Settings {
  val sdkBaseName     = settingKey[String]("sdk base name")
  val scalaVersion211 = "2.11.12"
  val scalaVersion212 = "2.12.10"
  val scalaVersion213 = "2.13.1"

  val awsSdk2Version = "2.11.1"

  val catsVersion       = "2.0.0"
  val catsEffectVersion = "2.0.0"
  val monixVersion      = "3.1.0"
  val akkaVersion       = "2.5.29"

  val compileScalaStyle = taskKey[Unit]("compileScalaStyle")

  //lazy val scalaStyleSettings = Seq(
  //  (scalastyleConfig in Compile) := file("scalastyle-config.xml"),
  //  compileScalaStyle := scalastyle.in(Compile).toTask("").value,
  //  (compile in Compile) := (compile in Compile)
  //    .dependsOn(compileScalaStyle)
  //    .value
  //)

  val testSettings = Seq(
    testOptions in Test += Tests
        .Argument(TestFrameworks.ScalaTest, "-F", sys.env.getOrElse("SBT_TEST_TIME_FACTOR", "1")),
    libraryDependencies ++= Seq(
        "org.scalatest"  %% "scalatest"      % "3.0.8"  % Test,
        "org.scalacheck" %% "scalacheck"     % "1.14.3" % Test,
        "ch.qos.logback" % "logback-classic" % "1.2.3"  % Test
      )
  )

  val coreSettings = Seq(
    sonatypeProfileName := "com.github.j5ik2o",
    organization := "com.github.j5ik2o",
    scalaVersion := scalaVersion213,
    crossScalaVersions ++= Seq(scalaVersion211, scalaVersion212, scalaVersion213),
    scalacOptions ++= {
      Seq(
        "-feature",
        "-deprecation",
        "-unchecked",
        "-encoding",
        "UTF-8",
        "-language:_",
//        "-Ypartial-unification",
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
      <url>https://github.com/j5ik2o/reactive-aws-clients</url>
        <licenses>
          <license>
            <name>The MIT License</name>
            <url>http://opensource.org/licenses/MIT</url>
          </license>
        </licenses>
        <scm>
          <url>git@github.com:j5ik2o/reactive-aws-clients.git</url>
          <connection>scm:git:github.com/j5ik2o/reactive-aws-clients</connection>
          <developerConnection>scm:git:git@github.com:j5ik2o/reactive-aws-clients.git</developerConnection>
        </scm>
        <developers>
          <developer>
            <id>j5ik2o</id>
            <name>Junichi Kato</name>
          </developer>
        </developers>
    },
    publishTo := sonatypePublishToBundle.value,
    credentials := {
      val ivyCredentials = (baseDirectory in LocalRootProject).value / ".credentials"
      val gpgCredentials = (baseDirectory in LocalRootProject).value / ".gpgCredentials"
      Credentials(ivyCredentials) :: Credentials(gpgCredentials) :: Nil
    },
    scalafmtOnCompile in ThisBuild := true,
    resolvers ++= Seq(
        Resolver.bintrayRepo("danslapman", "maven"),
        "Seasar Repository" at "https://maven.seasar.org/maven2/",
        Resolver.sonatypeRepo("releases"),
        "DynamoDB Local Repository" at "https://s3-ap-northeast-1.amazonaws.com/dynamodb-local-tokyo/release"
      ),
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3"),
    libraryDependencies ++= Seq(
        "com.beachape"           %% "enumeratum"              % "1.5.15",
        "org.slf4j"              % "slf4j-api"                % "1.7.30",
        "org.scala-lang.modules" %% "scala-java8-compat"      % "0.9.0",
        "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.3"
      ),
    dependencyOverrides ++= {
      Seq(
        "org.scalatest"               %% "scalatest"                  % "3.0.8",
        "org.slf4j"                   % "slf4j-api"                   % "1.7.25",
        "org.scala-lang.modules"      %% "scala-java8-compat"         % "0.9.0",
        "org.apache.httpcomponents"   % "httpcore"                    % "4.4.11",
        "org.apache.httpcomponents"   % "httpclient"                  % "4.5.6",
        "com.fasterxml.jackson.core"  % "jackson-core"                % "2.9.8",
        "com.fasterxml.jackson.core"  % "jackson-databind"            % "2.9.8",
        "com.fasterxml.jackson.core"  % "jackson-annotations"         % "2.9.8",
        "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.9.8",
        "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-base"          % "2.9.8",
        "commons-codec"               % "commons-codec"               % "1.10",
        "commons-io"                  % "commons-io"                  % "2.6",
        "org.reactivestreams"         % "reactive-streams"            % "1.0.2",
        "io.netty"                    % "netty-codec-http"            % "4.1.33.Final",
        "io.netty"                    % "netty-handler"               % "4.1.33.Final",
        "com.google.code.findbugs"    % "jsr305"                      % "3.0.2",
        "com.google.guava"            % "guava"                       % "28.1-jre",
        "commons-logging"             % "commons-logging"             % "1.2",
        "org.scala-lang"              % "scala-reflect"               % scalaVersion.value,
        "org.scala-lang"              % "scala-library"               % scalaVersion.value
      )
    },
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
    wartremoverExcluded += baseDirectory.value / "src" / "test" / "scala",
    updateOptions := updateOptions.value.withCachedResolution(true)
  ) // ++ scalaStyleSettings

  val coreWithTestSettings = coreSettings ++ testSettings

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

  def hasTargetMethods(cd: ClassDesc): Boolean = {
    cd.methods.exists { m =>
      !m.static && !m.name.endsWith("AsString") && !m.name.endsWith("AsStrings") && m.parameterTypeDescs.isEmpty && (
        m.name match {
          case "builder"                  => false
          case "serializableBuilderClass" => false
          case "toBuilder"                => false
          case "hashCode"                 => false
          case "toString"                 => false
          case "sdkFields"                => false
          case _                          => true
        }
      )
    }
  }

  lazy val scalaWrapperGenCoreSettings = {
    Seq(
      inputSourceDirectory in scalaWrapperGen := (baseDirectory in LocalRootProject).value / s"aws-sdk-src/aws-sdk-java-v2/services/${sdkBaseName.value.toLowerCase}/target/generated-sources/sdk/software/amazon/awssdk/services/${sdkBaseName.value.toLowerCase}",
      templateDirectories in scalaWrapperGen := Seq(
          (baseDirectory in LocalRootProject).value / "ftl",
          baseDirectory.value / "sbt-wrapper-gen"
        ),
      outputSourceDirectoryMapper in scalaWrapperGen := { _ =>
        (scalaSource in Compile).value
      },
      packageNameMapper in scalaWrapperGen := {
        case (s, tn, _) if tn.endsWith("Ops") =>
          s.replace(
            s"software.amazon.awssdk.services.${sdkBaseName.value.toLowerCase}.model",
            s"com.github.j5ik2o.reactive.aws.${sdkBaseName.value.toLowerCase}.model.ops"
          )
        case (s, _, _) =>
          s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")
      },
      typeDescFilter in scalaWrapperGen := {
        case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"   => true
        case cd if cd.simpleTypeName == s"${sdkBaseName.value}Client"        => true
        case cd: ClassDesc if cd.simpleTypeName.startsWith("Default")        => false
        case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")        => false
        case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")           => false
        case cd: ClassDesc if cd.simpleTypeName.endsWith("Builder")          => false
        case cd: ClassDesc if cd.simpleTypeName.endsWith("Handler")          => false
        case cd: ClassDesc if cd.simpleTypeName.endsWith("ResponseMetadata") => false
        case cd: ClassDesc
            if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract && hasTargetMethods(cd) =>
          true
        case _ =>
          false
      },
      typeNameMapper in scalaWrapperGen := {
        case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
          Seq(s"${sdkBaseName.value}Client", s"${sdkBaseName.value}AsyncClient")
        case cd if cd.simpleTypeName == s"${sdkBaseName.value}Client" =>
          Seq(s"${sdkBaseName.value}SyncClient")
        case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")

        case cd => Seq(cd.simpleTypeName)
      },
      templateNameMapper in scalaWrapperGen := {
        case (f, cd: ClassDesc)
            if f == s"${sdkBaseName.value}Client" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
          s"${sdkBaseName.value}Client.ftl"
        case (f, cd: ClassDesc)
            if f == s"${sdkBaseName.value}AsyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
          s"${sdkBaseName.value}AsyncClient.ftl"
        case (f, cd: ClassDesc)
            if f == s"${sdkBaseName.value}SyncClient" && cd.simpleTypeName == s"${sdkBaseName.value}Client" =>
          s"${sdkBaseName.value}SyncClient.ftl"

        case (f, cd: ClassDesc) if f.endsWith("Ops") && cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"
        case (f, cd)                                                                               => throw new Exception(s"error: $f, ${cd.simpleTypeName}")
      }
    )
  }

  def scalaWrapperGenBaseSettings(typeName: String = "", packageName: String = ""): Seq[Def.Setting[_]] =
    Seq(
      inputSourceDirectory in scalaWrapperGen := (baseDirectory in LocalRootProject).value / s"aws-sdk-src/aws-sdk-java-v2/services/${sdkBaseName.value.toLowerCase}/target/generated-sources/sdk/software/amazon/awssdk/services/${sdkBaseName.value.toLowerCase}",
      templateDirectories in scalaWrapperGen := Seq(
          (baseDirectory in LocalRootProject).value / "ftl",
          baseDirectory.value / "sbt-wrapper-gen"
        ),
      outputSourceDirectoryMapper in scalaWrapperGen := { _ =>
        (scalaSource in Compile).value
      },
      packageNameMapper in scalaWrapperGen := {
        case (s, _, _) =>
          s.replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws") + (if (packageName.nonEmpty)
                                                                                              "." + packageName.toLowerCase
                                                                                            else "")
      },
      typeDescFilter in scalaWrapperGen := {
        case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" => true
        case _ =>
          false
      },
      typeNameMapper in scalaWrapperGen := {
        case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
          Seq(s"${sdkBaseName.value}${typeName}Client")
      },
      templateNameMapper in scalaWrapperGen := {
        case (f, cd: ClassDesc)
            if f == s"${sdkBaseName.value}${typeName}Client" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
          s"${sdkBaseName.value}${typeName}Client.ftl"
        case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
      }
    )

}
