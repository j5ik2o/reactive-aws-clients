// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DimensionBuilderOps(val self: Dimension.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Dimension.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Dimension.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class DimensionOps(val self: Dimension) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDimensionOps {

  implicit def toDimensionBuilderOps(v: Dimension.Builder): DimensionBuilderOps = new DimensionBuilderOps(v)

  implicit def toDimensionOps(v: Dimension): DimensionOps = new DimensionOps(v)

}
