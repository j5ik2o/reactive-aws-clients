// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ParameterDeclarationBuilderOps(val self: ParameterDeclaration.Builder) extends AnyVal {

  final def parameterKeyAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.parameterKey(v)
    }
  } // String

  final def defaultValueAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.defaultValue(v)
    }
  } // String

  final def parameterTypeAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.parameterType(v)
    }
  } // String

  final def noEchoAsScala(value: Option[Boolean]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.noEcho(v)
    }
  } // Boolean

  final def descriptionAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def parameterConstraintsAsScala(value: Option[ParameterConstraints]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.parameterConstraints(v)
    }
  } // ParameterConstraints

}

final class ParameterDeclarationOps(val self: ParameterDeclaration) extends AnyVal {

  final def parameterKeyAsScala: Option[String] = Option(self.parameterKey) // String

  final def defaultValueAsScala: Option[String] = Option(self.defaultValue) // String

  final def parameterTypeAsScala: Option[String] = Option(self.parameterType) // String

  final def noEchoAsScala: Option[Boolean] = Option(self.noEcho) // Boolean

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def parameterConstraintsAsScala: Option[ParameterConstraints] =
    Option(self.parameterConstraints) // ParameterConstraints

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterDeclarationOps {

  implicit def toParameterDeclarationBuilderOps(v: ParameterDeclaration.Builder): ParameterDeclarationBuilderOps =
    new ParameterDeclarationBuilderOps(v)

  implicit def toParameterDeclarationOps(v: ParameterDeclaration): ParameterDeclarationOps =
    new ParameterDeclarationOps(v)

}
