// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddPermissionRequestBuilderOps(val self: AddPermissionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def statementIdAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.statementId(v)
    }
  } // String

  final def actionAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  } // String

  final def principalAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.principal(v)
    }
  } // String

  final def sourceArnAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceArn(v)
    }
  } // String

  final def sourceAccountAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceAccount(v)
    }
  } // String

  final def eventSourceTokenAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceToken(v)
    }
  } // String

  final def qualifierAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  } // String

  final def revisionIdAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class AddPermissionRequestOps(val self: AddPermissionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def statementIdAsScala: Option[String] = Option(self.statementId) // String

  final def actionAsScala: Option[String] = Option(self.action) // String

  final def principalAsScala: Option[String] = Option(self.principal) // String

  final def sourceArnAsScala: Option[String] = Option(self.sourceArn) // String

  final def sourceAccountAsScala: Option[String] = Option(self.sourceAccount) // String

  final def eventSourceTokenAsScala: Option[String] = Option(self.eventSourceToken) // String

  final def qualifierAsScala: Option[String] = Option(self.qualifier) // String

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionRequestOps {

  implicit def toAddPermissionRequestBuilderOps(v: AddPermissionRequest.Builder): AddPermissionRequestBuilderOps =
    new AddPermissionRequestBuilderOps(v)

  implicit def toAddPermissionRequestOps(v: AddPermissionRequest): AddPermissionRequestOps =
    new AddPermissionRequestOps(v)

}
