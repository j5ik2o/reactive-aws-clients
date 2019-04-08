// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListStreamsRequestBuilderOps(val self: ListStreamsRequest.Builder) extends AnyVal {

  final def limitAsScala(value: Option[Int]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def exclusiveStartStreamNameAsScala(value: Option[String]): ListStreamsRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartStreamName(v)
    }
  }

}

final class ListStreamsRequestOps(val self: ListStreamsRequest) extends AnyVal {

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def exclusiveStartStreamNameAsScala: Option[String] = Option(self.exclusiveStartStreamName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamsRequestOps {

  implicit def toListStreamsRequestBuilderOps(v: ListStreamsRequest.Builder): ListStreamsRequestBuilderOps =
    new ListStreamsRequestBuilderOps(v)

  implicit def toListStreamsRequestOps(v: ListStreamsRequest): ListStreamsRequestOps = new ListStreamsRequestOps(v)

}
