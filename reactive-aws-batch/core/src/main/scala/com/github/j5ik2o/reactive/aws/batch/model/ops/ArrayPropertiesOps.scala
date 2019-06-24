// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ArrayPropertiesBuilderOps(val self: ArrayProperties.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Int]): ArrayProperties.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

}

final class ArrayPropertiesOps(val self: ArrayProperties) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Int] = Option(self.size)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToArrayPropertiesOps {

  implicit def toArrayPropertiesBuilderOps(v: ArrayProperties.Builder): ArrayPropertiesBuilderOps =
    new ArrayPropertiesBuilderOps(v)

  implicit def toArrayPropertiesOps(v: ArrayProperties): ArrayPropertiesOps = new ArrayPropertiesOps(v)

}
