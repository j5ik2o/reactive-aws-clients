// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class CreateStreamRequestBuilderOps(val self: CreateStreamRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): CreateStreamRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def shardCountAsScala(value: Option[Int]): CreateStreamRequest.Builder = {
    value.fold(self) { v =>
      self.shardCount(v)
    }
  }

}

final class CreateStreamRequestOps(val self: CreateStreamRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def shardCountAsScala: Option[Int] = Option(self.shardCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStreamRequestOps {

  implicit def toCreateStreamRequestBuilderOps(v: CreateStreamRequest.Builder): CreateStreamRequestBuilderOps =
    new CreateStreamRequestBuilderOps(v)

  implicit def toCreateStreamRequestOps(v: CreateStreamRequest): CreateStreamRequestOps = new CreateStreamRequestOps(v)

}
