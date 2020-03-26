// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ProviderBuilderOps(val self: Provider.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyArnAsScala(value: Option[String]): Provider.Builder = {
    value.fold(self) { v =>
      self.keyArn(v)
    }
  }

}

final class ProviderOps(val self: Provider) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyArnAsScala: Option[String] = Option(self.keyArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProviderOps {

  implicit def toProviderBuilderOps(v: Provider.Builder): ProviderBuilderOps = new ProviderBuilderOps(v)

  implicit def toProviderOps(v: Provider): ProviderOps = new ProviderOps(v)

}
