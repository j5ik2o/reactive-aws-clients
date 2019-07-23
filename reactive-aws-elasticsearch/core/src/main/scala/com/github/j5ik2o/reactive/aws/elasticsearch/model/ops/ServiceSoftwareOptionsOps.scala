// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ServiceSoftwareOptionsBuilderOps(val self: ServiceSoftwareOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentVersionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.currentVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newVersionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.newVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAvailableAsScala(value: Option[Boolean]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.updateAvailable(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cancellableAsScala(value: Option[Boolean]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.cancellable(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateStatusAsScala(value: Option[DeploymentStatus]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.updateStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def automatedUpdateDateAsScala(value: Option[java.time.Instant]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.automatedUpdateDate(v)
    }
  }

}

final class ServiceSoftwareOptionsOps(val self: ServiceSoftwareOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentVersionAsScala: Option[String] = Option(self.currentVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newVersionAsScala: Option[String] = Option(self.newVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAvailableAsScala: Option[Boolean] = Option(self.updateAvailable)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cancellableAsScala: Option[Boolean] = Option(self.cancellable)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateStatusAsScala: Option[DeploymentStatus] = Option(self.updateStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def automatedUpdateDateAsScala: Option[java.time.Instant] = Option(self.automatedUpdateDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceSoftwareOptionsOps {

  implicit def toServiceSoftwareOptionsBuilderOps(v: ServiceSoftwareOptions.Builder): ServiceSoftwareOptionsBuilderOps =
    new ServiceSoftwareOptionsBuilderOps(v)

  implicit def toServiceSoftwareOptionsOps(v: ServiceSoftwareOptions): ServiceSoftwareOptionsOps =
    new ServiceSoftwareOptionsOps(v)

}
