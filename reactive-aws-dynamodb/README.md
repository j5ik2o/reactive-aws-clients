# reactive-dynamodb

AWS DynamoDB Client for Scala

## Installation

Add the following to your sbt build (Scala 2.11.x, 2.12.x):

```scala
resolvers += "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/"

val version = "..."

libraryDependencies += Seq(
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-v2" % version,
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-v2-monix" % version, // optional
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-v2-akka" % version, // optional
  "com.github.j5ik2o" %% "reactive-aws-dynamodb-v2-cats" % version, // optional
)
```

The module has `reactive-dynamodb-v2` prefix supports [aws-sdk of version 2](https://github.com/aws/aws-sdk-java-v2).
If need legacy aws-sdk, choose `reactive-dynamodb-v1` modules. `reactive-dynamodb-cats`,`reactive-dynamodb-monix`,`reactive-dynamodb-akka` can be used with either v1 or v2

## Usage

- default: scala.concurrent.Future

```scala
val client = DynamoDBAsyncClientV2(underlying)
val resultFuture = for {
  _ <- client.putItem(putRequest)
  result <- client.getItem(getRequest)
} yield result
val result = Awat.result(resultFuture, Duration.Inf)
```

- monix: monix.eval.Task

```scala
val client = DynamoDBTaskClientV2(underlying)
val resultFuture = (for {
  _ <- client.putItem(putRequest)
  result <- client.getItem(getRequest)
} yield result).runToFuture
val result = Awat.result(resultFuture, Duration.Inf)
```

- cats: cats.data.ReaderT

```scala
val ec: ExecutionContext = ...
val client = DynamoDBAsyncClientV2(underlying)
val resultFuture = (for{
  _ <- client.putItem(putRequest)
  result <- client.getItem(getRequest)
} yield result).run(ec)
val result = Awat.result(resultFuture, Duration.Inf)
```

- akka-stream: akka.scaladsl.Flow

```scala
val client = DynamoDBStreamClientV2(underlying)
val resultFuture = Source.single(putRequest)
  .via(client.putItemFlow)
  .map{ _ => getRequest }
  .via(client.getItemFlow).runWith(Sink.head)
val result = Awat.result(resultFuture, Duration.Inf)
```

