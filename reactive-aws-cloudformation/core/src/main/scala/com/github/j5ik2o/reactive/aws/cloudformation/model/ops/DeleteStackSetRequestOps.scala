// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackSetRequestBuilderOps(val self: DeleteStackSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): DeleteStackSetRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

}

final class DeleteStackSetRequestOps(val self: DeleteStackSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackSetRequestOps {

  implicit def toDeleteStackSetRequestBuilderOps(v: DeleteStackSetRequest.Builder): DeleteStackSetRequestBuilderOps =
    new DeleteStackSetRequestBuilderOps(v)

  implicit def toDeleteStackSetRequestOps(v: DeleteStackSetRequest): DeleteStackSetRequestOps =
    new DeleteStackSetRequestOps(v)

}
