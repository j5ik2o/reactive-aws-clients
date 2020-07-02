// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReportInstanceStatusRequestBuilderOps(val self: ReportInstanceStatusRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala(value: Option[java.time.Instant]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v => self.endTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesAsScala(value: Option[Seq[String]]): ReportInstanceStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonCodesAsScala(value: Option[Seq[ReportInstanceReasonCodes]]): ReportInstanceStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reasonCodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v => self.startTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ReportStatusType]): ReportInstanceStatusRequest.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class ReportInstanceStatusRequestOps(val self: ReportInstanceStatusRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesAsScala: Option[Seq[String]] =
    Option(self.instances).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonCodesAsScala: Option[Seq[ReportInstanceReasonCodes]] =
    Option(self.reasonCodes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
