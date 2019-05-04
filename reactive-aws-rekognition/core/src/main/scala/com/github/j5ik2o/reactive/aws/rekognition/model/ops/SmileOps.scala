// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SmileBuilderOps(val self: Smile.Builder) extends AnyVal {

  final def valueAsScala(value: Option[Boolean]): Smile.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): Smile.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class SmileOps(val self: Smile) extends AnyVal {

  final def valueAsScala: Option[Boolean] = Option(self.value)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSmileOps {

  implicit def toSmileBuilderOps(v: Smile.Builder): SmileBuilderOps = new SmileBuilderOps(v)

  implicit def toSmileOps(v: Smile): SmileOps = new SmileOps(v)

}
