// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EventDescriptionBuilderOps(val self: EventDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventDateAsScala(value: Option[java.time.Instant]): EventDescription.Builder = {
    value.fold(self) { v => self.eventDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v => self.message(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v => self.versionLabel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v => self.templateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v => self.platformArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestIdAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v => self.requestId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severityAsScala(value: Option[EventSeverity]): EventDescription.Builder = {
    value.fold(self) { v => self.severity(v) }
  }

}

final class EventDescriptionOps(val self: EventDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventDateAsScala: Option[java.time.Instant] = Option(self.eventDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestIdAsScala: Option[String] = Option(self.requestId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severityAsScala: Option[EventSeverity] = Option(self.severity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEventDescriptionOps {

  implicit def toEventDescriptionBuilderOps(v: EventDescription.Builder): EventDescriptionBuilderOps =
    new EventDescriptionBuilderOps(v)

  implicit def toEventDescriptionOps(v: EventDescription): EventDescriptionOps = new EventDescriptionOps(v)

}
