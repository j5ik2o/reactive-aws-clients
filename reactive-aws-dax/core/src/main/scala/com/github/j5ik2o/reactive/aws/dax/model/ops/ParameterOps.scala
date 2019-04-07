// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterBuilderOps(val self: Parameter.Builder) extends AnyVal {

  final def withParameterNameAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterName(v)
    }
  } // String

  final def withParameterTypeAsScala(value: Option[ParameterType]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterType(v)
    }
  } // String

  final def withParameterValueAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterValue(v)
    }
  } // String

  final def withNodeTypeSpecificValuesAsScala(value: Option[Seq[NodeTypeSpecificValue]]): Parameter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeTypeSpecificValues(v.asJava)
    } // Seq[NodeTypeSpecificValue]
  }

  final def withDescriptionAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withSourceAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.source(v)
    }
  } // String

  final def withDataTypeAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.dataType(v)
    }
  } // String

  final def withAllowedValuesAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.allowedValues(v)
    }
  } // String

  final def withIsModifiableAsScala(value: Option[IsModifiable]): Parameter.Builder = {
    value.fold(self) { v =>
      self.isModifiable(v)
    }
  } // String

  final def withChangeTypeAsScala(value: Option[ChangeType]): Parameter.Builder = {
    value.fold(self) { v =>
      self.changeType(v)
    }
  } // String

}

final class ParameterOps(val self: Parameter) extends AnyVal {

  final def parameterNameAsScala: Option[String] = Option(self.parameterName) // String

  final def parameterTypeAsScala: Option[ParameterType] = Option(self.parameterType) // String

  final def parameterValueAsScala: Option[String] = Option(self.parameterValue) // String

  final def nodeTypeSpecificValuesAsScala: Option[Seq[NodeTypeSpecificValue]] =
    Option(self.nodeTypeSpecificValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[NodeTypeSpecificValue]

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def sourceAsScala: Option[String] = Option(self.source) // String

  final def dataTypeAsScala: Option[String] = Option(self.dataType) // String

  final def allowedValuesAsScala: Option[String] = Option(self.allowedValues) // String

  final def isModifiableAsScala: Option[IsModifiable] = Option(self.isModifiable) // String

  final def changeTypeAsScala: Option[ChangeType] = Option(self.changeType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterOps {

  implicit def toParameterBuilderOps(v: Parameter.Builder): ParameterBuilderOps = new ParameterBuilderOps(v)

  implicit def toParameterOps(v: Parameter): ParameterOps = new ParameterOps(v)

}
