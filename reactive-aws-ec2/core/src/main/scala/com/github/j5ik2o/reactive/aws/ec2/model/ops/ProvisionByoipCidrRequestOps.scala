// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ProvisionByoipCidrRequestBuilderOps(val self: ProvisionByoipCidrRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala(value: Option[String]): ProvisionByoipCidrRequest.Builder = {
    value.fold(self) { v => self.cidr(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAuthorizationContextAsScala(
      value: Option[CidrAuthorizationContext]
  ): ProvisionByoipCidrRequest.Builder = {
    value.fold(self) { v => self.cidrAuthorizationContext(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publiclyAdvertisableAsScala(value: Option[Boolean]): ProvisionByoipCidrRequest.Builder = {
    value.fold(self) { v => self.publiclyAdvertisable(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ProvisionByoipCidrRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolTagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): ProvisionByoipCidrRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.poolTagSpecifications(v.asJava)
    }
  }

}

final class ProvisionByoipCidrRequestOps(val self: ProvisionByoipCidrRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala: Option[String] = Option(self.cidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAuthorizationContextAsScala: Option[CidrAuthorizationContext] = Option(self.cidrAuthorizationContext)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publiclyAdvertisableAsScala: Option[Boolean] = Option(self.publiclyAdvertisable)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolTagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.poolTagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionByoipCidrRequestOps {

  implicit def toProvisionByoipCidrRequestBuilderOps(
      v: ProvisionByoipCidrRequest.Builder
  ): ProvisionByoipCidrRequestBuilderOps = new ProvisionByoipCidrRequestBuilderOps(v)

  implicit def toProvisionByoipCidrRequestOps(v: ProvisionByoipCidrRequest): ProvisionByoipCidrRequestOps =
    new ProvisionByoipCidrRequestOps(v)

}
