// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListShardsRequestBuilderOps(val self: ListShardsRequest.Builder) extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withNextTokenAsScala(value: Option[String]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withExclusiveStartShardIdAsScala(value: Option[String]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartShardId(v)
    }
  } // String

  final def withMaxResultsAsScala(value: Option[Int]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def withStreamCreationTimestampAsScala(value: Option[java.time.Instant]): ListShardsRequest.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  } // Instant

}

final class ListShardsRequestOps(val self: ListShardsRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def exclusiveStartShardIdAsScala: Option[String] = Option(self.exclusiveStartShardId) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListShardsRequestOps {

  implicit def toListShardsRequestBuilderOps(v: ListShardsRequest.Builder): ListShardsRequestBuilderOps =
    new ListShardsRequestBuilderOps(v)

  implicit def toListShardsRequestOps(v: ListShardsRequest): ListShardsRequestOps = new ListShardsRequestOps(v)

}
