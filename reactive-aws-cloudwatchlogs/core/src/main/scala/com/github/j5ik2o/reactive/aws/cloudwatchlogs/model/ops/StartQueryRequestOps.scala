// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class StartQueryRequestBuilderOps(val self: StartQueryRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def startTimeAsScala(value: Option[Long]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // Long

  final def endTimeAsScala(value: Option[Long]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  } // Long

  final def queryStringAsScala(value: Option[String]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.queryString(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

}

final class StartQueryRequestOps(val self: StartQueryRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def startTimeAsScala: Option[Long] = Option(self.startTime) // Long

  final def endTimeAsScala: Option[Long] = Option(self.endTime) // Long

  final def queryStringAsScala: Option[String] = Option(self.queryString) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartQueryRequestOps {

  implicit def toStartQueryRequestBuilderOps(v: StartQueryRequest.Builder): StartQueryRequestBuilderOps =
    new StartQueryRequestBuilderOps(v)

  implicit def toStartQueryRequestOps(v: StartQueryRequest): StartQueryRequestOps = new StartQueryRequestOps(v)

}
