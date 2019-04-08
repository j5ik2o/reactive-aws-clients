// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackSetRequestBuilderOps(val self: DeleteStackSetRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): DeleteStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

}

final class DeleteStackSetRequestOps(val self: DeleteStackSetRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackSetRequestOps {

  implicit def toDeleteStackSetRequestBuilderOps(v: DeleteStackSetRequest.Builder): DeleteStackSetRequestBuilderOps =
    new DeleteStackSetRequestBuilderOps(v)

  implicit def toDeleteStackSetRequestOps(v: DeleteStackSetRequest): DeleteStackSetRequestOps =
    new DeleteStackSetRequestOps(v)

}
