// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DimensionFilterBuilderOps(val self: DimensionFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DimensionFilter.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): DimensionFilter.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class DimensionFilterOps(val self: DimensionFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDimensionFilterOps {

  implicit def toDimensionFilterBuilderOps(v: DimensionFilter.Builder): DimensionFilterBuilderOps =
    new DimensionFilterBuilderOps(v)

  implicit def toDimensionFilterOps(v: DimensionFilter): DimensionFilterOps = new DimensionFilterOps(v)

}
