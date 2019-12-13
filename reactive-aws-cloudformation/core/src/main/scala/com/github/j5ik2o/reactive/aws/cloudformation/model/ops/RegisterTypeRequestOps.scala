// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class RegisterTypeRequestBuilderOps(val self: RegisterTypeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[RegistryType]): RegisterTypeRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): RegisterTypeRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaHandlerPackageAsScala(value: Option[String]): RegisterTypeRequest.Builder = {
    value.fold(self) { v =>
      self.schemaHandlerPackage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingConfigAsScala(value: Option[LoggingConfig]): RegisterTypeRequest.Builder = {
    value.fold(self) { v =>
      self.loggingConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala(value: Option[String]): RegisterTypeRequest.Builder = {
    value.fold(self) { v =>
      self.executionRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): RegisterTypeRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class RegisterTypeRequestOps(val self: RegisterTypeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[RegistryType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaHandlerPackageAsScala: Option[String] = Option(self.schemaHandlerPackage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingConfigAsScala: Option[LoggingConfig] = Option(self.loggingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTypeRequestOps {

  implicit def toRegisterTypeRequestBuilderOps(v: RegisterTypeRequest.Builder): RegisterTypeRequestBuilderOps =
    new RegisterTypeRequestBuilderOps(v)

  implicit def toRegisterTypeRequestOps(v: RegisterTypeRequest): RegisterTypeRequestOps = new RegisterTypeRequestOps(v)

}
