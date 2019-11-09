// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IKEVersionsRequestListValueBuilderOps(val self: IKEVersionsRequestListValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): IKEVersionsRequestListValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class IKEVersionsRequestListValueOps(val self: IKEVersionsRequestListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIKEVersionsRequestListValueOps {

  implicit def toIKEVersionsRequestListValueBuilderOps(
      v: IKEVersionsRequestListValue.Builder
  ): IKEVersionsRequestListValueBuilderOps = new IKEVersionsRequestListValueBuilderOps(v)

  implicit def toIKEVersionsRequestListValueOps(v: IKEVersionsRequestListValue): IKEVersionsRequestListValueOps =
    new IKEVersionsRequestListValueOps(v)

}
