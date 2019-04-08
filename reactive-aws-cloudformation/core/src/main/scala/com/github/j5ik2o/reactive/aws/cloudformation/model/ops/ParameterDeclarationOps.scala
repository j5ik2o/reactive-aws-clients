// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ParameterDeclarationBuilderOps(val self: ParameterDeclaration.Builder) extends AnyVal {

  final def parameterKeyAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.parameterKey(v)
    }
  }

  final def defaultValueAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.defaultValue(v)
    }
  }

  final def parameterTypeAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.parameterType(v)
    }
  }

  final def noEchoAsScala(value: Option[Boolean]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.noEcho(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def parameterConstraintsAsScala(value: Option[ParameterConstraints]): ParameterDeclaration.Builder = {
    value.fold(self) { v =>
      self.parameterConstraints(v)
    }
  }

}

final class ParameterDeclarationOps(val self: ParameterDeclaration) extends AnyVal {

  final def parameterKeyAsScala: Option[String] = Option(self.parameterKey)

  final def defaultValueAsScala: Option[String] = Option(self.defaultValue)

  final def parameterTypeAsScala: Option[String] = Option(self.parameterType)

  final def noEchoAsScala: Option[Boolean] = Option(self.noEcho)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def parameterConstraintsAsScala: Option[ParameterConstraints] = Option(self.parameterConstraints)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterDeclarationOps {

  implicit def toParameterDeclarationBuilderOps(v: ParameterDeclaration.Builder): ParameterDeclarationBuilderOps =
    new ParameterDeclarationBuilderOps(v)

  implicit def toParameterDeclarationOps(v: ParameterDeclaration): ParameterDeclarationOps =
    new ParameterDeclarationOps(v)

}
