// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeEventsRequestBuilderOps(val self: DescribeEventsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTypeAsScala(value: Option[SourceType]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.sourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.duration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeEventsRequestOps(val self: DescribeEventsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceNameAsScala: Option[String] = Option(self.sourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTypeAsScala: Option[SourceType] = Option(self.sourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationAsScala: Option[Int] = Option(self.duration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEventsRequestOps {

  implicit def toDescribeEventsRequestBuilderOps(v: DescribeEventsRequest.Builder): DescribeEventsRequestBuilderOps =
    new DescribeEventsRequestBuilderOps(v)

  implicit def toDescribeEventsRequestOps(v: DescribeEventsRequest): DescribeEventsRequestOps =
    new DescribeEventsRequestOps(v)

}
