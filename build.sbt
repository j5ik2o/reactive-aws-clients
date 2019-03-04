val scalaVersion211 = "2.11.12"
val scalaVersion212 = "2.12.8"

val awsSdk1Version = "1.11.492"
val awsSdk2Version = "2.4.0"

val catsVersion  = "1.5.0"
val monixVersion = "3.0.0-RC2"
val akkaVersion  = "2.5.19"

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
    "DynamoDB Local Repository" at "https://s3-us-west-2.amazonaws.com/dynamodb-local/release"
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
  wartremoverErrors ++= Warts.allBut(Wart.Any,
                                     Wart.Throw,
                                     Wart.Nothing,
                                     Wart.Product,
                                     Wart.NonUnitStatements,
                                     Wart.DefaultArguments,
                                     Wart.ImplicitParameter,
                                     Wart.StringPlusAny,
                                     Wart.Overloading),
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

lazy val `reactive-dynamodb-test` = (project in file("reactive-dynamodb/test"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-dynamodb-test",
      libraryDependencies ++= Seq(
        "com.google.guava"         % "guava"                        % "25.1-jre",
        "commons-io"               % "commons-io"                   % "2.6",
        "org.scalatest"            %% "scalatest"                   % "3.0.5" % Provided,
        "com.whisk"                %% "docker-testkit-scalatest"    % "0.9.8",
        "com.whisk"                %% "docker-testkit-impl-spotify" % "0.9.8",
        "com.amazonaws"            % "aws-java-sdk-dynamodb"        % "1.11.492",
        "com.amazonaws"            % "DynamoDBLocal"                % dynamoDBLocalVersion,
        "com.almworks.sqlite4java" % "sqlite4java"                  % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "sqlite4java-win32-x86"        % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "sqlite4java-win32-x64"        % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "libsqlite4java-osx"           % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "libsqlite4java-linux-i386"    % sqlite4javaVersion,
        "com.almworks.sqlite4java" % "libsqlite4java-linux-amd64"   % sqlite4javaVersion,
        "org.seasar.util"          % "s2util"                       % "0.0.1"
      )
    )
  )

lazy val `reactive-dynamodb-core` =
  (project in file("reactive-dynamodb/core")).settings(
    coreSettings ++ Seq(
      name := "reactive-dynamodb-core",
      libraryDependencies ++= Seq(
        "org.reactivestreams" % "reactive-streams" % "1.0.0"
      )
    )
  )

lazy val `reactive-dynamodb-cats` = (project in file("reactive-dynamodb/cats"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-dynamodb-cats",
      libraryDependencies ++= Seq(
        "org.typelevel" %% "cats-core" % catsVersion,
        "org.typelevel" %% "cats-free" % catsVersion
      )
    )
  ) dependsOn (`reactive-dynamodb-core`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-monix` = (project in file("reactive-dynamodb/monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-dynamodb-monix",
    libraryDependencies ++= Seq(
      "io.monix" %% "monix" % monixVersion
    )
  )
) dependsOn (`reactive-dynamodb-core`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-akka` = (project in file("reactive-dynamodb/akka"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-dynamodb-akka",
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor"          % akkaVersion,
        "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
        "com.typesafe.akka" %% "akka-stream"         % akkaVersion,
        "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
        "com.typesafe.akka" %% "akka-slf4j"          % akkaVersion
      )
    )
  ) dependsOn (`reactive-dynamodb-core`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-v1` = (project in file("reactive-dynamodb/v1"))
  .settings(
    coreSettings ++ copySqlite4javaJarsSettings ++ Seq(
      name := "reactive-dynamodb-v1",
      (compile in Compile) := (compile in Compile)
        .dependsOn(copySqlite4javaJars)
        .value,
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-dynamodb" % awsSdk1Version
      )
    )
  ) dependsOn (`reactive-dynamodb-core`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-v1-cats` = (project in file("reactive-dynamodb/v1-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-dynamodb-v1-cats",
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-java-sdk-dynamodb" % awsSdk1Version
    )
  )
) dependsOn (`reactive-dynamodb-v1`, `reactive-dynamodb-cats`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-v2` = (project in file("reactive-dynamodb/v2"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-dynamodb-v2",
      libraryDependencies ++= Seq(
        "software.amazon.awssdk" % "dynamodb" % awsSdk2Version
      )
    )
  ) dependsOn (`reactive-dynamodb-core`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-v2-akka` = (project in file("reactive-dynamodb/v2-akka")).settings(
  coreSettings ++ Seq(
    name := "reactive-dynamodb-v2-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
    )
  )
) dependsOn (`reactive-dynamodb-v2`, `reactive-dynamodb-akka`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-v2-monix` = (project in file("reactive-dynamodb/v2-monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-dynamodb-v2-monix",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-dynamodb-v2`, `reactive-dynamodb-monix`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-v2-cats` = (project in file("reactive-dynamodb/v2-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-dynamodb-v2-cats",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-dynamodb-v2`, `reactive-dynamodb-cats`, `reactive-dynamodb-test` % "test")

