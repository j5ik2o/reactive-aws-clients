// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class AgeRangeBuilderOps(val self: AgeRange.Builder) extends AnyVal {

  final def lowAsScala(value: Option[Int]): AgeRange.Builder = {
    value.fold(self) { v =>
      self.low(v)
    }
  }

  final def highAsScala(value: Option[Int]): AgeRange.Builder = {
    value.fold(self) { v =>
      self.high(v)
    }
  }

}

final class AgeRangeOps(val self: AgeRange) extends AnyVal {

  final def lowAsScala: Option[Int] = Option(self.low)

  final def highAsScala: Option[Int] = Option(self.high)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAgeRangeOps {

  implicit def toAgeRangeBuilderOps(v: AgeRange.Builder): AgeRangeBuilderOps = new AgeRangeBuilderOps(v)

  implicit def toAgeRangeOps(v: AgeRange): AgeRangeOps = new AgeRangeOps(v)

}
