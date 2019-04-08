// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ServiceSoftwareOptionsBuilderOps(val self: ServiceSoftwareOptions.Builder) extends AnyVal {

  final def currentVersionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.currentVersion(v)
    }
  } // String

  final def newVersionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.newVersion(v)
    }
  } // String

  final def updateAvailableAsScala(value: Option[Boolean]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.updateAvailable(v)
    }
  } // Boolean

  final def cancellableAsScala(value: Option[Boolean]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.cancellable(v)
    }
  } // Boolean

  final def updateStatusAsScala(value: Option[DeploymentStatus]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.updateStatus(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def automatedUpdateDateAsScala(value: Option[java.time.Instant]): ServiceSoftwareOptions.Builder = {
    value.fold(self) { v =>
      self.automatedUpdateDate(v)
    }
  } // Instant

}

final class ServiceSoftwareOptionsOps(val self: ServiceSoftwareOptions) extends AnyVal {

  final def currentVersionAsScala: Option[String] = Option(self.currentVersion) // String

  final def newVersionAsScala: Option[String] = Option(self.newVersion) // String

  final def updateAvailableAsScala: Option[Boolean] = Option(self.updateAvailable) // Boolean

  final def cancellableAsScala: Option[Boolean] = Option(self.cancellable) // Boolean

  final def updateStatusAsScala: Option[DeploymentStatus] = Option(self.updateStatus) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def automatedUpdateDateAsScala: Option[java.time.Instant] = Option(self.automatedUpdateDate) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceSoftwareOptionsOps {

  implicit def toServiceSoftwareOptionsBuilderOps(v: ServiceSoftwareOptions.Builder): ServiceSoftwareOptionsBuilderOps =
    new ServiceSoftwareOptionsBuilderOps(v)

  implicit def toServiceSoftwareOptionsOps(v: ServiceSoftwareOptions): ServiceSoftwareOptionsOps =
    new ServiceSoftwareOptionsOps(v)

}