lazy val `reactive-dynamodb-root`: Project =
  (project in file("reactive-dynamodb"))
    .settings(coreSettings)
    .settings(
      name := "reactive-dynamodb-project"
    )
    .aggregate(
      `reactive-dynamodb-core`,
      `reactive-dynamodb-test`,
      `reactive-dynamodb-v1`,
      `reactive-dynamodb-v2`,
      `reactive-dynamodb-monix`,
      `reactive-dynamodb-cats`,
      `reactive-dynamodb-akka`,
      `reactive-dynamodb-v2-akka`,
      `reactive-dynamodb-v2-monix`
    )

lazy val `reactive-kinesis-test` = (project in file("reactive-kinesis/test"))
  .settings(
    coreSettings ++ Seq(
      name := "reactive-kinesis-test",
      libraryDependencies ++= Seq(
        "com.google.guava" % "guava"                        % "25.1-jre",
        "commons-io"       % "commons-io"                   % "2.6",
        "org.scalatest"    %% "scalatest"                   % "3.0.5" % Provided,
        "com.whisk"        %% "docker-testkit-scalatest"    % "0.9.8",
        "com.whisk"        %% "docker-testkit-impl-spotify" % "0.9.8",
        "com.amazonaws"    % "aws-java-sdk-kinesis"         % "1.11.492",
        "org.seasar.util"  % "s2util"                       % "0.0.1"
      )
    )
  )

lazy val `reactive-kinesis-core` = (project in file("reactive-kinesis/core")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-core",
    libraryDependencies ++= Seq(
      "org.reactivestreams" % "reactive-streams" % "1.0.0"
    )
  )
)

lazy val `reactive-kinesis-cats` = (project in file("reactive-kinesis/cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-cats",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % catsVersion,
      "org.typelevel" %% "cats-free" % catsVersion
    )
  )
) dependsOn (`reactive-kinesis-core`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-monix` = (project in file("reactive-kinesis/monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-monix",
    libraryDependencies ++= Seq(
      "io.monix" %% "monix" % monixVersion
    )
  )
) dependsOn (`reactive-kinesis-core`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-akka` = (project in file("reactive-kinesis/akka")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor"          % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream"         % akkaVersion,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-slf4j"          % akkaVersion
    )
  )
) dependsOn (`reactive-kinesis-core`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-v1` = (project in file("reactive-kinesis/v1")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-v1",
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-java-sdk-kinesis" % awsSdk1Version
    )
  )
) dependsOn (`reactive-kinesis-core`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-v1-cats` = (project in file("reactive-kinesis/v1-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-v1-cats",
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-java-sdk-kinesis" % awsSdk1Version
    )
  )
) dependsOn (`reactive-kinesis-v1`, `reactive-kinesis-cats`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-v2` = (project in file("reactive-kinesis/v2")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-v2",
    libraryDependencies ++= Seq(
      "software.amazon.awssdk" % "kinesis" % awsSdk2Version
    )
  )
) dependsOn (`reactive-kinesis-core`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-v2-akka` = (project in file("reactive-kinesis/v2-akka")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-v2-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
    )
  )
) dependsOn (`reactive-kinesis-v2`, `reactive-kinesis-akka`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-v2-monix` = (project in file("reactive-kinesis/v2-monix")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-v2-monix",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-kinesis-v2`, `reactive-kinesis-monix`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-v2-cats` = (project in file("reactive-kinesis/v2-cats")).settings(
  coreSettings ++ Seq(
    name := "reactive-kinesis-v2-cats",
    libraryDependencies ++= Seq(
      )
  )
) dependsOn (`reactive-kinesis-v2`, `reactive-kinesis-cats`, `reactive-kinesis-test` % "test")

lazy val `reactive-kinesis-root`: Project = (project in file("reactive-kinesis"))
  .settings(coreSettings)
  .settings(
    name := "reactive-kinesis-project"
  )
  .aggregate(
    `reactive-kinesis-core`,
    `reactive-kinesis-test`,
    `reactive-kinesis-v1`,
    `reactive-kinesis-v2`,
    `reactive-kinesis-monix`,
    `reactive-kinesis-cats`,
    `reactive-kinesis-akka`,
    `reactive-kinesis-v2-akka`,
    `reactive-kinesis-v2-monix`
  )

lazy val `root`: Project = (project in file("."))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-client-project"
  )
  .aggregate(`reactive-dynamodb-root`, `reactive-kinesis-root`)
