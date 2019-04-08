// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class SelectParametersBuilderOps(val self: SelectParameters.Builder) extends AnyVal {

  final def inputSerializationAsScala(value: Option[InputSerialization]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.inputSerialization(v)
    }
  }

  final def expressionTypeAsScala(value: Option[ExpressionType]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.expressionType(v)
    }
  }

  final def expressionAsScala(value: Option[String]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.expression(v)
    }
  }

  final def outputSerializationAsScala(value: Option[OutputSerialization]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.outputSerialization(v)
    }
  }

}

final class SelectParametersOps(val self: SelectParameters) extends AnyVal {

  final def inputSerializationAsScala: Option[InputSerialization] = Option(self.inputSerialization)

  final def expressionTypeAsScala: Option[ExpressionType] = Option(self.expressionType)

  final def expressionAsScala: Option[String] = Option(self.expression)

  final def outputSerializationAsScala: Option[OutputSerialization] = Option(self.outputSerialization)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSelectParametersOps {

  implicit def toSelectParametersBuilderOps(v: SelectParameters.Builder): SelectParametersBuilderOps =
    new SelectParametersBuilderOps(v)

  implicit def toSelectParametersOps(v: SelectParameters): SelectParametersOps = new SelectParametersOps(v)

}
