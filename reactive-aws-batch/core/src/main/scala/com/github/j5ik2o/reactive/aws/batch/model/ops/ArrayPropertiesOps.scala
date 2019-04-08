// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ArrayPropertiesBuilderOps(val self: ArrayProperties.Builder) extends AnyVal {

  final def sizeAsScala(value: Option[Int]): ArrayProperties.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  } // Int

}

final class ArrayPropertiesOps(val self: ArrayProperties) extends AnyVal {

  final def sizeAsScala: Option[Int] = Option(self.size) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToArrayPropertiesOps {

  implicit def toArrayPropertiesBuilderOps(v: ArrayProperties.Builder): ArrayPropertiesBuilderOps =
    new ArrayPropertiesBuilderOps(v)

  implicit def toArrayPropertiesOps(v: ArrayProperties): ArrayPropertiesOps = new ArrayPropertiesOps(v)

}
