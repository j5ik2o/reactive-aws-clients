// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class OutputBuilderOps(val self: Output.Builder) extends AnyVal {

  final def outputKeyAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.outputKey(v)
    }
  } // String

  final def outputValueAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.outputValue(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def exportNameAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.exportName(v)
    }
  } // String

}

final class OutputOps(val self: Output) extends AnyVal {

  final def outputKeyAsScala: Option[String] = Option(self.outputKey) // String

  final def outputValueAsScala: Option[String] = Option(self.outputValue) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def exportNameAsScala: Option[String] = Option(self.exportName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputOps {

  implicit def toOutputBuilderOps(v: Output.Builder): OutputBuilderOps = new OutputBuilderOps(v)

  implicit def toOutputOps(v: Output): OutputOps = new OutputOps(v)

}
