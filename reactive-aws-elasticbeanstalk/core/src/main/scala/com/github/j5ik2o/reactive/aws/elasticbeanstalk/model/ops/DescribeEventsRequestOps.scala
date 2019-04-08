// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEventsRequestBuilderOps(val self: DescribeEventsRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def environmentIdAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def requestIdAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.requestId(v)
    }
  }

  final def severityAsScala(value: Option[EventSeverity]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.severity(v)
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

  final def maxRecordsAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeEventsRequestOps(val self: DescribeEventsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def requestIdAsScala: Option[String] = Option(self.requestId)

  final def severityAsScala: Option[EventSeverity] = Option(self.severity)

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEventsRequestOps {

  implicit def toDescribeEventsRequestBuilderOps(v: DescribeEventsRequest.Builder): DescribeEventsRequestBuilderOps =
    new DescribeEventsRequestBuilderOps(v)

  implicit def toDescribeEventsRequestOps(v: DescribeEventsRequest): DescribeEventsRequestOps =
    new DescribeEventsRequestOps(v)

}
