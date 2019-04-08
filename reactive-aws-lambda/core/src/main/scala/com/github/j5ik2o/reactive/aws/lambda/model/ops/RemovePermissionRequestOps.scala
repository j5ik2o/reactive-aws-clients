// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class RemovePermissionRequestBuilderOps(val self: RemovePermissionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def statementIdAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  }

  final def qualifierAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class RemovePermissionRequestOps(val self: RemovePermissionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def statementIdAsScala: Option[String] = Option(self.statementId)

  final def qualifierAsScala: Option[String] = Option(self.qualifier)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemovePermissionRequestOps {

  implicit def toRemovePermissionRequestBuilderOps(
      v: RemovePermissionRequest.Builder
  ): RemovePermissionRequestBuilderOps = new RemovePermissionRequestBuilderOps(v)

  implicit def toRemovePermissionRequestOps(v: RemovePermissionRequest): RemovePermissionRequestOps =
    new RemovePermissionRequestOps(v)

}
