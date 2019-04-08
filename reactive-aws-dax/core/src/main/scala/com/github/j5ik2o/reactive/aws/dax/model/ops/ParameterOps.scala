// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterBuilderOps(val self: Parameter.Builder) extends AnyVal {

  final def parameterNameAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterName(v)
    }
  } // String

  final def parameterTypeAsScala(value: Option[ParameterType]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterType(v)
    }
  } // ParameterType

  final def parameterValueAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterValue(v)
    }
  } // String

  final def nodeTypeSpecificValuesAsScala(value: Option[Seq[NodeTypeSpecificValue]]): Parameter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeTypeSpecificValues(v.asJava)
    } // Seq[NodeTypeSpecificValue]
  }

  final def descriptionAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def sourceAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.source(v)
    }
  } // String

  final def dataTypeAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.dataType(v)
    }
  } // String

  final def allowedValuesAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.allowedValues(v)
    }
  } // String

  final def isModifiableAsScala(value: Option[IsModifiable]): Parameter.Builder = {
    value.fold(self) { v =>
      self.isModifiable(v)
    }
  } // IsModifiable

  final def changeTypeAsScala(value: Option[ChangeType]): Parameter.Builder = {
    value.fold(self) { v =>
      self.changeType(v)
    }
  } // ChangeType

}

final class ParameterOps(val self: Parameter) extends AnyVal {

  final def parameterNameAsScala: Option[String] = Option(self.parameterName) // String

  final def parameterTypeAsScala: Option[ParameterType] = Option(self.parameterType) // ParameterType

  final def parameterValueAsScala: Option[String] = Option(self.parameterValue) // String

  final def nodeTypeSpecificValuesAsScala: Option[Seq[NodeTypeSpecificValue]] =
    Option(self.nodeTypeSpecificValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[NodeTypeSpecificValue]

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def sourceAsScala: Option[String] = Option(self.source) // String

  final def dataTypeAsScala: Option[String] = Option(self.dataType) // String

  final def allowedValuesAsScala: Option[String] = Option(self.allowedValues) // String

  final def isModifiableAsScala: Option[IsModifiable] = Option(self.isModifiable) // IsModifiable

  final def changeTypeAsScala: Option[ChangeType] = Option(self.changeType) // ChangeType

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterOps {

  implicit def toParameterBuilderOps(v: Parameter.Builder): ParameterBuilderOps = new ParameterBuilderOps(v)

  implicit def toParameterOps(v: Parameter): ParameterOps = new ParameterOps(v)

}
