// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddPermissionRequestBuilderOps(val self: AddPermissionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def statementIdAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  }

  final def actionAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  }

  final def principalAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.principal(v)
    }
  }

  final def sourceArnAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceArn(v)
    }
  }

  final def sourceAccountAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceAccount(v)
    }
  }

  final def eventSourceTokenAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceToken(v)
    }
  }

  final def qualifierAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class AddPermissionRequestOps(val self: AddPermissionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def statementIdAsScala: Option[String] = Option(self.statementId)

  final def actionAsScala: Option[String] = Option(self.action)

  final def principalAsScala: Option[String] = Option(self.principal)

  final def sourceArnAsScala: Option[String] = Option(self.sourceArn)

  final def sourceAccountAsScala: Option[String] = Option(self.sourceAccount)

  final def eventSourceTokenAsScala: Option[String] = Option(self.eventSourceToken)

  final def qualifierAsScala: Option[String] = Option(self.qualifier)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionRequestOps {

  implicit def toAddPermissionRequestBuilderOps(v: AddPermissionRequest.Builder): AddPermissionRequestBuilderOps =
    new AddPermissionRequestBuilderOps(v)

  implicit def toAddPermissionRequestOps(v: AddPermissionRequest): AddPermissionRequestOps =
    new AddPermissionRequestOps(v)

}
