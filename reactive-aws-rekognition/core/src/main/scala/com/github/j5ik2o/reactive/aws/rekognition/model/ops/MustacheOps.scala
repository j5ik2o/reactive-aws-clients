// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class MustacheBuilderOps(val self: Mustache.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Boolean]): Mustache.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): Mustache.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class MustacheOps(val self: Mustache) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Boolean] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMustacheOps {

  implicit def toMustacheBuilderOps(v: Mustache.Builder): MustacheBuilderOps = new MustacheBuilderOps(v)

  implicit def toMustacheOps(v: Mustache): MustacheOps = new MustacheOps(v)

}
