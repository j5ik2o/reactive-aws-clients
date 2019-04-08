// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EventDescriptionBuilderOps(val self: EventDescription.Builder) extends AnyVal {

  final def eventDateAsScala(value: Option[java.time.Instant]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.eventDate(v)
    }
  }

  final def messageAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  final def applicationNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def requestIdAsScala(value: Option[String]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.requestId(v)
    }
  }

  final def severityAsScala(value: Option[EventSeverity]): EventDescription.Builder = {
    value.fold(self) { v =>
      self.severity(v)
    }
  }

}

final class EventDescriptionOps(val self: EventDescription) extends AnyVal {

  final def eventDateAsScala: Option[java.time.Instant] = Option(self.eventDate)

  final def messageAsScala: Option[String] = Option(self.message)

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def requestIdAsScala: Option[String] = Option(self.requestId)

  final def severityAsScala: Option[EventSeverity] = Option(self.severity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEventDescriptionOps {

  implicit def toEventDescriptionBuilderOps(v: EventDescription.Builder): EventDescriptionBuilderOps =
    new EventDescriptionBuilderOps(v)

  implicit def toEventDescriptionOps(v: EventDescription): EventDescriptionOps = new EventDescriptionOps(v)

}
