// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class SelectParametersBuilderOps(val self: SelectParameters.Builder) extends AnyVal {

  final def withInputSerializationAsScala(value: Option[InputSerialization]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.inputSerialization(v)
    }
  } // InputSerialization

  final def withExpressionTypeAsScala(value: Option[ExpressionType]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.expressionType(v)
    }
  } // String

  final def withExpressionAsScala(value: Option[String]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.expression(v)
    }
  } // String

  final def withOutputSerializationAsScala(value: Option[OutputSerialization]): SelectParameters.Builder = {
    value.fold(self) { v =>
      self.outputSerialization(v)
    }
  } // OutputSerialization

}

final class SelectParametersOps(val self: SelectParameters) extends AnyVal {

  final def inputSerializationAsScala: Option[InputSerialization] =
    Option(self.inputSerialization) // InputSerialization

  final def expressionTypeAsScala: Option[ExpressionType] = Option(self.expressionType) // String

  final def expressionAsScala: Option[String] = Option(self.expression) // String

  final def outputSerializationAsScala: Option[OutputSerialization] =
    Option(self.outputSerialization) // OutputSerialization

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSelectParametersOps {

  implicit def toSelectParametersBuilderOps(v: SelectParameters.Builder): SelectParametersBuilderOps =
    new SelectParametersBuilderOps(v)

  implicit def toSelectParametersOps(v: SelectParameters): SelectParametersOps = new SelectParametersOps(v)

}
