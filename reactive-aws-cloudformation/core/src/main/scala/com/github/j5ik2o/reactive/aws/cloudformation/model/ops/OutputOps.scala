// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class OutputBuilderOps(val self: Output.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputKeyAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v => self.outputKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputValueAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v => self.outputValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportNameAsScala(value: Option[String]): Output.Builder = {
    value.fold(self) { v => self.exportName(v) }
  }

}

final class OutputOps(val self: Output) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputKeyAsScala: Option[String] = Option(self.outputKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputValueAsScala: Option[String] = Option(self.outputValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportNameAsScala: Option[String] = Option(self.exportName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputOps {

  implicit def toOutputBuilderOps(v: Output.Builder): OutputBuilderOps = new OutputBuilderOps(v)

  implicit def toOutputOps(v: Output): OutputOps = new OutputOps(v)

}
