// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogEventsRequestBuilderOps(val self: GetLogEventsRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def logStreamNameAsScala(value: Option[String]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  }

  final def startTimeAsScala(value: Option[Long]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def endTimeAsScala(value: Option[Long]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def limitAsScala(value: Option[Int]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def startFromHeadAsScala(value: Option[Boolean]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startFromHead(v)
    }
  }

}

final class GetLogEventsRequestOps(val self: GetLogEventsRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  final def startTimeAsScala: Option[Long] = Option(self.startTime)

  final def endTimeAsScala: Option[Long] = Option(self.endTime)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def startFromHeadAsScala: Option[Boolean] = Option(self.startFromHead)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogEventsRequestOps {

  implicit def toGetLogEventsRequestBuilderOps(v: GetLogEventsRequest.Builder): GetLogEventsRequestBuilderOps =
    new GetLogEventsRequestBuilderOps(v)

  implicit def toGetLogEventsRequestOps(v: GetLogEventsRequest): GetLogEventsRequestOps = new GetLogEventsRequestOps(v)

}
