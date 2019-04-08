// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeEventsRequestBuilderOps(val self: DescribeEventsRequest.Builder) extends AnyVal {

  final def sourceNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceName(v)
    }
  }

  final def sourceTypeAsScala(value: Option[SourceType]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceType(v)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def endTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  final def durationAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeEventsRequestOps(val self: DescribeEventsRequest) extends AnyVal {

  final def sourceNameAsScala: Option[String] = Option(self.sourceName)

  final def sourceTypeAsScala: Option[SourceType] = Option(self.sourceType)

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  final def durationAsScala: Option[Int] = Option(self.duration)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEventsRequestOps {

  implicit def toDescribeEventsRequestBuilderOps(v: DescribeEventsRequest.Builder): DescribeEventsRequestBuilderOps =
    new DescribeEventsRequestBuilderOps(v)

  implicit def toDescribeEventsRequestOps(v: DescribeEventsRequest): DescribeEventsRequestOps =
    new DescribeEventsRequestOps(v)

}
