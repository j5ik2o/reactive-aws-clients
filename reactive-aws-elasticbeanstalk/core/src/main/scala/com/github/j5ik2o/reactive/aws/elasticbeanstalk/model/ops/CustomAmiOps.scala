// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CustomAmiBuilderOps(val self: CustomAmi.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualizationTypeAsScala(value: Option[String]): CustomAmi.Builder = {
    value.fold(self) { v => self.virtualizationType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): CustomAmi.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

}

final class CustomAmiOps(val self: CustomAmi) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualizationTypeAsScala: Option[String] = Option(self.virtualizationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCustomAmiOps {

  implicit def toCustomAmiBuilderOps(v: CustomAmi.Builder): CustomAmiBuilderOps = new CustomAmiBuilderOps(v)

  implicit def toCustomAmiOps(v: CustomAmi): CustomAmiOps = new CustomAmiOps(v)

}
