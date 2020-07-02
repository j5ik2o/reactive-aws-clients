// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClassicLinkDnsSupportBuilderOps(val self: ClassicLinkDnsSupport.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def classicLinkDnsSupportedAsScala(value: Option[Boolean]): ClassicLinkDnsSupport.Builder = {
    value.fold(self) { v => self.classicLinkDnsSupported(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): ClassicLinkDnsSupport.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

}

final class ClassicLinkDnsSupportOps(val self: ClassicLinkDnsSupport) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def classicLinkDnsSupportedAsScala: Option[Boolean] = Option(self.classicLinkDnsSupported)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClassicLinkDnsSupportOps {

  implicit def toClassicLinkDnsSupportBuilderOps(v: ClassicLinkDnsSupport.Builder): ClassicLinkDnsSupportBuilderOps =
    new ClassicLinkDnsSupportBuilderOps(v)

  implicit def toClassicLinkDnsSupportOps(v: ClassicLinkDnsSupport): ClassicLinkDnsSupportOps =
    new ClassicLinkDnsSupportOps(v)

}
