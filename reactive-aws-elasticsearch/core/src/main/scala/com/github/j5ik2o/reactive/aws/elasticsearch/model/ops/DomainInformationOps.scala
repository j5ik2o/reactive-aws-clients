// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DomainInformationBuilderOps(val self: DomainInformation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): DomainInformation.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DomainInformation.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala(value: Option[String]): DomainInformation.Builder = {
    value.fold(self) { v => self.region(v) }
  }

}

final class DomainInformationOps(val self: DomainInformation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala: Option[String] = Option(self.region)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDomainInformationOps {

  implicit def toDomainInformationBuilderOps(v: DomainInformation.Builder): DomainInformationBuilderOps =
    new DomainInformationBuilderOps(v)

  implicit def toDomainInformationOps(v: DomainInformation): DomainInformationOps = new DomainInformationOps(v)

}
