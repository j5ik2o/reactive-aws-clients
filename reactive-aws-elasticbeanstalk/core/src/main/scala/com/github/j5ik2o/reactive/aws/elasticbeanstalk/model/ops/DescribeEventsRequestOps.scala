// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEventsRequestBuilderOps(val self: DescribeEventsRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def versionLabelAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def environmentIdAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def requestIdAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.requestId(v)
    }
  } // String

  final def severityAsScala(value: Option[EventSeverity]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.severity(v)
    }
  } // EventSeverity

  final def startTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  } // java.time.Instant

  final def endTimeAsScala(value: Option[java.time.Instant]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  } // java.time.Instant

  final def maxRecordsAsScala(value: Option[Int]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeEventsRequestOps(val self: DescribeEventsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def environmentIdAsScala: Option[String] = Option(self.environmentId) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def requestIdAsScala: Option[String] = Option(self.requestId) // String

  final def severityAsScala: Option[EventSeverity] = Option(self.severity) // EventSeverity

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime) // java.time.Instant

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime) // java.time.Instant

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEventsRequestOps {

  implicit def toDescribeEventsRequestBuilderOps(v: DescribeEventsRequest.Builder): DescribeEventsRequestBuilderOps =
    new DescribeEventsRequestBuilderOps(v)

  implicit def toDescribeEventsRequestOps(v: DescribeEventsRequest): DescribeEventsRequestOps =
    new DescribeEventsRequestOps(v)

}
