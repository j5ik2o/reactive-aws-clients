// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class OutputBuilderOps(val self: Output.Builder) extends AnyVal {

  final def outputKeyAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.outputKey(v)
    }
  }

  final def outputValueAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.outputValue(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def exportNameAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v =>
      self.exportName(v)
    }
  }

}

final class OutputOps(val self: Output) extends AnyVal {

  final def outputKeyAsScala: Option[String] = Option(self.outputKey)

  final def outputValueAsScala: Option[String] = Option(self.outputValue)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def exportNameAsScala: Option[String] = Option(self.exportName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputOps {

  implicit def toOutputBuilderOps(v: Output.Builder): OutputBuilderOps = new OutputBuilderOps(v)

  implicit def toOutputOps(v: Output): OutputOps = new OutputOps(v)

}
