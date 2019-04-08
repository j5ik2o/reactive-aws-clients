// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class RemovePermissionRequestBuilderOps(val self: RemovePermissionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def statementIdAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  } // String

  final def qualifierAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  } // String

  final def revisionIdAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class RemovePermissionRequestOps(val self: RemovePermissionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def statementIdAsScala: Option[String] = Option(self.statementId) // String

  final def qualifierAsScala: Option[String] = Option(self.qualifier) // String

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemovePermissionRequestOps {

  implicit def toRemovePermissionRequestBuilderOps(
      v: RemovePermissionRequest.Builder
  ): RemovePermissionRequestBuilderOps = new RemovePermissionRequestBuilderOps(v)

  implicit def toRemovePermissionRequestOps(v: RemovePermissionRequest): RemovePermissionRequestOps =
    new RemovePermissionRequestOps(v)

}
