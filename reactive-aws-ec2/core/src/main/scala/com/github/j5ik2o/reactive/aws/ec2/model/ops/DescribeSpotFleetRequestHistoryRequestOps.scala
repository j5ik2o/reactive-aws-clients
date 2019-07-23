// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotFleetRequestHistoryRequestBuilderOps(val self: DescribeSpotFleetRequestHistoryRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventTypeAsScala(value: Option[EventType]): DescribeSpotFleetRequestHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.eventType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeSpotFleetRequestHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeSpotFleetRequestHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala(value: Option[String]): DescribeSpotFleetRequestHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): DescribeSpotFleetRequestHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

}

final class DescribeSpotFleetRequestHistoryRequestOps(val self: DescribeSpotFleetRequestHistoryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventTypeAsScala: Option[EventType] = Option(self.eventType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotFleetRequestHistoryRequestOps {

  implicit def toDescribeSpotFleetRequestHistoryRequestBuilderOps(
      v: DescribeSpotFleetRequestHistoryRequest.Builder
  ): DescribeSpotFleetRequestHistoryRequestBuilderOps = new DescribeSpotFleetRequestHistoryRequestBuilderOps(v)

  implicit def toDescribeSpotFleetRequestHistoryRequestOps(
      v: DescribeSpotFleetRequestHistoryRequest
  ): DescribeSpotFleetRequestHistoryRequestOps = new DescribeSpotFleetRequestHistoryRequestOps(v)

}
