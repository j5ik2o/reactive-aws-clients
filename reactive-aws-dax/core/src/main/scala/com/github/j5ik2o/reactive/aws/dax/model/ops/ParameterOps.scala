// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterBuilderOps(val self: Parameter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterNameAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v => self.parameterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterTypeAsScala(value: Option[ParameterType]): Parameter.Builder = {
    value.fold(self) { v => self.parameterType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterValueAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v => self.parameterValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeTypeSpecificValuesAsScala(value: Option[Seq[NodeTypeSpecificValue]]): Parameter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodeTypeSpecificValues(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v => self.source(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataTypeAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v => self.dataType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedValuesAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v => self.allowedValues(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isModifiableAsScala(value: Option[IsModifiable]): Parameter.Builder = {
    value.fold(self) { v => self.isModifiable(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeTypeAsScala(value: Option[ChangeType]): Parameter.Builder = {
    value.fold(self) { v => self.changeType(v) }
  }

}

final class ParameterOps(val self: Parameter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterNameAsScala: Option[String] = Option(self.parameterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterTypeAsScala: Option[ParameterType] = Option(self.parameterType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterValueAsScala: Option[String] = Option(self.parameterValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeTypeSpecificValuesAsScala: Option[Seq[NodeTypeSpecificValue]] =
    Option(self.nodeTypeSpecificValues).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceAsScala: Option[String] = Option(self.source)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataTypeAsScala: Option[String] = Option(self.dataType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedValuesAsScala: Option[String] = Option(self.allowedValues)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isModifiableAsScala: Option[IsModifiable] = Option(self.isModifiable)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeTypeAsScala: Option[ChangeType] = Option(self.changeType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterOps {

  implicit def toParameterBuilderOps(v: Parameter.Builder): ParameterBuilderOps = new ParameterBuilderOps(v)

  implicit def toParameterOps(v: Parameter): ParameterOps = new ParameterOps(v)

}
