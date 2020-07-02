// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class BundleTaskErrorBuilderOps(val self: BundleTaskError.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): BundleTaskError.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): BundleTaskError.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class BundleTaskErrorOps(val self: BundleTaskError) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBundleTaskErrorOps {

  implicit def toBundleTaskErrorBuilderOps(v: BundleTaskError.Builder): BundleTaskErrorBuilderOps =
    new BundleTaskErrorBuilderOps(v)

  implicit def toBundleTaskErrorOps(v: BundleTaskError): BundleTaskErrorOps = new BundleTaskErrorOps(v)

}
