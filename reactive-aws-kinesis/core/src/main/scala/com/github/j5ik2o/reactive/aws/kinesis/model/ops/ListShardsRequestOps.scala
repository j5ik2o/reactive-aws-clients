// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListShardsRequestBuilderOps(val self: ListShardsRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def exclusiveStartShardIdAsScala(value: Option[String]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartShardId(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def streamCreationTimestampAsScala(value: Option[java.time.Instant]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  }

}

final class ListShardsRequestOps(val self: ListShardsRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def exclusiveStartShardIdAsScala: Option[String] = Option(self.exclusiveStartShardId)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListShardsRequestOps {

  implicit def toListShardsRequestBuilderOps(v: ListShardsRequest.Builder): ListShardsRequestBuilderOps =
    new ListShardsRequestBuilderOps(v)

  implicit def toListShardsRequestOps(v: ListShardsRequest): ListShardsRequestOps = new ListShardsRequestOps(v)

}
