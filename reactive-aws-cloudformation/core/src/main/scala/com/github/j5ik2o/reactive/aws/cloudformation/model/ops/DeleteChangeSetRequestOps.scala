// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteChangeSetRequestBuilderOps(val self: DeleteChangeSetRequest.Builder) extends AnyVal {

  final def changeSetNameAsScala(value: Option[String]): DeleteChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): DeleteChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

}

final class DeleteChangeSetRequestOps(val self: DeleteChangeSetRequest) extends AnyVal {

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteChangeSetRequestOps {

  implicit def toDeleteChangeSetRequestBuilderOps(v: DeleteChangeSetRequest.Builder): DeleteChangeSetRequestBuilderOps =
    new DeleteChangeSetRequestBuilderOps(v)

  implicit def toDeleteChangeSetRequestOps(v: DeleteChangeSetRequest): DeleteChangeSetRequestOps =
    new DeleteChangeSetRequestOps(v)

}
