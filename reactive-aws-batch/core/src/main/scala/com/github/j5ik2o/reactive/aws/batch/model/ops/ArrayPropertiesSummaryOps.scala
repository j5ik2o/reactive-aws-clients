// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ArrayPropertiesSummaryBuilderOps(val self: ArrayPropertiesSummary.Builder) extends AnyVal {

  final def sizeAsScala(value: Option[Int]): ArrayPropertiesSummary.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  final def indexAsScala(value: Option[Int]): ArrayPropertiesSummary.Builder = {
    value.fold(self) { v =>
      self.index(v)
    }
  }

}

final class ArrayPropertiesSummaryOps(val self: ArrayPropertiesSummary) extends AnyVal {

  final def sizeAsScala: Option[Int] = Option(self.size)

  final def indexAsScala: Option[Int] = Option(self.index)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToArrayPropertiesSummaryOps {

  implicit def toArrayPropertiesSummaryBuilderOps(v: ArrayPropertiesSummary.Builder): ArrayPropertiesSummaryBuilderOps =
    new ArrayPropertiesSummaryBuilderOps(v)

  implicit def toArrayPropertiesSummaryOps(v: ArrayPropertiesSummary): ArrayPropertiesSummaryOps =
    new ArrayPropertiesSummaryOps(v)

}
