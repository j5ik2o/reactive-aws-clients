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

// --- dax

lazy val `reactive-aws-dax-test` = (project in file("reactive-aws-dax/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-dax-core` =
  (project in file("reactive-aws-dax/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-dax-test` % "test")

lazy val `reactive-aws-dax-cats` = (project in file("reactive-aws-dax/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-dax-core`, `reactive-aws-dax-test` % "test")

lazy val `reactive-aws-dax-monix` = (project in file("reactive-aws-dax/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-dax-core`, `reactive-aws-dax-test` % "test")

lazy val `reactive-aws-dax-akka` = (project in file("reactive-aws-dax/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-dax-core`, `reactive-aws-dax-test` % "test")

lazy val `reactive-aws-dax-root`: Project = (project in file("reactive-aws-dax"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-dax-project"
  )
  .aggregate(
    `reactive-aws-dax-core`,
    `reactive-aws-dax-test`,
    `reactive-aws-dax-akka`,
    `reactive-aws-dax-cats`,
    `reactive-aws-dax-monix`
  )

// --- elasticsearch

lazy val `reactive-aws-elasticsearch-test` = (project in file("reactive-aws-elasticsearch/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-elasticsearch-core` =
  (project in file("reactive-aws-elasticsearch/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`,
                                                     `reactive-aws-elasticsearch-test` % "test")

lazy val `reactive-aws-elasticsearch-cats` = (project in file("reactive-aws-elasticsearch/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-elasticsearch-core`, `reactive-aws-elasticsearch-test` % "test")

lazy val `reactive-aws-elasticsearch-monix` = (project in file("reactive-aws-elasticsearch/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-elasticsearch-core`, `reactive-aws-elasticsearch-test` % "test")

lazy val `reactive-aws-elasticsearch-akka` = (project in file("reactive-aws-elasticsearch/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-elasticsearch-core`, `reactive-aws-elasticsearch-test` % "test")

lazy val `reactive-aws-elasticsearch-root`: Project = (project in file("reactive-aws-elasticsearch"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-elasticsearch-project"
  )
  .aggregate(
    `reactive-aws-elasticsearch-core`,
    `reactive-aws-elasticsearch-test`,
    `reactive-aws-elasticsearch-akka`,
    `reactive-aws-elasticsearch-cats`,
    `reactive-aws-elasticsearch-monix`
  )

// --- elasticbeanstalk

lazy val `reactive-aws-elasticbeanstalk-test` = (project in file("reactive-aws-elasticbeanstalk/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-elasticbeanstalk-core` =
  (project in file("reactive-aws-elasticbeanstalk/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`,
                                                     `reactive-aws-elasticbeanstalk-test` % "test")

lazy val `reactive-aws-elasticbeanstalk-cats` = (project in file("reactive-aws-elasticbeanstalk/cats"))
  .dependsOn(`reactive-aws-common-cats`,
             `reactive-aws-elasticbeanstalk-core`,
             `reactive-aws-elasticbeanstalk-test` % "test")

lazy val `reactive-aws-elasticbeanstalk-monix` = (project in file("reactive-aws-elasticbeanstalk/monix"))
  .dependsOn(`reactive-aws-common-monix`,
             `reactive-aws-elasticbeanstalk-core`,
             `reactive-aws-elasticbeanstalk-test` % "test")

lazy val `reactive-aws-elasticbeanstalk-akka` = (project in file("reactive-aws-elasticbeanstalk/akka"))
  .dependsOn(`reactive-aws-common-akka`,
             `reactive-aws-elasticbeanstalk-core`,
             `reactive-aws-elasticbeanstalk-test` % "test")

lazy val `reactive-aws-elasticbeanstalk-root`: Project = (project in file("reactive-aws-elasticbeanstalk"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-elasticbeanstalk-project"
  )
  .aggregate(
    `reactive-aws-elasticbeanstalk-core`,
    `reactive-aws-elasticbeanstalk-test`,
    `reactive-aws-elasticbeanstalk-akka`,
    `reactive-aws-elasticbeanstalk-cats`,
    `reactive-aws-elasticbeanstalk-monix`
  )

// --- lambda

lazy val `reactive-aws-lambda-test` = (project in file("reactive-aws-lambda/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-lambda-core` =
  (project in file("reactive-aws-lambda/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-lambda-test` % "test")

lazy val `reactive-aws-lambda-cats` = (project in file("reactive-aws-lambda/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-lambda-core`, `reactive-aws-lambda-test` % "test")

lazy val `reactive-aws-lambda-monix` = (project in file("reactive-aws-lambda/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-lambda-core`, `reactive-aws-lambda-test` % "test")

lazy val `reactive-aws-lambda-akka` = (project in file("reactive-aws-lambda/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-lambda-core`, `reactive-aws-lambda-test` % "test")

lazy val `reactive-aws-lambda-root`: Project = (project in file("reactive-aws-lambda"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-lambda-project"
  )
  .aggregate(
    `reactive-aws-lambda-core`,
    `reactive-aws-lambda-test`,
    `reactive-aws-lambda-akka`,
    `reactive-aws-lambda-cats`,
    `reactive-aws-lambda-monix`
  )

// --- cloudwatch

lazy val `reactive-aws-cloudwatch-test` = (project in file("reactive-aws-cloudwatch/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-cloudwatch-core` =
  (project in file("reactive-aws-cloudwatch/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`,
                                                     `reactive-aws-cloudwatch-test` % "test")

lazy val `reactive-aws-cloudwatch-cats` = (project in file("reactive-aws-cloudwatch/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-cloudwatch-core`, `reactive-aws-cloudwatch-test` % "test")

lazy val `reactive-aws-cloudwatch-monix` = (project in file("reactive-aws-cloudwatch/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-cloudwatch-core`, `reactive-aws-cloudwatch-test` % "test")

lazy val `reactive-aws-cloudwatch-akka` = (project in file("reactive-aws-cloudwatch/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-cloudwatch-core`, `reactive-aws-cloudwatch-test` % "test")

lazy val `reactive-aws-cloudwatch-root`: Project = (project in file("reactive-aws-cloudwatch"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-cloudwatch-project"
  )
  .aggregate(
    `reactive-aws-cloudwatch-core`,
    `reactive-aws-cloudwatch-test`,
    `reactive-aws-cloudwatch-akka`,
    `reactive-aws-cloudwatch-cats`,
    `reactive-aws-cloudwatch-monix`
  )

// --- cloudwatchlogs

lazy val `reactive-aws-cloudwatchlogs-test` = (project in file("reactive-aws-cloudwatchlogs/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-cloudwatchlogs-core` =
  (project in file("reactive-aws-cloudwatchlogs/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`,
                                                     `reactive-aws-cloudwatchlogs-test` % "test")

lazy val `reactive-aws-cloudwatchlogs-cats` = (project in file("reactive-aws-cloudwatchlogs/cats"))
  .dependsOn(`reactive-aws-common-cats`,
             `reactive-aws-cloudwatchlogs-core`,
             `reactive-aws-cloudwatchlogs-test` % "test")

lazy val `reactive-aws-cloudwatchlogs-monix` = (project in file("reactive-aws-cloudwatchlogs/monix"))
  .dependsOn(`reactive-aws-common-monix`,
             `reactive-aws-cloudwatchlogs-core`,
             `reactive-aws-cloudwatchlogs-test` % "test")

lazy val `reactive-aws-cloudwatchlogs-akka` = (project in file("reactive-aws-cloudwatchlogs/akka"))
  .dependsOn(`reactive-aws-common-akka`,
             `reactive-aws-cloudwatchlogs-core`,
             `reactive-aws-cloudwatchlogs-test` % "test")

lazy val `reactive-aws-cloudwatchlogs-root`: Project = (project in file("reactive-aws-cloudwatchlogs"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-cloudwatchlogs-project"
  )
  .aggregate(
    `reactive-aws-cloudwatchlogs-core`,
    `reactive-aws-cloudwatchlogs-test`,
    `reactive-aws-cloudwatchlogs-akka`,
    `reactive-aws-cloudwatchlogs-cats`,
    `reactive-aws-cloudwatchlogs-monix`
  )

// --- cloudformation

lazy val `reactive-aws-cloudformation-test` = (project in file("reactive-aws-cloudformation/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-cloudformation-core` =
  (project in file("reactive-aws-cloudformation/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`,
                                                     `reactive-aws-cloudformation-test` % "test")

lazy val `reactive-aws-cloudformation-cats` = (project in file("reactive-aws-cloudformation/cats"))
  .dependsOn(`reactive-aws-common-cats`,
             `reactive-aws-cloudformation-core`,
             `reactive-aws-cloudformation-test` % "test")

lazy val `reactive-aws-cloudformation-monix` = (project in file("reactive-aws-cloudformation/monix"))
  .dependsOn(`reactive-aws-common-monix`,
             `reactive-aws-cloudformation-core`,
             `reactive-aws-cloudformation-test` % "test")

lazy val `reactive-aws-cloudformation-akka` = (project in file("reactive-aws-cloudformation/akka"))
  .dependsOn(`reactive-aws-common-akka`,
             `reactive-aws-cloudformation-core`,
             `reactive-aws-cloudformation-test` % "test")

lazy val `reactive-aws-cloudformation-root`: Project = (project in file("reactive-aws-cloudformation"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-cloudformation-project"
  )
  .aggregate(
    `reactive-aws-cloudformation-core`,
    `reactive-aws-cloudformation-test`,
    `reactive-aws-cloudformation-akka`,
    `reactive-aws-cloudformation-cats`,
    `reactive-aws-cloudformation-monix`
  )

// --- batch

lazy val `reactive-aws-batch-test` = (project in file("reactive-aws-batch/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-batch-core` =
  (project in file("reactive-aws-batch/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-batch-test` % "test")

lazy val `reactive-aws-batch-cats` = (project in file("reactive-aws-batch/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-batch-core`, `reactive-aws-batch-test` % "test")

lazy val `reactive-aws-batch-monix` = (project in file("reactive-aws-batch/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-batch-core`, `reactive-aws-batch-test` % "test")

lazy val `reactive-aws-batch-akka` = (project in file("reactive-aws-batch/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-batch-core`, `reactive-aws-batch-test` % "test")

lazy val `reactive-aws-batch-root`: Project = (project in file("reactive-aws-batch"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-batch-project"
  )
  .aggregate(
    `reactive-aws-batch-core`,
    `reactive-aws-batch-test`,
    `reactive-aws-batch-akka`,
    `reactive-aws-batch-cats`,
    `reactive-aws-batch-monix`
  )

// --- ec2

lazy val `reactive-aws-ec2-test` = (project in file("reactive-aws-ec2/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-ec2-core` =
  (project in file("reactive-aws-ec2/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-ec2-test` % "test")

lazy val `reactive-aws-ec2-cats` = (project in file("reactive-aws-ec2/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-ec2-core`, `reactive-aws-ec2-test` % "test")

lazy val `reactive-aws-ec2-monix` = (project in file("reactive-aws-ec2/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-ec2-core`, `reactive-aws-ec2-test` % "test")

lazy val `reactive-aws-ec2-akka` = (project in file("reactive-aws-ec2/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-ec2-core`, `reactive-aws-ec2-test` % "test")

lazy val `reactive-aws-ec2-root`: Project = (project in file("reactive-aws-ec2"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-ec2-project"
  )
  .aggregate(
    `reactive-aws-ec2-core`,
    `reactive-aws-ec2-test`,
    `reactive-aws-ec2-akka`,
    `reactive-aws-ec2-cats`,
    `reactive-aws-ec2-monix`
  )

// --- ecr

lazy val `reactive-aws-ecr-test` = (project in file("reactive-aws-ecr/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-ecr-core` =
  (project in file("reactive-aws-ecr/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-ecr-test` % "test")

lazy val `reactive-aws-ecr-cats` = (project in file("reactive-aws-ecr/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-ecr-core`, `reactive-aws-ecr-test` % "test")

lazy val `reactive-aws-ecr-monix` = (project in file("reactive-aws-ecr/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-ecr-core`, `reactive-aws-ecr-test` % "test")

lazy val `reactive-aws-ecr-akka` = (project in file("reactive-aws-ecr/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-ecr-core`, `reactive-aws-ecr-test` % "test")

lazy val `reactive-aws-ecr-root`: Project = (project in file("reactive-aws-ecr"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-ecr-project"
  )
  .aggregate(
    `reactive-aws-ecr-core`,
    `reactive-aws-ecr-test`,
    `reactive-aws-ecr-akka`,
    `reactive-aws-ecr-cats`,
    `reactive-aws-ecr-monix`
  )

// --- ecs

lazy val `reactive-aws-ecs-test` = (project in file("reactive-aws-ecs/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-ecs-core` =
  (project in file("reactive-aws-ecs/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-ecs-test` % "test")

lazy val `reactive-aws-ecs-cats` = (project in file("reactive-aws-ecs/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-ecs-core`, `reactive-aws-ecs-test` % "test")

lazy val `reactive-aws-ecs-monix` = (project in file("reactive-aws-ecs/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-ecs-core`, `reactive-aws-ecs-test` % "test")

lazy val `reactive-aws-ecs-akka` = (project in file("reactive-aws-ecs/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-ecs-core`, `reactive-aws-ecs-test` % "test")

lazy val `reactive-aws-ecs-root`: Project = (project in file("reactive-aws-ecs"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-ecs-project"
  )
  .aggregate(
    `reactive-aws-ecs-core`,
    `reactive-aws-ecs-test`,
    `reactive-aws-ecs-akka`,
    `reactive-aws-ecs-cats`,
    `reactive-aws-ecs-monix`
  )

// --- kms

lazy val `reactive-aws-kms-test` = (project in file("reactive-aws-kms/test"))
  .dependsOn(`reactive-aws-common-test`)

lazy val `reactive-aws-kms-core` =
  (project in file("reactive-aws-kms/core"))
    .dependsOn(`reactive-aws-common-core`).dependsOn(`reactive-aws-common-core`, `reactive-aws-kms-test` % "test")

lazy val `reactive-aws-kms-cats` = (project in file("reactive-aws-kms/cats"))
  .dependsOn(`reactive-aws-common-cats`, `reactive-aws-kms-core`, `reactive-aws-kms-test` % "test")

lazy val `reactive-aws-kms-monix` = (project in file("reactive-aws-kms/monix"))
  .dependsOn(`reactive-aws-common-monix`, `reactive-aws-kms-core`, `reactive-aws-kms-test` % "test")

lazy val `reactive-aws-kms-akka` = (project in file("reactive-aws-kms/akka"))
  .dependsOn(`reactive-aws-common-akka`, `reactive-aws-kms-core`, `reactive-aws-kms-test` % "test")

lazy val `reactive-aws-kms-root`: Project = (project in file("reactive-aws-kms"))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-kms-project"
  )
  .aggregate(
    `reactive-aws-kms-core`,
    `reactive-aws-kms-test`,
    `reactive-aws-kms-akka`,
    `reactive-aws-kms-cats`,
    `reactive-aws-kms-monix`
  )

lazy val `root`: Project = (project in file("."))
  .settings(coreSettings)
  .settings(
    name := "reactive-aws-client-project"
  )
  .aggregate(
    `reactive-aws-common-root`,
    `reactive-aws-dynamodb-root`,
    `reactive-aws-dax-root`,
    `reactive-aws-kinesis-root`,
    `reactive-aws-s3-root`,
    `reactive-aws-sqs-root`,
    `reactive-aws-appsync-root`,
    `reactive-aws-elasticsearch-root`,
    `reactive-aws-elasticbeanstalk-root`,
    `reactive-aws-lambda-root`,
    `reactive-aws-cloudwatch-root`,
    `reactive-aws-cloudwatchlogs-root`,
    `reactive-aws-cloudformation-root`,
    `reactive-aws-batch-root`,
    `reactive-aws-ec2-root`,
    `reactive-aws-ecr-root`,
    `reactive-aws-ecs-root`,
    `reactive-aws-kms-root`
  )
