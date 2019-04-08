// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ScaleBuilderOps(val self: Scale.Builder) extends AnyVal {

  final def valueAsScala(value: Option[Double]): Scale.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  final def unitAsScala(value: Option[ScaleUnit]): Scale.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  }

}

final class ScaleOps(val self: Scale) extends AnyVal {

  final def valueAsScala: Option[Double] = Option(self.value)

  final def unitAsScala: Option[ScaleUnit] = Option(self.unit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScaleOps {

  implicit def toScaleBuilderOps(v: Scale.Builder): ScaleBuilderOps = new ScaleBuilderOps(v)

  implicit def toScaleOps(v: Scale): ScaleOps = new ScaleOps(v)

}
