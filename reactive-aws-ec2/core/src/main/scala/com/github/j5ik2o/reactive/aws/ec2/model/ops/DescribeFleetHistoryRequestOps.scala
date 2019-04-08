// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetHistoryRequestBuilderOps(val self: DescribeFleetHistoryRequest.Builder) extends AnyVal {

  final def eventTypeAsScala(value: Option[FleetEventType]): DescribeFleetHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.eventType(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeFleetHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeFleetHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def fleetIdAsScala(value: Option[String]): DescribeFleetHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): DescribeFleetHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

}

final class DescribeFleetHistoryRequestOps(val self: DescribeFleetHistoryRequest) extends AnyVal {

  final def eventTypeAsScala: Option[FleetEventType] = Option(self.eventType)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetHistoryRequestOps {

  implicit def toDescribeFleetHistoryRequestBuilderOps(
      v: DescribeFleetHistoryRequest.Builder
  ): DescribeFleetHistoryRequestBuilderOps = new DescribeFleetHistoryRequestBuilderOps(v)

  implicit def toDescribeFleetHistoryRequestOps(v: DescribeFleetHistoryRequest): DescribeFleetHistoryRequestOps =
    new DescribeFleetHistoryRequestOps(v)

}
