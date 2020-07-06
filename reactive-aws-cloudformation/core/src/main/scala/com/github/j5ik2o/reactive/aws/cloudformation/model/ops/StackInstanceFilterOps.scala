// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackInstanceFilterBuilderOps(val self: StackInstanceFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[StackInstanceFilterName]): StackInstanceFilter.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala(value: Option[String]): StackInstanceFilter.Builder = {
    value.fold(self) { v => self.values(v) }
  }

}

final class StackInstanceFilterOps(val self: StackInstanceFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[StackInstanceFilterName] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala: Option[String] = Option(self.values)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackInstanceFilterOps {

  implicit def toStackInstanceFilterBuilderOps(v: StackInstanceFilter.Builder): StackInstanceFilterBuilderOps =
    new StackInstanceFilterBuilderOps(v)

  implicit def toStackInstanceFilterOps(v: StackInstanceFilter): StackInstanceFilterOps = new StackInstanceFilterOps(v)

}
