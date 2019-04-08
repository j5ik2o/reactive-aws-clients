// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ServiceSoftwareOptionsBuilderOps(val self: ServiceSoftwareOptions.Builder) extends AnyVal {

  final def currentVersionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.currentVersion(v)
    }
  }

  final def newVersionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.newVersion(v)
    }
  }

  final def updateAvailableAsScala(value: Option[Boolean]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.updateAvailable(v)
    }
  }

  final def cancellableAsScala(value: Option[Boolean]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.cancellable(v)
    }
  }

  final def updateStatusAsScala(value: Option[DeploymentStatus]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.updateStatus(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def automatedUpdateDateAsScala(value: Option[java.time.Instant]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.automatedUpdateDate(v)
    }
  }

}

final class ServiceSoftwareOptionsOps(val self: ServiceSoftwareOptions) extends AnyVal {

  final def currentVersionAsScala: Option[String] = Option(self.currentVersion)

  final def newVersionAsScala: Option[String] = Option(self.newVersion)

  final def updateAvailableAsScala: Option[Boolean] = Option(self.updateAvailable)

  final def cancellableAsScala: Option[Boolean] = Option(self.cancellable)

  final def updateStatusAsScala: Option[DeploymentStatus] = Option(self.updateStatus)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def automatedUpdateDateAsScala: Option[java.time.Instant] = Option(self.automatedUpdateDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceSoftwareOptionsOps {

  implicit def toServiceSoftwareOptionsBuilderOps(v: ServiceSoftwareOptions.Builder): ServiceSoftwareOptionsBuilderOps =
    new ServiceSoftwareOptionsBuilderOps(v)

  implicit def toServiceSoftwareOptionsOps(v: ServiceSoftwareOptions): ServiceSoftwareOptionsOps =
    new ServiceSoftwareOptionsOps(v)

}
