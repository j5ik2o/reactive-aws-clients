// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogEventsRequestBuilderOps(val self: GetLogEventsRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def logStreamNameAsScala(value: Option[String]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  } // String

  final def startTimeAsScala(value: Option[Long]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // Long

  final def endTimeAsScala(value: Option[Long]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  } // Long

  final def nextTokenAsScala(value: Option[String]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def startFromHeadAsScala(value: Option[Boolean]): GetLogEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startFromHead(v)
    }
  } // Boolean

}

final class GetLogEventsRequestOps(val self: GetLogEventsRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName) // String

  final def startTimeAsScala: Option[Long] = Option(self.startTime) // Long

  final def endTimeAsScala: Option[Long] = Option(self.endTime) // Long

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def startFromHeadAsScala: Option[Boolean] = Option(self.startFromHead) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogEventsRequestOps {

  implicit def toGetLogEventsRequestBuilderOps(v: GetLogEventsRequest.Builder): GetLogEventsRequestBuilderOps =
    new GetLogEventsRequestBuilderOps(v)

  implicit def toGetLogEventsRequestOps(v: GetLogEventsRequest): GetLogEventsRequestOps = new GetLogEventsRequestOps(v)

}
