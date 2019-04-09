# reactive-dynamodb

AWS DynamoDB Client for Scala

## Installation

Add the following to your sbt build (Scala 2.11.x, 2.12.x):

```scala
resolvers += "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/"

val version = "..."

libraryDependencies += Seq(
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-core" % version,
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-monix" % version, // optional
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-akka" % version, // optional
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-cats" % version, // optional
)
```

## Usage

- default: scala.concurrent.Future

```scala
val client = DynamoDbAsyncClient(underlying)
val resultFuture = for {
  _ <- client.putItem(putRequest)
  result <- client.getItem(getRequest)
} yield result
val result = Awat.result(resultFuture, Duration.Inf)
```

- monix: monix.eval.Task

```scala
val client = DynamoDbMonixClient(underlying)
val resultFuture = (for {
  _ <- client.putItem(putRequest)
  result <- client.getItem(getRequest)
} yield result).runToFuture
val result = Awat.result(resultFuture, Duration.Inf)
```

- cats: cats.effect.IO

```scala
val client = DynamoDbCatsIOClient(underlying)
val resultFuture = (for{
  _ <- client.putItem(putRequest)
  result <- client.getItem(getRequest)
} yield result).unsafeToFuture()
val result = Awat.result(resultFuture, Duration.Inf)
```

- akka-stream: akka.scaladsl.Flow

```scala
val client = DynamoDbAkkaClient(underlying)
val resultFuture = Source.single(putRequest)
  .via(client.putItemFlow)
  .map{ _ => getRequest }
  .via(client.getItemFlow).runWith(Sink.head)
val result = Awat.result(resultFuture, Duration.Inf)
```

