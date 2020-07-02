// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class FunctionCodeLocationBuilderOps(val self: FunctionCodeLocation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryTypeAsScala(value: Option[String]): FunctionCodeLocation.Builder = {
    value.fold(self) { v => self.repositoryType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala(value: Option[String]): FunctionCodeLocation.Builder = {
    value.fold(self) { v => self.location(v) }
  }

}

final class FunctionCodeLocationOps(val self: FunctionCodeLocation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryTypeAsScala: Option[String] = Option(self.repositoryType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala: Option[String] = Option(self.location)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFunctionCodeLocationOps {

  implicit def toFunctionCodeLocationBuilderOps(v: FunctionCodeLocation.Builder): FunctionCodeLocationBuilderOps =
    new FunctionCodeLocationBuilderOps(v)

  implicit def toFunctionCodeLocationOps(v: FunctionCodeLocation): FunctionCodeLocationOps =
    new FunctionCodeLocationOps(v)

}
