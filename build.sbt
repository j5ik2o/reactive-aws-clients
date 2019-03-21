val scalaVersion211 = "2.11.12"
val scalaVersion212 = "2.12.8"

val awsSdk1Version = "1.11.520"
val awsSdk2Version = "2.5.11"

val catsVersion  = "1.5.0"
val monixVersion = "3.0.0-RC2"
val akkaVersion  = "2.5.21"

val compileScalaStyle = taskKey[Unit]("compileScalaStyle")

lazy val scalaStyleSettings = Seq(
  (scalastyleConfig in Compile) := file("scalastyle-config.xml"),
  compileScalaStyle := scalastyle.in(Compile).toTask("").value,
  (compile in Compile) := (compile in Compile)
    .dependsOn(compileScalaStyle)
    .value
)

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
) ++ scalaStyleSettings

val dynamoDBLocalVersion = "1.11.477"
val sqlite4javaVersion   = "1.0.392"

lazy val copySqlite4javaJars = taskKey[Unit]("copyJars")

lazy val copySqlite4javaJarsSettings = Seq(
  copySqlite4javaJars := {
    import java.nio.file.Files
    import java.io.File
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

// --- common

lazy val `reactive-aws-common-test` = (project in file("reactive-aws-common/test"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-common-test",
    libraryDependencies ++= Seq(
      "com.google.guava" % "guava"                        % "20.0",
      "commons-io"       % "commons-io"                   % "2.6",
      "org.scalatest"    %% "scalatest"                   % "3.0.5" % Provided,
      "com.whisk"        %% "docker-testkit-scalatest"    % "0.9.8",
      "com.whisk"        %% "docker-testkit-impl-spotify" % "0.9.8",
      "org.seasar.util"  % "s2util"                       % "0.0.1"
    )
  )

lazy val `reactive-aws-common-core` = (project in file("reactive-aws-common/core"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-common-core",
    libraryDependencies ++= Seq(
      "org.reactivestreams" % "reactive-streams" % "1.0.0"
    )
  )

lazy val `reactive-aws-common-cats` = (project in file("reactive-aws-common/cats"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-common-cats",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % catsVersion,
      "org.typelevel" %% "cats-free" % catsVersion
    )
  ) dependsOn (`reactive-aws-common-core`)

lazy val `reactive-aws-common-monix` = (project in file("reactive-aws-common/monix"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-common-monix",
    libraryDependencies ++= Seq(
      "io.monix" %% "monix" % monixVersion
    )
  ) dependsOn (`reactive-aws-common-core`)

lazy val `reactive-aws-common-akka` = (project in file("reactive-aws-common/akka"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-common-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor"  % akkaVersion,
      "com.typesafe.akka" %% "akka-stream" % akkaVersion,
      "com.typesafe.akka" %% "akka-slf4j"  % akkaVersion
    )
  ) dependsOn (`reactive-aws-common-core`)

lazy val `reactive-aws-common-root`: Project = (project in file("reactive-aws-common"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-common-project"
  )
  .aggregate(
    `reactive-aws-common-core`,
    `reactive-aws-common-test`,
    `reactive-aws-common-monix`,
    `reactive-aws-common-cats`,
    `reactive-aws-common-akka`
  )

// --- dynamodb

lazy val `reactive-aws-dynamodb-test` = (project in file("reactive-aws-dynamodb/test"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-aws-dynamodb-test",
      libraryDependencies ++= Seq(
        "com.amazonaws"            % "aws-java-sdk-dynamodb"      % "1.11.492",
        "com.amazonaws"            % "DynamoDBLocal"              % dynamoDBLocalVersion,
        "com.almworks.sqlite4java" % "sqlite4java"                % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "sqlite4java-win32-x86"      % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "sqlite4java-win32-x64"      % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "libsqlite4java-osx"         % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "libsqlite4java-linux-i386"  % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "libsqlite4java-linux-amd64" % sqlite4javaVersion
      )
    )
  ) dependsOn (`reactive-aws-common-test`)

lazy val `reactive-aws-dynamodb-core` = (project in file("reactive-aws-dynamodb/core")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-dynamodb-core",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-common-core`)

lazy val `reactive-aws-dynamodb-cats` = (project in file("reactive-aws-dynamodb/cats"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-aws-dynamodb-cats",
      libraryDependencies ++= Seq(
        )
    )
  ) dependsOn (`reactive-aws-common-cats`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-monix` = (project in file("reactive-aws-dynamodb/monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-dynamodb-monix",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-common-monix`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-akka` = (project in file("reactive-aws-dynamodb/akka"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-aws-dynamodb-akka",
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
        "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
      )
    )
  ) dependsOn (`reactive-aws-common-akka`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v1` = (project in file("reactive-aws-dynamodb/v1"))
  .settings(
    coreSettings ++ copySqlite4javaJarsSettings ++ Seq(
      name := "reactive-aws-dynamodb-v1",
      (compile in Compile) := (compile in Compile)
        .dependsOn(copySqlite4javaJars)
        .value,
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-dynamodb" % awsSdk1Version
      )
    )
  ) dependsOn (`reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v1-cats` = (project in file("reactive-aws-dynamodb/v1-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-dynamodb-v1-cats",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-dynamodb-v1`, `reactive-aws-dynamodb-cats`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2` = (project in file("reactive-aws-dynamodb/v2"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-aws-dynamodb-v2",
      libraryDependencies ++= Seq(
        "software.amazon.awssdk" % "dynamodb" % awsSdk2Version
      )
    )
  ) dependsOn (`reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2-akka` = (project in file("reactive-aws-dynamodb/v2-akka")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-dynamodb-v2-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
    )
  )
) dependsOn (`reactive-aws-dynamodb-v2`, `reactive-aws-dynamodb-akka`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2-monix` = (project in file("reactive-aws-dynamodb/v2-monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-dynamodb-v2-monix",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-dynamodb-v2`, `reactive-aws-dynamodb-monix`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2-cats` = (project in file("reactive-aws-dynamodb/v2-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-dynamodb-v2-cats",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-dynamodb-v2`, `reactive-aws-dynamodb-cats`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-root`: Project =
  (project in file("reactive-aws-dynamodb"))
    .settings(coreSettings)
    .settings(
      name := "reactive-aws-dynamodb-project"
    )
    .aggregate(
      `reactive-aws-dynamodb-core`,
      `reactive-aws-dynamodb-test`,
      `reactive-aws-dynamodb-v1`,
      `reactive-aws-dynamodb-v2`,
      `reactive-aws-dynamodb-monix`,
      `reactive-aws-dynamodb-cats`,
      `reactive-aws-dynamodb-akka`,
      `reactive-aws-dynamodb-v2-akka`,
      `reactive-aws-dynamodb-v2-monix`
    )

// --- reactive-kinesis

lazy val `reactive-aws-kinesis-test` = (project in file("reactive-aws-kinesis/test"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-aws-kinesis-test",
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-kinesis" % "1.11.492"
      )
    )
  ).dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-kinesis-core` = (project in file("reactive-aws-kinesis/core")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-core",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-common-core`)

lazy val `reactive-aws-kinesis-cats` = (project in file("reactive-aws-kinesis/cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-cats",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-common-cats`, `reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-monix` = (project in file("reactive-aws-kinesis/monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-monix",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-common-monix`, `reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-akka` = (project in file("reactive-aws-kinesis/akka")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
    )
  )
) dependsOn (`reactive-aws-common-akka`, `reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-v1` = (project in file("reactive-aws-kinesis/v1")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-v1",
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-java-sdk-kinesis" % awsSdk1Version
    )
  )
) dependsOn (`reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-v1-cats` = (project in file("reactive-aws-kinesis/v1-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-v1-cats",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-kinesis-v1`, `reactive-aws-kinesis-cats`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-v2` = (project in file("reactive-aws-kinesis/v2")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-v2",
    libraryDependencies ++= Seq(
      "software.amazon.awssdk" % "kinesis" % awsSdk2Version
    )
  )
) dependsOn (`reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-v2-akka` = (project in file("reactive-aws-kinesis/v2-akka")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-v2-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
    )
  )
) dependsOn (`reactive-aws-kinesis-v2`, `reactive-aws-kinesis-akka`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-v2-monix` = (project in file("reactive-aws-kinesis/v2-monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-v2-monix",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-kinesis-v2`, `reactive-aws-kinesis-monix`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-v2-cats` = (project in file("reactive-aws-kinesis/v2-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-aws-kinesis-v2-cats",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-aws-kinesis-v2`, `reactive-aws-kinesis-cats`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-root`: Project = (project in file("reactive-aws-kinesis"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-kinesis-project"
  )
  .aggregate(
    `reactive-aws-kinesis-core`,
    `reactive-aws-kinesis-test`,
    `reactive-aws-kinesis-v1`,
    `reactive-aws-kinesis-v2`,
    `reactive-aws-kinesis-monix`,
    `reactive-aws-kinesis-cats`,
    `reactive-aws-kinesis-akka`,
    `reactive-aws-kinesis-v2-akka`,
    `reactive-aws-kinesis-v2-monix`
  )

lazy val `root`: Project = (project in file("."))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-client-project"
  )
  .aggregate(`reactive-aws-common-root`, `reactive-aws-dynamodb-root`, `reactive-aws-kinesis-root`)
