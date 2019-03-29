import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }
import Settings._

// --- common

lazy val `reactive-aws-common-test` = project in file("reactive-aws-common/test")

lazy val `reactive-aws-common-core` = project in file("reactive-aws-common/core")

lazy val `reactive-aws-common-cats` =
  (project in file("reactive-aws-common/cats")).dependsOn(`reactive-aws-common-core`)

lazy val `reactive-aws-common-monix` =
  (project in file("reactive-aws-common/monix")).dependsOn(`reactive-aws-common-core`)

lazy val `reactive-aws-common-akka` =
  (project in file("reactive-aws-common/akka")).dependsOn(`reactive-aws-common-core`)

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

lazy val `reactive-aws-dynamodb-test` =
  (project in file("reactive-aws-dynamodb/test")).dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-dynamodb-core` =
  (project in file("reactive-aws-dynamodb/core")).dependsOn(`reactive-aws-common-core`)

lazy val `reactive-aws-dynamodb-cats` = (project in file("reactive-aws-dynamodb/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-monix` = (project in file("reactive-aws-dynamodb/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-akka` = (project in file("reactive-aws-dynamodb/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v1` = (project in file("reactive-aws-dynamodb/v1"))
  .dependsOn(`reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v1-cats` = (project in file("reactive-aws-dynamodb/v1-cats"))
  .dependsOn(`reactive-aws-dynamodb-v1`, `reactive-aws-dynamodb-cats`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2` = (project in file("reactive-aws-dynamodb/v2"))
  .dependsOn(`reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2-akka` = (project in file("reactive-aws-dynamodb/v2-akka"))
  .dependsOn(`reactive-aws-dynamodb-v2`, `reactive-aws-dynamodb-akka`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2-monix` = (project in file("reactive-aws-dynamodb/v2-monix"))
  .dependsOn(`reactive-aws-dynamodb-v2`, `reactive-aws-dynamodb-monix`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-v2-cats` = (project in file("reactive-aws-dynamodb/v2-cats"))
  .dependsOn(`reactive-aws-dynamodb-v2`, `reactive-aws-dynamodb-cats`, `reactive-aws-dynamodb-test` % "test")

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
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-kinesis-core` =
  (project in file("reactive-aws-kinesis/core")).dependsOn(`reactive-aws-common-core`)

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
    ),
    compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value,
    templateNameMapper in scalaWrapperGen := {
      case ("KinesisAsyncClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisAsyncClient" =>
        "KinesisAsyncClient.ftl"
      case ("KinesisAsyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "KinesisAsyncClient" =>
        "KinesisAsyncClientImpl.ftl"
      case ("KinesisSyncClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisClient" =>
        "KinesisSyncClient.ftl"
      case ("KinesisSyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "KinesisClient" =>
        "KinesisSyncClientImpl.ftl"
      case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName.endsWith("Request") =>
        "RequestOps.ftl"
      case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName.endsWith("Response") =>
        "ResponseOps.ftl"
      case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"
      case (_, cd: EnumDesc) if cd.packageName.exists(_.endsWith("model"))  => "EnumOps.ftl"
      case (name, cd)                                                       => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
    },
    typeNameMapper in scalaWrapperGen := {
      case cd if cd.simpleTypeName == "KinesisAsyncClient" =>
        Seq("KinesisAsyncClient", "KinesisAsyncClientImpl")
      case cd if cd.simpleTypeName == "KinesisClient" =>
        Seq("KinesisSyncClient", "KinesisSyncClientImpl")
      case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")
      case cd                                               => Seq(cd.simpleTypeName)
    },
    packageNameMapper in scalaWrapperGen := {
      _.replace("software.amazon.awssdk.services.kinesis", "com.github.j5ik2o.reactive.aws.kinesis.v2")
    },
    outputSourceDirectoryMapper in scalaWrapperGen := { _ =>
      (scalaSource in Compile).value
    },
    typeDescFilter in scalaWrapperGen := {
      case cd if cd.simpleTypeName == "KinesisAsyncClient"                     => true
      case cd if cd.simpleTypeName == "KinesisClient"                          => false
      case cd: ClassDesc if cd.simpleTypeName.startsWith("Default")            => false
      case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception")            => false
      case cd: ClassDesc if cd.simpleTypeName.endsWith("Builder")              => false
      case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")               => false
      case cd: ClassDesc if cd.simpleTypeName == "KinesisResponseMetadata"     => false
      case cd: ClassDesc if cd.simpleTypeName == "SubscribeToShardEventStream" => false
      case cd: EnumDesc if cd.packageName.exists(_.endsWith("model"))          => true
      case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract =>
        true
      case cd =>
        false
    },
    inputSourceDirectory in scalaWrapperGen := (baseDirectory in LocalRootProject).value / "aws-sdk-src/aws-sdk-java-v2/services/kinesis/target/generated-sources/sdk/software/amazon/awssdk/services/kinesis"
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
