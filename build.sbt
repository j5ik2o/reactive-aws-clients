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
  (project in file("reactive-aws-dynamodb/core"))
    .dependsOn(`reactive-aws-common-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-cats` = (project in file("reactive-aws-dynamodb/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-monix` = (project in file("reactive-aws-dynamodb/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-akka` = (project in file("reactive-aws-dynamodb/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-dynamodb-core`, `reactive-aws-dynamodb-test` % "test")

lazy val `reactive-aws-dynamodb-root`: Project =
  (project in file("reactive-aws-dynamodb"))
    .settings(coreSettings)
    .settings(
      name := "reactive-aws-dynamodb-project"
    )
    .aggregate(
      `reactive-aws-dynamodb-core`,
      `reactive-aws-dynamodb-test`,
      `reactive-aws-dynamodb-monix`,
      `reactive-aws-dynamodb-cats`,
      `reactive-aws-dynamodb-akka`
    )

// --- kinesis

lazy val `reactive-aws-kinesis-test` = (project in file("reactive-aws-kinesis/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-kinesis-core` =
  (project in file("reactive-aws-kinesis/core")).dependsOn(`reactive-aws-common-core`)

lazy val `reactive-aws-kinesis-cats` = (project in file("reactive-aws-kinesis/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-monix` = (project in file("reactive-aws-kinesis/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-akka` = (project in file("reactive-aws-kinesis/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-kinesis-core`, `reactive-aws-kinesis-test` % "test")

lazy val `reactive-aws-kinesis-root`: Project = (project in file("reactive-aws-kinesis"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-kinesis-project"
  )
  .aggregate(
    `reactive-aws-kinesis-core`,
    `reactive-aws-kinesis-test`,
    `reactive-aws-kinesis-akka`,
    `reactive-aws-kinesis-cats`,
    `reactive-aws-kinesis-monix`
  )

// --- s3

lazy val `reactive-aws-s3-test` = (project in file("reactive-aws-s3/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-s3-core` =
  (project in file("reactive-aws-s3/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-s3-test` % "test")

lazy val `reactive-aws-s3-root`: Project = (project in file("reactive-aws-s3"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-s3-project"
  )
  .aggregate(
    `reactive-aws-s3-core`,
    `reactive-aws-s3-test`
  )

lazy val `root`: Project = (project in file("."))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-client-project"
  )
  .aggregate(`reactive-aws-common-root`,
             `reactive-aws-dynamodb-root`,
             `reactive-aws-kinesis-root`,
             `reactive-aws-s3-root`)
