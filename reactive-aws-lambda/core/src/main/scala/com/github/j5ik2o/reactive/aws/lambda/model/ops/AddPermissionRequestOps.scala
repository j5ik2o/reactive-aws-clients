// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddPermissionRequestBuilderOps(val self: AddPermissionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statementIdAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.statementId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.action(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.principal(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceArnAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.sourceArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceAccountAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.sourceAccount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceTokenAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.eventSourceToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.qualifier(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.revisionId(v) }
  }

}

final class AddPermissionRequestOps(val self: AddPermissionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statementIdAsScala: Option[String] = Option(self.statementId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionAsScala: Option[String] = Option(self.action)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalAsScala: Option[String] = Option(self.principal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceArnAsScala: Option[String] = Option(self.sourceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceAccountAsScala: Option[String] = Option(self.sourceAccount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceTokenAsScala: Option[String] = Option(self.eventSourceToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionRequestOps {

  implicit def toAddPermissionRequestBuilderOps(v: AddPermissionRequest.Builder): AddPermissionRequestBuilderOps =
    new AddPermissionRequestBuilderOps(v)

  implicit def toAddPermissionRequestOps(v: AddPermissionRequest): AddPermissionRequestOps =
    new AddPermissionRequestOps(v)

}
