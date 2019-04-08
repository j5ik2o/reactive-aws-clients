// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReportInstanceStatusRequestBuilderOps(val self: ReportInstanceStatusRequest.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def endTimeAsScala(value: Option[java.time.Instant]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  final def instancesAsScala(value: Option[Seq[String]]): ReportInstanceStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    }
  }

  final def reasonCodesAsScala(value: Option[Seq[ReportInstanceReasonCodes]]): ReportInstanceStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reasonCodes(v.asJava)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def statusAsScala(value: Option[ReportStatusType]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ReportInstanceStatusRequestOps(val self: ReportInstanceStatusRequest) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  final def instancesAsScala: Option[Seq[String]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def reasonCodesAsScala: Option[Seq[ReportInstanceReasonCodes]] = Option(self.reasonCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  final def statusAsScala: Option[ReportStatusType] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReportInstanceStatusRequestOps {

  implicit def toReportInstanceStatusRequestBuilderOps(
      v: ReportInstanceStatusRequest.Builder
  ): ReportInstanceStatusRequestBuilderOps = new ReportInstanceStatusRequestBuilderOps(v)

  implicit def toReportInstanceStatusRequestOps(v: ReportInstanceStatusRequest): ReportInstanceStatusRequestOps =
    new ReportInstanceStatusRequestOps(v)

}
