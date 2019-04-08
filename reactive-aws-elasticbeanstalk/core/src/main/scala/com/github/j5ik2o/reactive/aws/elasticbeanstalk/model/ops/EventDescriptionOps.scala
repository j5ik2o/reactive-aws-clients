// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EventDescriptionBuilderOps(val self: EventDescription.Builder) extends AnyVal {

  final def eventDateAsScala(value: Option[java.time.Instant]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.eventDate(v)
    }
  } // java.time.Instant

  final def messageAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

  final def applicationNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def versionLabelAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def requestIdAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.requestId(v)
    }
  } // String

  final def severityAsScala(value: Option[EventSeverity]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.severity(v)
    }
  } // EventSeverity

}

final class EventDescriptionOps(val self: EventDescription) extends AnyVal {

  final def eventDateAsScala: Option[java.time.Instant] = Option(self.eventDate) // java.time.Instant

  final def messageAsScala: Option[String] = Option(self.message) // String

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def requestIdAsScala: Option[String] = Option(self.requestId) // String

  final def severityAsScala: Option[EventSeverity] = Option(self.severity) // EventSeverity

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEventDescriptionOps {

  implicit def toEventDescriptionBuilderOps(v: EventDescription.Builder): EventDescriptionBuilderOps =
    new EventDescriptionBuilderOps(v)

  implicit def toEventDescriptionOps(v: EventDescription): EventDescriptionOps = new EventDescriptionOps(v)

}
