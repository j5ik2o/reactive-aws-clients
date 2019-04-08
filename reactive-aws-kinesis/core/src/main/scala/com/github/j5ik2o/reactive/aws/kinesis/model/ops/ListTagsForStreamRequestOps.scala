// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListTagsForStreamRequestBuilderOps(val self: ListTagsForStreamRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): ListTagsForStreamRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def exclusiveStartTagKeyAsScala(value: Option[String]): ListTagsForStreamRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartTagKey(v)
    }
  }

  final def limitAsScala(value: Option[Int]): ListTagsForStreamRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

}

final class ListTagsForStreamRequestOps(val self: ListTagsForStreamRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def exclusiveStartTagKeyAsScala: Option[String] = Option(self.exclusiveStartTagKey)

  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForStreamRequestOps {

  implicit def toListTagsForStreamRequestBuilderOps(
      v: ListTagsForStreamRequest.Builder
  ): ListTagsForStreamRequestBuilderOps = new ListTagsForStreamRequestBuilderOps(v)

  implicit def toListTagsForStreamRequestOps(v: ListTagsForStreamRequest): ListTagsForStreamRequestOps =
    new ListTagsForStreamRequestOps(v)

}
