// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeEventsRequestBuilderOps(val self: DescribeEventsRequest.Builder) extends AnyVal {

  final def withSourceNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceName(v)
    }
  } // String

  final def withSourceTypeAsScala(value: Option[SourceType]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceType(v)
    }
  } // String

  final def withStartTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // Instant

  final def withEndTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  } // Instant

  final def withDurationAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  } // Int

  final def withMaxResultsAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def withNextTokenAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeEventsRequestOps(val self: DescribeEventsRequest) extends AnyVal {

  final def sourceNameAsScala: Option[String] = Option(self.sourceName) // String

  final def sourceTypeAsScala: Option[SourceType] = Option(self.sourceType) // String

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime) // Instant

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime) // Instant

  final def durationAsScala: Option[Int] = Option(self.duration) // Int

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEventsRequestOps {

  implicit def toDescribeEventsRequestBuilderOps(v: DescribeEventsRequest.Builder): DescribeEventsRequestBuilderOps =
    new DescribeEventsRequestBuilderOps(v)

  implicit def toDescribeEventsRequestOps(v: DescribeEventsRequest): DescribeEventsRequestOps =
    new DescribeEventsRequestOps(v)

}
