// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteChangeSetRequestBuilderOps(val self: DeleteChangeSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSetNameAsScala(value: Option[String]): DeleteChangeSetRequest.Builder = {
    value.fold(self) { v => self.changeSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): DeleteChangeSetRequest.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

}

final class DeleteChangeSetRequestOps(val self: DeleteChangeSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteChangeSetRequestOps {

  implicit def toDeleteChangeSetRequestBuilderOps(v: DeleteChangeSetRequest.Builder): DeleteChangeSetRequestBuilderOps =
    new DeleteChangeSetRequestBuilderOps(v)

  implicit def toDeleteChangeSetRequestOps(v: DeleteChangeSetRequest): DeleteChangeSetRequestOps =
    new DeleteChangeSetRequestOps(v)

}
