// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListStreamConsumersRequestBuilderOps(val self: ListStreamConsumersRequest.Builder) extends AnyVal {

  final def streamARNAsScala(value: Option[String]): ListStreamConsumersRequest.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListStreamConsumersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): ListStreamConsumersRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def streamCreationTimestampAsScala(value: Option[java.time.Instant]): ListStreamConsumersRequest.Builder = {
    value.fold(self) { v =>
      self.streamCreationTimestamp(v)
    }
  } // Instant

}

final class ListStreamConsumersRequestOps(val self: ListStreamConsumersRequest) extends AnyVal {

  final def streamARNAsScala: Option[String] = Option(self.streamARN) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamConsumersRequestOps {

  implicit def toListStreamConsumersRequestBuilderOps(
      v: ListStreamConsumersRequest.Builder
  ): ListStreamConsumersRequestBuilderOps = new ListStreamConsumersRequestBuilderOps(v)

  implicit def toListStreamConsumersRequestOps(v: ListStreamConsumersRequest): ListStreamConsumersRequestOps =
    new ListStreamConsumersRequestOps(v)

}
