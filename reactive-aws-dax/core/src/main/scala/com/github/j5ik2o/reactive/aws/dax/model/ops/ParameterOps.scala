// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterBuilderOps(val self: Parameter.Builder) extends AnyVal {

  final def parameterNameAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterName(v)
    }
  }

  final def parameterTypeAsScala(value: Option[ParameterType]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterType(v)
    }
  }

  final def parameterValueAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterValue(v)
    }
  }

  final def nodeTypeSpecificValuesAsScala(value: Option[Seq[NodeTypeSpecificValue]]): Parameter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeTypeSpecificValues(v.asJava)
    }
  }

  final def descriptionAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def sourceAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.source(v)
    }
  }

  final def dataTypeAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.dataType(v)
    }
  }

  final def allowedValuesAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.allowedValues(v)
    }
  }

  final def isModifiableAsScala(value: Option[IsModifiable]): Parameter.Builder = {
    value.fold(self) { v =>
      self.isModifiable(v)
    }
  }

  final def changeTypeAsScala(value: Option[ChangeType]): Parameter.Builder = {
    value.fold(self) { v =>
      self.changeType(v)
    }
  }

}

final class ParameterOps(val self: Parameter) extends AnyVal {

  final def parameterNameAsScala: Option[String] = Option(self.parameterName)

  final def parameterTypeAsScala: Option[ParameterType] = Option(self.parameterType)

  final def parameterValueAsScala: Option[String] = Option(self.parameterValue)

  final def nodeTypeSpecificValuesAsScala: Option[Seq[NodeTypeSpecificValue]] =
    Option(self.nodeTypeSpecificValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def sourceAsScala: Option[String] = Option(self.source)

  final def dataTypeAsScala: Option[String] = Option(self.dataType)

  final def allowedValuesAsScala: Option[String] = Option(self.allowedValues)

  final def isModifiableAsScala: Option[IsModifiable] = Option(self.isModifiable)

  final def changeTypeAsScala: Option[ChangeType] = Option(self.changeType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterOps {

  implicit def toParameterBuilderOps(v: Parameter.Builder): ParameterBuilderOps = new ParameterBuilderOps(v)

  implicit def toParameterOps(v: Parameter): ParameterOps = new ParameterOps(v)

}
