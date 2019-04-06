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

lazy val `reactive-aws-s3-cats` = (project in file("reactive-aws-s3/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-s3-core`, `reactive-aws-s3-test` % "test")

lazy val `reactive-aws-s3-monix` = (project in file("reactive-aws-s3/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-s3-core`, `reactive-aws-s3-test` % "test")

lazy val `reactive-aws-s3-akka` = (project in file("reactive-aws-s3/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-s3-core`, `reactive-aws-s3-test` % "test")

lazy val `reactive-aws-s3-root`: Project = (project in file("reactive-aws-s3"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-s3-project"
  )
  .aggregate(
    `reactive-aws-s3-core`,
    `reactive-aws-s3-test`,
    `reactive-aws-s3-akka`,
    `reactive-aws-s3-cats`,
    `reactive-aws-s3-monix`
  )

// --- sqs

lazy val `reactive-aws-sqs-test` = (project in file("reactive-aws-sqs/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-sqs-core` =
  (project in file("reactive-aws-sqs/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-sqs-test` % "test")

lazy val `reactive-aws-sqs-cats` = (project in file("reactive-aws-sqs/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-sqs-core`, `reactive-aws-sqs-test` % "test")

lazy val `reactive-aws-sqs-monix` = (project in file("reactive-aws-sqs/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-sqs-core`, `reactive-aws-sqs-test` % "test")

lazy val `reactive-aws-sqs-akka` = (project in file("reactive-aws-sqs/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-sqs-core`, `reactive-aws-sqs-test` % "test")

lazy val `reactive-aws-sqs-root`: Project = (project in file("reactive-aws-sqs"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-sqs-project"
  )
  .aggregate(
    `reactive-aws-sqs-core`,
    `reactive-aws-sqs-test`,
    `reactive-aws-sqs-akka`,
    `reactive-aws-sqs-cats`,
    `reactive-aws-sqs-monix`
  )

// --- appsync

lazy val `reactive-aws-appsync-test` = (project in file("reactive-aws-appsync/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-appsync-core` =
  (project in file("reactive-aws-appsync/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-appsync-test` % "test")

lazy val `reactive-aws-appsync-cats` = (project in file("reactive-aws-appsync/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-appsync-core`, `reactive-aws-appsync-test` % "test")

lazy val `reactive-aws-appsync-monix` = (project in file("reactive-aws-appsync/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-appsync-core`, `reactive-aws-appsync-test` % "test")

lazy val `reactive-aws-appsync-akka` = (project in file("reactive-aws-appsync/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-appsync-core`, `reactive-aws-appsync-test` % "test")

lazy val `reactive-aws-appsync-root`: Project = (project in file("reactive-aws-appsync"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-appsync-project"
  )
  .aggregate(
    `reactive-aws-appsync-core`,
    `reactive-aws-appsync-test`,
    `reactive-aws-appsync-akka`,
    `reactive-aws-appsync-cats`,
    `reactive-aws-appsync-monix`
  )

lazy val `root`: Project = (project in file("."))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-client-project"
  )
  .aggregate(
    `reactive-aws-common-root`,
    `reactive-aws-dynamodb-root`,
    `reactive-aws-kinesis-root`,
    `reactive-aws-s3-root`,
    `reactive-aws-sqs-root`,
    `reactive-aws-appsync-root`
  )
